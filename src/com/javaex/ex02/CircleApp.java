package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7); //반지름7짜리 원
		
		CircleList cList = new CircleList();
		
		//원을 하나씩 넣어서 관리
		cList.add(c01); //c01 주소가 배열에 저장됨
		cList.add(c02);
		
		System.out.println(cList.toString());
		//CircleList - cArray,crtPos 두가지로 구성됨 3칸짜리배열인데 2칸만갖고있어서3번째는 null//여기까지 cArray
	    System.out.println(cList.size());
	
	    Circle c03 = new Circle(100);
	    cList.add(c03);

	    
	    System.out.println(cList.toString());
	    System.out.println(cList.get(0).getRadius());
	    //cList.get(0) -->주소
	}

}
