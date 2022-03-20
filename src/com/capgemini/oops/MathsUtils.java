package com.capgemini.oops;

public class MathsUtils {
	public void add(byte x, byte y){
        System.out.println("add(byte x,byte y)="+(x+y));
    }
    public void add(short x, short y){
        System.out.println("add(short x,short y)="+(x+y));
    }
    public void add(int x, int y){
        System.out.println("add(int x,int y)="+(x+y));
    }
    public void add(Integer x, Integer y){
        System.out.println("add(Integer x,Integer y)="+(x+y));
    }
    public void add(long x, long y){
        System.out.println("add(long x,long y)="+(x+y));
    }
    public void add(int... x){
        int sum = 0;
        for(int i : x)
            sum += i;
        System.out.println("add(int... x)="+sum);
    }
}
