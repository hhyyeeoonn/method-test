<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="vo.*"%>
<%@ page import="dao.*" %>
<%@ page import="java.util.*" %>
<%
	// 1 Controller
	int currentPage = 1;
	int rowPerPage = 5;	
	//  Model 모델값을 만드는 코드를 모델이라고 한다
	// 요청을 받아서 모델값을 받아오고 모델값을 넘겨주고 다시 반환되는 값을 받아 클라이언트에게 보내는 것이 컨트롤러의 역할이다
	DeptDao deptDao = new DeptDao();
	ArrayList<Dept> list = deptDao.selectDeptList(currentPage, rowPerPage);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
		</tr>
		<%
			for(Dept d:list) {
		%>
			<tr>
				<td><%=d.getDeptNo()%></td>
				<td><%=d.getDeptName()%></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>