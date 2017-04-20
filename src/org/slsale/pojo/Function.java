package org.slsale.pojo;

import java.util.Date;

public class Function extends Base {

	private Integer id;
	private String functionName;
	private String funcUrl;
	private Integer parentId;
	private Date creationTime;
	private Integer roleId;
	public Function() {
		super();
	}
	public Function(Integer id, String functionName, String funcUrl,
			Integer parentId, Date creationTime, Integer roleId) {
		super();
		this.id = id;
		this.functionName = functionName;
		this.funcUrl = funcUrl;
		this.parentId = parentId;
		this.creationTime = creationTime;
		this.roleId = roleId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFuncUrl() {
		return funcUrl;
	}
	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
}
