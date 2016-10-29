package swallow.base.exception;
/**
 * Swallow异常
 * @author aohanhe
 *
 */
public class SwallowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -367145721698979829L;
	
	/**
	 * 构造异常
	 * @param msg 异常消息
	 * @param ex  内置异常
	 */
	public SwallowException(String msg,Exception ex) {
		super(msg,ex);
	}
	/**
	 * 构造异常
	 * @param msg 异常消息
	 */
	public SwallowException(String msg){
		super(msg);
	}

}
