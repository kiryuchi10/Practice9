package com.javaex.ex02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FriendApp {

	public static void main(String[] args) {
		List<Friend> rList = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);
		String friendString;
		System.out.println("친구 3명을 등록해주세요");
		for (int i = 0; i < 3; i++) {
			Friend f = new Friend();
			f.setName(sc.next());
			f.setHp(sc.next());
			f.setSchool(sc.next());

			// friendString=sc.next();
//    		friendString.trim();
//    		System.out.println(friendString);
//    		String name=friendString.substring(0, 2);
//    		String hp=friendString.substring(3,15);
//    		String school=friendString.substring(15);
//    		System.out.println(name);
//    		System.out.println(hp);
//    		System.out.println(school);
//    		ff=new Friend(name,hp,school);
			rList.add(f);
		}
		sc.close();
		for (Friend l : rList)
			l.draw();

	}

	public static void printAll(List<Friend> list) {
		for (Friend l : list)
			System.out.println();
	}

}
