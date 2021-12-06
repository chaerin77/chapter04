package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {

	//범용성+MyListApp에서 **일때 오류뜨도록 object를 T로 바꿔주기
    //필드   
	private T[] oArray; //따라가보면 object있을것. Point 담아야하고 Circle받아야하고그러잖아 담을때마다 이름바꿔줘야하니까 object로..
	private int crtPos;
	
	//생성자
	public MyList() {
		this.oArray = (T[])new Object[3];
		this.crtPos = 0;
	}
	
	//메소드 g/s 생략
	
	//메소드 일반
	public void add(T o) { //Point만 받을게 아니고 다 받을수 있게끔 Object사용
        oArray[crtPos] = o;
        crtPos++;
	}
	
	public T get(int index) {
		T result = oArray[index]; //oArray의 index번째에있는 방
	    return result;
	}
    public int size() {
    	return crtPos;
    }

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
 
}


