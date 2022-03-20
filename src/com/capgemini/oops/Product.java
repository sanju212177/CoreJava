package com.capgemini.oops;

public class Product {
	private Integer pid;
	private String pname;
	private Double price;
	private static int productcount;
	{
		productcount++;
	}
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public static int getProductcount() {
		return productcount;
	}
	public static void setProductcount(int productcount) {
		Product.productcount = productcount;
	}
	public Product(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
}
