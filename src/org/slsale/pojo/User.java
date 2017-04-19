package org.slsale.pojo;

import java.util.Date;

public class User extends Base {
	private String loginCode;
	private String password;
	private String password2;
	private String userName;
	private String sex;
	private Date birthday;
	private String cardType;
	private String cardTypeName;
	private String idCard;
	private String country;
	private String mobile;
	private String email;
	private String userAddress;
	private String postCode;
	private Date createTime;
	private Integer referId;
	private String referCode;
	private Integer roleId;
	private String roleName;
	private String userType;
	private String userTypeName;
	private Integer isStart;
	private Date lastUpdateTime;
	private Date lastLoginTime;
	private String bankAccount;
	private String bankName;
	private String accountHolder;
	private String idCardPicPath;
	private String bankPicPath;
	public User() {
		super();
	}
	public User(String loginCode, String password, String password2,
			String userName, String sex, Date birthday, String cardType,
			String cardTypeName, String idCard, String country, String mobile,
			String email, String userAddress, String postCode, Date createTime,
			Integer referId, String referCode, Integer roleId, String roleName,
			String userType, String userTypeName, Integer isStart,
			Date lastUpdateTime, Date lastLoginTime, String bankAccount,
			String bankName, String accountHolder, String idCardPicPath,
			String bankPicPath) {
		super();
		this.loginCode = loginCode;
		this.password = password;
		this.password2 = password2;
		this.userName = userName;
		this.sex = sex;
		this.birthday = birthday;
		this.cardType = cardType;
		this.cardTypeName = cardTypeName;
		this.idCard = idCard;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.userAddress = userAddress;
		this.postCode = postCode;
		this.createTime = createTime;
		this.referId = referId;
		this.referCode = referCode;
		this.roleId = roleId;
		this.roleName = roleName;
		this.userType = userType;
		this.userTypeName = userTypeName;
		this.isStart = isStart;
		this.lastUpdateTime = lastUpdateTime;
		this.lastLoginTime = lastLoginTime;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.accountHolder = accountHolder;
		this.idCardPicPath = idCardPicPath;
		this.bankPicPath = bankPicPath;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardTypeName() {
		return cardTypeName;
	}
	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getReferId() {
		return referId;
	}
	public void setReferId(Integer referId) {
		this.referId = referId;
	}
	public String getReferCode() {
		return referCode;
	}
	public void setReferCode(String referCode) {
		this.referCode = referCode;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	public Integer getIsStart() {
		return isStart;
	}
	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getIdCardPicPath() {
		return idCardPicPath;
	}
	public void setIdCardPicPath(String idCardPicPath) {
		this.idCardPicPath = idCardPicPath;
	}
	public String getBankPicPath() {
		return bankPicPath;
	}
	public void setBankPicPath(String bankPicPath) {
		this.bankPicPath = bankPicPath;
	}
	
}
