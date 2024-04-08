package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.ex02.Friend;


public class GoodsApp {

    public static void main(String[] args) {
    	List<Goods> rList = new ArrayList<Goods>();
    	Scanner sc= new Scanner(System.in);
    	String input=null;
    	System.out.println("상품을 입력해주세요");
    	for(int i=0;i<1;i++) {
    		if(input!="q")
    		{
    		input=sc.next();
    		String [] arr=new String[20];
    		arr=input.split(",");
    		String name=arr[0];
    		int price=Integer.parseInt(arr[1]);
    		int count=Integer.parseInt(arr[2]);
    		//System.out.println(name);
    		//System.out.println(price);
    		//System.out.println(count);
    		Goods f=new Goods(name,price,count);
    		rList.add(f);
      		}
    		
    	}
    	printAll(rList);
    }
    public static void printAll(List<Goods> list) {
    	for(Goods l :list)
    		System.out.println(l);
    }
    
}
