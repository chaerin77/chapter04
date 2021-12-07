package com.javaex.ex04;

import java.util.ArrayList; //crtl shift o
//import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {

		Point p01 = new Point(2,2);
		Point p02 = new Point(3,13);
		Point p03 = new Point(7,17);
		
		//섞어쓰기 한 이유
	    List<Point> pList = new ArrayList<Point>();//섞어쓰기
	    //List<Point> pList = new LinkedList<Point>();
	    pList.add(p01);
	    pList.add(p02);
	    pList.add(p03);
	    
	    //개수 출력하기
	    System.out.println(pList.size());
	    
	    //관리되고 있는 Point에 접근하기
	    System.out.println(pList.get(1).getX());//ArrayList<Point> 1번방의 주소를 줌
        //0x999. 하면 그 주소로가는것  
	    System.out.println(pList.get(1).toString());
	    
	    //전체 출력하기
	    for(int i=0; i<pList.size(); i++) {
	       System.out.println(pList.get(i).toString());	
	    }
	    System.out.println("=====================");
	    
	    //데이터 지우기
	    pList.remove(1); //1번째 방 지워짐
	    //pList.remove(p02);
	    
	    System.out.println(pList.size());
	    for(int i=0; i<pList.size(); i++) {
		       System.out.println(pList.get(i).toString());	
		    }
	    
	    System.out.println("=====================");
        System.out.println(pList.get(1).toString());
	    
        System.out.println("=====================");
        pList.add(1, p02);//배열 1번째방에 p02
        for(int i=0; i<pList.size(); i++) {
		       System.out.println(pList.get(i).toString());	
		    }
        
        System.out.println("=====================");
        System.out.println(pList.toString());
        
        System.out.println("=====================");
        //향상된 for문 (처음부터 끝까지 다 돌겠다)  //많이씀  
        for(Point p : pList) {
        	System.out.println(p.getX());
        	System.out.println(p.getY());
        	
        }
        
        
	}
}
