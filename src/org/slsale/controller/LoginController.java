package org.slsale.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.slsale.common.Constants;
import org.slsale.common.RedisAPI;
import org.slsale.pojo.Authority;
import org.slsale.pojo.Function;
import org.slsale.pojo.Menu;
import org.slsale.pojo.User;
import org.slsale.service.function.FunctionService;
import org.slsale.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController{
	private Logger logger = Logger.getLogger(LoginController.class);
	@Resource
	private UserService userService;
	@Resource
	private FunctionService functionService;
	@Resource
	private RedisAPI redisAPI;
	
	
	@RequestMapping("/main.html")
	public ModelAndView main(HttpSession session){
		logger.debug("main==============");
		//menu list
		 User user = this.getCurrentUser();
		 List<Menu> mList =null;
		 if(user != null){
			 Map<String,Object> model = new HashMap<String, Object>();
			 model.put("user", user);
			 
			 //redis里有没有数据  key:menuList+roleID  value:mList
			 if(!redisAPI.exist("menuList"+user.getRoleId())){//没有对应的菜单
				//根据当前用户获取菜单列表
				 mList = getFuncByCurrentUser(user.getRoleId());
				 //json
				 if(mList!=null){
					 JSONArray jsonArray = JSONArray.fromObject(mList);
					 String jsonString= jsonArray.toString();
					 logger.debug("jsonString=============>"+jsonString);
					 model.put("mList", jsonString);
					 redisAPI.set("menuList"+user.getRoleId(), jsonString);
				 }
			 
			 }else {//redis里有数据，直接从redis里取
				String redisMenuListKeyString =  redisAPI.get("menuList"+user.getRoleId());
				logger.debug("redisMenuListKeyString====================="+redisMenuListKeyString);
				if(redisMenuListKeyString !=null && !redisMenuListKeyString.equals("")){
					model.put("mList", redisMenuListKeyString);
				}else {
					return new ModelAndView("redirect:/");
				}
			 }
			 session.setAttribute(Constants.SESSION_BASE_MODEL, model);
			 
			 return new ModelAndView("main",model);
		 }
		return new ModelAndView("redirect:/");
	}
	
	//根据当前用户角色id获取对应的菜单
	protected List<Menu> getFuncByCurrentUser(int roleId){
		List<Menu> menuList = new ArrayList<Menu>();
		Authority authority = new Authority();
		authority.setRoleId(roleId);
		try {
			List<Function> mList = functionService.getMainFunctionList(authority);
			if(mList !=null){
				for(Function function :mList ){
					Menu menu = new Menu();
					menu.setMainMenu(function);
					function.setRoleId(roleId);
				List<Function> subList = functionService.getSubFunctinList(function);
					if(subList !=null){
						menu.setSubMenu(subList);
					}
					menuList.add(menu);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return menuList;
	}
	
	@RequestMapping("/login.html")
	@ResponseBody
	public Object login(HttpSession session,@RequestParam String user){
		if(user == null || user.equals("")){
			return "nodata";
		}else{
			JSONObject userObject = JSONObject.fromObject(user);
			User userObj = (User) userObject.toBean(userObject,User.class);
			try {
				if(userService.loginCodeIsExit(userObj)==0){
					return "nologincode";
				}else {
					User _user = userService.getLoginUser(userObj);
					if(_user != null){//登录成功
						//当前用户存到session中
						session.setAttribute(Constants.SESSION_USER,_user);
						//更新当前用户登录的lastLoginTime
						User updateLoginTimeUser = new User();
						updateLoginTimeUser.setId(_user.getId());
						updateLoginTimeUser.setLastLoginTime(new Date());
						userService.modifyUser(updateLoginTimeUser);
						updateLoginTimeUser = null;
						return "success";
					}else {//密码错误
						return "pwderror";
					}
				}
			} catch (Exception e) {
					return "failed";
			}
			
			
		
		}
	}

	@RequestMapping("/logout.html")
	public String logout(HttpSession session){
		session.removeAttribute(Constants.SESSION_USER);
		session.invalidate();
		this.setCurrentUser(null);
		return "index";
	}



}
