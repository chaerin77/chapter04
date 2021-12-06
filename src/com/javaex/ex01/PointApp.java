package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(5,7); //맨날 하던거 메모리에올림
		Point p02 = new Point(10,15);
		
		/*
		//테스트
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		*/
		
		PointList pList = new PointList();
		
		pList.add(p01);//p01의 주소를 넣어준것 0x868 -따라가보면 Point있는
	    pList.add(p02);
	    
	    System.out.println(pList.get(0).getX());
	    //pList의 0번째주소내놔. 접근하려면 get메소드써야함 0이 0x868임
	    System.out.println(pList.get(0).toString());
	
	    System.out.println(pList.get(1).getY());
	    System.out.println(pList.get(1).toString());
	
	    System.out.println(pList.size()); //2
	    
	    Point p03 = new Point(155,90);
	    pList.add(p03);//배열에넣음
	    System.out.println(pList.size());//3
	}

}
