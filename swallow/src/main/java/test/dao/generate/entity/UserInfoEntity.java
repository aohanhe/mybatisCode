package test.dao.generate.entity;
/**
 * 用户的实体类 (由代码生成)
 * @author aohanhe
 *
 */
public class UserInfoEntity {
	public enum UserInfoEntityKey{
		id("tbUser.id"),
		name("tbUser.name"),
		mobile("tbUser.mobile"),
		companyId("tbUserCompany.companyId"),
		companyName("tbUserCompany.companyName")
		;
		
		private final String value;
		
		UserInfoEntityKey(String value){
			this.value = value;
		}
		
		@Override
		public java.lang.String toString() {
			return this.value;
		}
				
	}
	
	
	private Long id;   //UserID
	private String name; //用户名称
	private String mobile; //用户手机
	private Long companyId; //公司ID
	private String companyName; //公司名
	
	/**
	 * 构造函数
	 */
	public UserInfoEntity(){
		
	}
	
	/**
	 * 取得用户ID值
	 * @return
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设定用户id值
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String modile) {
		this.mobile = modile;
	}
	public Long getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
		
}
