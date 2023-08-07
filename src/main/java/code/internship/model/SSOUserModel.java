package code.internship.model;
import javax.validation.constraints.NotBlank;


public class SSOUserModel {
	
	@NotBlank
	private String ssoType;
	@NotBlank
	private String systemId;
	@NotBlank
	private String systemName;
	@NotBlank
	private String systemTransactions;
	@NotBlank
	private String systemPrivileges;
	@NotBlank
	private String systemUserGroup;
	@NotBlank
	private String systemLocationGroup;
	@NotBlank
	private String userId;
	@NotBlank
	private String userFullName;
	@NotBlank
	private String userRdOfficeCode;
	@NotBlank
	private String userOfficeCode;
	@NotBlank
	private String clientLocation;
	@NotBlank
	private String locationMachineNumber;
	@NotBlank
	private String tokenId;

	public SSOUserModel() {
		super();
	}

	public SSOUserModel(String ssoType, String systemId, String systemName, String systemTransactions, String systemPrivileges,
			String systemUserGroup, String systemLocationGroup, String userId, String userFullName,
			String userRdOfficeCode, String userOfficeCode, String clientLocation, String locationMachineNumber,
			String tokenId) {
		super();
		this.ssoType = ssoType;
		this.systemId = systemId;
		this.systemName = systemName;
		this.systemTransactions = systemTransactions;
		this.systemPrivileges = systemPrivileges;
		this.systemUserGroup = systemUserGroup;
		this.systemLocationGroup = systemLocationGroup;
		this.userId = userId;
		this.userFullName = userFullName;
		this.userRdOfficeCode = userRdOfficeCode;
		this.userOfficeCode = userOfficeCode;
		this.clientLocation = clientLocation;
		this.locationMachineNumber = locationMachineNumber;
		this.tokenId = tokenId;
	}

	public String getSsoType() {
		return ssoType;
	}

	public void setSsoType(String ssoType) {
		this.ssoType = ssoType;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemTransactions() {
		return systemTransactions;
	}

	public void setSystemTransactions(String systemTransactions) {
		this.systemTransactions = systemTransactions;
	}

	public String getSystemPrivileges() {
		return systemPrivileges;
	}

	public void setSystemPrivileges(String systemPrivileges) {
		this.systemPrivileges = systemPrivileges;
	}

	public String getSystemUserGroup() {
		return systemUserGroup;
	}

	public void setSystemUserGroup(String systemUserGroup) {
		this.systemUserGroup = systemUserGroup;
	}

	public String getSystemLocationGroup() {
		return systemLocationGroup;
	}

	public void setSystemLocationGroup(String systemLocationGroup) {
		this.systemLocationGroup = systemLocationGroup;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserRdOfficeCode() {
		return userRdOfficeCode;
	}

	public void setUserRdOfficeCode(String userRdOfficeCode) {
		this.userRdOfficeCode = userRdOfficeCode;
	}

	public String getUserOfficeCode() {
		return userOfficeCode;
	}

	public void setUserOfficeCode(String userOfficeCode) {
		this.userOfficeCode = userOfficeCode;
	}

	public String getClientLocation() {
		return clientLocation;
	}

	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}

	public String getLocationMachineNumber() {
		return locationMachineNumber;
	}

	public void setLocationMachineNumber(String locationMachineNumber) {
		this.locationMachineNumber = locationMachineNumber;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
