package service;

import java.util.ArrayList;

public class GuGu { // 클래스 이름
	// 클래스의 필드(field)란 클래스에 포함된 변수(variable)를 의미
	// 입력값 없고, 반환값 없음
	public void secondDan() { // 메서드 특정 작업을 수행하기 위한 명령문의 집합
		for(int i=1; i<10; i++) {
			System.out.println(2+ "*" + i + "=" + 2*i);
		}
	}
	
	// 입력값 없고, 반환값(String 타입)있음
	public String secondDanResult() {
		String result="";
		for(int i=1; i<10; i++) {
			result=result+2+"*"+i+"="+2*i+"<br>";
			/*
			 2*1=2<br>2*2=4<br>
			 */
		}
		return result; //result는 값자리
	}
	
	
	// 입력값 없고, 반환값(ArrayList<String>타입)있음
	public ArrayList<String> secondDanResultList() {
		ArrayList<String> resultList=new ArrayList<String>();
		for(int i=1; i<10; i++) {
			resultList.add(2+"*"+i+"="+2*i);
		}
		return resultList;
	}
	
	// 입력값이 있고, 반환값(ArrayList<String>타입)있음
	public ArrayList<String> secondDanResultList(int dan) { // 메서드의 이름은 매개변수타입까지 보고 같은지 다른지 판단한다 매개변수도 타입이 다르거나 개수가 달라야 다르게 인식한다
		// 메서드 이름은 같고 매개변수는 다르다 -> 메서드 오버로딩
		if(dan<0) {
			return null;
		}
		ArrayList<String> resultList=new ArrayList<String>();
		for(int i=1; i<10; i++) {
			resultList.add(2+"*"+i+"="+2*i);
		}
		return resultList;
	}

	// jsp 코드는 반환값이 void
	// 자바의 main (메인 메서드;함수) 은 반환값이 void형이기에 return문으로 값을 돌려 주지 못함
	//http://mwultong.blogspot.com/2007/03/java-main-return-exit-code.html
	/*
	생성자(constructor)
	클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성됩니다.
	하지만 이렇게 생성된 객체는 모든 인스턴스 변수가 아직 초기화되지 않은 상태입니다.
	따라서 자바에서는 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 생성자(constructor)라는 메소드를 제공합니다.
	자바에서 생성자(constructor)의 이름은 해당 클래스의 이름과 같아야 합니다.
	즉, Car 클래스의 생성자는 Car()가 됩니다.
	*/
}
