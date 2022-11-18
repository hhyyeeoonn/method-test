<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="service.GuGu" %>
<%@ page import="java.util.ArrayList" %>

<!-- 
	메서드 
	-코드(여러 명령문)를 하나의 이름으로 묶어 놓은 것 ; 메서드의 이름
	-입력값이 필요할 수도 있다 ; 메서드의 매개변수값
	-반환값이 있을 수도 있다 ; 메서드의 리턴값
	-메서드는 클래스 안에 만들어진다 (일반메서드, static메서드)
	-호출은 메서드 이름으로
 -->
<!-- 
	내장객체 빌트인객체 dao 
 -->
<%
		System.out.println("직접 호출로 2단 출력");
	// 구구단을 출력하는 코드
	for(int i=1; i<10; i++) {
		System.out.println(2 + "*" + i + "=" + 2*i);
	}
	
	//-----------------------------------------------------------------
	
		System.out.println("메서드 호출로 2단 출력");
	GuGu gugu = new GuGu();
	gugu.secondDan();
	// 코드에 이름을 부여하는 것 = 메서드를 만드는 것
	// 구구단을 출력하는 코드(dan변수생성, 반복문, 출력, ... 여러 명령)에 이름을 부여 -> 메서드를 만든다
	// 메서드를 만든다 -> GuGu클래스 안에 일반 메서드 -> 입력값도 필요 없고 반환값도 필요 없다
	// ->호출
	
	// new service.GuGu().secondDan(); // 객체변수를 만들어서 호출하는 게 좋다 변수생성
	/*
	클래스 이름이 길면 import하자
	service.GuGu gugu=new service.GuGu(); // 클래스는 네임은 풀네임을 호출하기 보다는 import로 줄이는 게
	gugu.secondDan();
	*/
	
	
	// 호출하는 곳(jsp)에 출력하고 싶다
	
	String result = gugu.secondDanResult();
	
	// 반환값을 좀 더 세련된 타입으로...
	ArrayList<String> resultList = gugu.secondDanResultList();
	
	// 특정단이 아닌 원하는 단이 출력되었으면...
	ArrayList<String> resultList7 = gugu.secondDanResultList(7);
%>

<!DOCTYPE html>
<html>
<body>
	<h3>secondDanResult()</h3>
	<%=result%>
	<hr>
		
	<h3>secondDanResultList()</h3>
	<%
		for(String s : resultList) {
	%>
			<div><%=s%></div>
	<%		
		}
	%>
	<hr>
	<h3>secondDanResultList(int dan)</h3>
	<%
		for(String s : resultList7) {
	%>
			<div><%=s%></div>
	<%		
		}
	%>

</body>
</html>