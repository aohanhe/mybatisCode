package swallow.base.dao;

/**
 * 数据分页器
 * @author aohanhe
 *
 */
public class PagerInfo {
	private int pageSize;
	private int pageCount;
	private int currentPage;
	private int totalRow;
	
	/**
	 * 构建分页对象
	 * @param pageSize 每页大小
	 * @param currentPage 取得的页面
	 */
	public PagerInfo(int pageSize,int currentPage){
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	
	
	
}
