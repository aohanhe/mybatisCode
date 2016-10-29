package swallow.base.dao;

/**
 * 排序类型
 * @author aohanhe
 *
 */
public enum OrderType {
	ASC("asc"),DESC("desc");
	
	private final String value;
	OrderType(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}

}
