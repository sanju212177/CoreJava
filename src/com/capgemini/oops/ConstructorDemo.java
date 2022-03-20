package com.capgemini.oops;

public class ConstructorDemo {
	private int i,j,k;
	ConstructorDemo(){
		
	}
	
	ConstructorDemo(int i){
		this.i=i;
	}
	
	ConstructorDemo(int i,int j){
		this(i);
		this.j=j;
	}
	
	ConstructorDemo(int i,int j,int k){
		this(i,j);
		this.k=k;
	}

	@Override
	public String toString() {
		return "ConstructorDemo [i=" + i + ", j=" + j + ", k=" + k + "]";
	}	
}
