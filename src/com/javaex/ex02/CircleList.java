package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {
	
	//필드
	private Circle[] cArray; //관리하려면 배열필요해서
	private int crtPos; //현재 위치
	
	//생성자
	//책같은 애들은 만들던거 기계처럼 만들면 되는데 이거는 책장이라 고려할게 좀 다름
	public CircleList() {
		this.cArray = new Circle[3];
		this.crtPos = 0;
	}
	//값을 바꿀 요소를 안만드는게 좋아서 g/s안만듦
	
	//메소드 일반
    public void add(Circle c) {
    	cArray[crtPos] = c;
    	crtPos++; //한칸옆으로
    }
    
    public Circle get(int index) {
       Circle result = cArray[index]; //Circle의 주소가 result에 담김 index번호
       return result;
    }
	
    public int size() {
    	return crtPos;
    }

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
    
    
}
