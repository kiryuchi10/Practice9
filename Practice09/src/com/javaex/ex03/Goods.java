package com.javaex.ex03;

public class Goods {

	@Override
	public String toString() {
		return name+"(가격:"+price +")"+"이 "+count+"개 입고되었습니다";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void draw() {
		System.out.println("제품:" +  name + 
				           " 가격:" + price + 
				           " 갯수:" + count
				               );
	}
	public Goods() {
	}
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	private String name;
	private int price;
	private int count;
	
	

	

}
