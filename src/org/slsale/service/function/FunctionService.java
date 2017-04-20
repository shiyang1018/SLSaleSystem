package org.slsale.service.function;

import java.util.List;

import org.slsale.pojo.Authority;
import org.slsale.pojo.Function;

public interface FunctionService {
	//获得主菜单
		public List<Function> getMainFunctionList(Authority authority)throws Exception;


		//获得子菜单列表
		public List<Function> getSubFunctinList(Function function)throws Exception;


}
