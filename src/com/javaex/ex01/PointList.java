package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	//필드
	private Point[] pArray; //point주소를 갖고있는 배열
	private int crtPos;
	
	
	//생성자
	public PointList() {
		this.pArray = new Point[3]; //여기는 그냥 pArray해도됨
		this.crtPos = 0;
	}
	
	//메소드 g/s
	
	//메소드 일반
	public void add(Point p) { //p가 0x333
		pArray[crtPos] = p;
		crtPos++;
	}
	
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}

    public int size() {
    	return crtPos; //현재의 개수
    }

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
    
    
}
