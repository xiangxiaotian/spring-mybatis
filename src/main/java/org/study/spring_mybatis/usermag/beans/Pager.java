package org.study.spring_mybatis.usermag.beans;

import java.util.List;

public class Pager {
	private int page;
	private int rows;
	private int totalRows;
	private int totalPage;
	private List<UserInfo> data;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public List<UserInfo> getData() {
		return data;
	}
	public void setData(List<UserInfo> data) {
		this.data = data;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalPage = (totalRows+rows-1)/rows;
		this.totalRows = totalRows;
	}
	public int getTotalPage() {
		return totalPage;
	}
	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", totalRows=" + totalRows + ", totalPage=" + totalPage
				+ ", data=" + data + "]";
	}
	
	
}
