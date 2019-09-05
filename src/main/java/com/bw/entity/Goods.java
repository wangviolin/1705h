package com.bw.entity;


public class Goods implements java.io.Serializable {

	//columns START
	private Integer gid;
	private String gname;
	private String price;
	private Integer cid;
	private Integer bid;
	
	private String cname;
	private String bname;
	private String cdesc;
	
	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	//columns END
	public Goods(){
	}
	public Goods(Integer gid,String gname,String price,Integer cid,Integer bid){
		this.gid=gid;		this.gname=gname;		this.price=price;		this.cid=cid;		this.bid=bid;	}

	public void setGid(Integer gid){
		this.gid=gid;
	}
	public Integer getGid(){
		return gid;
	}

	public void setGname(String gname){
		this.gname=gname;
	}
	public String getGname(){
		return gname;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return price;
	}

	public void setCid(Integer cid){
		this.cid=cid;
	}
	public Integer getCid(){
		return cid;
	}

	public void setBid(Integer bid){
		this.bid=bid;
	}
	public Integer getBid(){
		return bid;
	}
}

