package swallow.base.dao;
/**
 * 查询条件
 * @author aohanhe
 *
 */
public class Query<T extends Enum> {
	/**
	 * 操作类型
	 * @author longchuang
	 *
	 */
	public enum Opt{
		eq("="),lg(">"),le("<"),lgq(">="),leq("<="),like("like"),nq("<>");
		private String value;
		
		Opt(String value) {
			this.value = value;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.value ;
		}
	}
	
	private T  key;
	private Opt opt;
	private Object value;
	
	public T getKey() {
		return key;
	}
	
	public String getKeyName(){
		return key.toString();
	}

	public Opt getOpt() {
		return opt;
	}

	public Object getValue() {
		return value;
	}
	
	

	
	
	public Query(T key,Opt opt,Object value){
		this.key =key;
		this.opt = opt;
		this.value = value;
	}
	
	public Query(T key,Object value){
		this.key =key;
		this.opt = Opt.eq;
		this.value = value;
	}
}
