package test.dao.generate.entity;
/**
 * 用户的实体类
 * @author aohanhe
 *
 */
public class UserInfoEntity {
	private Long id;   //UserID
	private String name; //用户名称
	private String modile; //用户手机
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
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModile() {
		return modile;
	}
	public void setModile(String modile) {
		this.modile = modile;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
		
}
