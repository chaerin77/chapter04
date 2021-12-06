package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		//도형 생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(8,17);
		Circle c01 = new Circle(5);

		//포인트(점)관리
		MyList<Point> pList = new MyList<Point>(); //Point만 관리하고싶다면
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.get(0).toString());
		//@어쩌구로 찍히는이유 ->Point p01의 부모인 object의 toString이 사용되었음
		//MyList에 toString만들어줬떠니 오버라이딩 일어나서 @안나오고 MyList의 toString나옴. 자식꺼가 덮어씌워짐
		
		//Circle(원) 관리
		MyList<Circle> cList = new MyList<Circle>();//Circle만 관리 위와 같은틀로 올린것
		cList.add(c01);
		//**cList.add(p01); 원이 아닌데도 object로 받아서 아무거나 다 들어가고 오류도 안생겨서 잘못된 값 찾기어려움
		
		System.out.println(cList.get(0));//다운캐스팅 하지 않아도 됨
		
		System.out.println(cList.toString());
		
		/*
		Circle c02 = new Circle(19);
		cList.add(c02);
		*/
	}

}
