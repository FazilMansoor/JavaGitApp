package com.lti.demos;

public class Product {
	int pid;
	String PrdName;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", PrdName=" + PrdName + "]";
	}
	public Product(int pid, String prdName) {
		super();
		this.pid = pid;
		PrdName = prdName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPrdName() {
		return PrdName;
	}
	public void setPrdName(String prdName) {
		PrdName = prdName;
	}
}
