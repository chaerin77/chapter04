package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		//HashSet을 이용해서 로또번호 자동생성기 만들기
		//랜덤함수
		//어차피 랜덤으로 뽑힐거니까 반복문으로해결
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			//6개면 탈출
			if(iSet.size()>=6) {
				break;
			}
			
			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자:" + num);
			iSet.add(num); //중복체크는 Set을 통해 해결
		}
		
		System.out.println("============================");
		for(int no : iSet) {//언박싱
			System.out.println(no);
		}
		
		/*
		int n01 = (int)(Math.random()*45)+1;
		int n02 = (int)(Math.random()*45)+1;
	    int n03 = (int)(Math.random()*45)+1;
	    int n04 = (int)(Math.random()*45)+1;
	    int n05 = (int)(Math.random()*45)+1;
	    int n06 = (int)(Math.random()*45)+1;
	    
	    Set<Integer> iSet = new HashSet<Integer>();
	
	    iSet.add(n01);
	    iSet.add(n02);
	    iSet.add(n03);
	    iSet.add(n04);
	    iSet.add(n05);
	    iSet.add(n06);
	    
	    
	    for(Integer no : iSet) {
	    	System.out.println(no);
	    }
	    */
	}

}
