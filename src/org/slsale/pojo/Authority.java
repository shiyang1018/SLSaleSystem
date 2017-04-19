package org.slsale.pojo;

import java.util.Date;

public class Authority extends Base {

	             
	private Integer roleId;
	private Integer functionId;
	private Integer userTypeId;
	private Date creationTime;
	private String createdBy;
	public Authority() {
		super();
	}
	public Authority(Integer roleId, Integer functionId, Integer userTypeId,
			Date creationTime, String createdBy) {
		super();
		this.roleId = roleId;
		this.functionId = functionId;
		this.userTypeId = userTypeId;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getFunctionId() {
		return functionId;
	}
	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}
	public Integer getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
