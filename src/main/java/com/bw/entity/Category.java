package com.bw.entity;


public class Category implements java.io.Serializable {

	//columns START
	private Integer cid;
	private String cname;
	private String cdesc;
	//columns END
	public Category(){


		this.cid=cid;

	public void setCid(Integer cid){
		this.cid=cid;
	}
	public Integer getCid(){
		return cid;
	}

	public void setCname(String cname){
		this.cname=cname;
	}
	public String getCname(){
		return cname;
	}

	public void setCdesc(String cdesc){
		this.cdesc=cdesc;
	}
	public String getCdesc(){
		return cdesc;
	}
}
