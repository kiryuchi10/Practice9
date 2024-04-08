package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class FriendApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Friend> rList = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);
		String friendString;
		System.out.println("친구 3명을 등록해주세요");
		for (int i = 0; i < 3; i++) {
			friendString=sc.nextLine();
			System.out.println(friendString);
			
			//1
			//String [] str=friendString.split(" ");
	
//			int length_string = str.length;
//			String[] str1= new String[length-1];
//					

			
//			String name = str[0];
//			String hp = str[1];
//			String school = str[2];
//			
//			System.out.println(name);
//			System.out.println(hp);
//			System.out.println(school);
			
			//2
			String name = friendString.substring(0, 3);
			System.out.println(name);
			String hp = friendString.substring(4, 17);
			System.out.println(hp);
			String school = friendString.substring(18);
			System.out.println(school);
			
		
			
			Friend f = new Friend(name, hp, school);
			rList.add(f);
		}
		sc.close();
		listDraw(rList);
	}

	public static void listDraw(List<Friend> list) {// 내용작성
		for (Friend l : list)
			l.draw();
	}
}
