package org.slsale.pojo;

import java.util.Date;

public class Role extends Base {

	private Integer id;
	private String roleCode;
	private String roleName;
	private Date createDate;
	private Integer isStart;
	private String createdBy;
	public Role() {
		super();
	}
	public Role(Integer id, String roleCode, String roleName, Date createDate,
			Integer isStart, String createdBy) {
		super();
		this.id = id;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.createDate = createDate;
		this.isStart = isStart;
		this.createdBy = createdBy;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getIsStart() {
		return isStart;
	}
	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
