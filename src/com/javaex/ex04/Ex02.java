package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;


public class Ex02 {

	public static void main(String[] args) {

		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
        Integer i05 = new Integer(3);		
        Integer i06 = new Integer(7);	
		
		Set<Integer> iSet = new HashSet<Integer>();//제네릭 문법에는 기본 자료형이 오면 안됨 클래스로써야함
		iSet.add(i01);
		iSet.add(i02);
	    iSet.add(i03);
	    iSet.add(i04);//자동 박싱
	    iSet.add(i05);
	    iSet.add(i06);
	    
	    iSet.remove(13);
	    
	    System.out.println("갯수:" + iSet.size()); 
	    //iset.add(i05),(i06)추가해도 개수5개인이유
	    //->중복된 값이라서. 3이두개있는데 3꺼내달라하면 두개중에 어떤거 꺼낼지모름 그 전에 배열은 몇번방에있는걸 꺼내는거였는데
	    //이거는 값자체를 꺼내는거라   Set->중복 저장 안됨 중요 -->중복된 데이터가 들어가지 않았으면 좋겠는거 관리할때 좋을것->로또번호
	    
	    for(Integer no : iSet) { //방번호 제어불가
	    	System.out.println(no.toString());
	    }
	    
	    System.out.println("-----------------------");
	    
	    //Poit 관리
	    Point p01 = new Point(3,13);
	    Point p02 = new Point(4,14);
	    Point p03 = new Point(5,15);
	    Point p04 = new Point(31,131);
	    
	    Set<Point> pSet = new HashSet<Point>();
	    pSet.add(p01);
	    pSet.add(p02);
	    pSet.add(p03);
	    pSet.add(p04);
	    
	    pSet.remove(p02);
	    
	    //pSet.remove(p02);
	    System.out.println("갯수:" + pSet.size()); 
	    //p01과p04는 같은가 -> 갯수4개나옴 -> p01,p04는 다르다고 보는것
	    //01과04가 같았으면 좋겠다 - 하면 equals로 다시 정의해야함
	    //HashSet + equals()
	    
	    
	    for(Point i : pSet) {
	    	System.out.println(i.getX());
	    }
	    
	    System.out.println(pSet.toString());
	}

}
