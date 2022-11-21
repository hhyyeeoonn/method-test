// 이 페이지가 모델
package dao;

import java.sql.*;
import java.util.ArrayList;


import vo.Dept;

public class DeptDao {
	// insert
	public int insertDept(Dept dept) throws Exception {
		return 0;
	}
	// update
	public int updateDept(Dept dept) throws Exception {
		return 0;
	}
	// delete
	public int deleteDept(String deptNo) throws Exception {
		return 0;
	}
	
	// selectOne
	public Dept selectDeptOne(String deptNo) throws Exception {
		return null;
	}
	
	// selectList
	public ArrayList<Dept> selectDeptList(int currentPage, int rowPerPage) throws Exception {// 예외처리 코드
		/*
		 * db연결 
		 * select 결과값 가져오기
		 * List값으로 반환 (여러 List타입들의 제일 큰 단위의 타입...)
		 */
		// 반환타입변수
		ArrayList<Dept> list = new ArrayList<Dept>();
		
		// beginRow를 구하는 알고리즘
		int beginRow = (currentPage - 1) * rowPerPage;
		
		
		// db 조회 알고리즘
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1", "root", "java1234");
		String sql = "SELECT dept_no deptNo, dept_name deptName, FROM departments LIMIT ?, ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, beginRow);
		stmt.setInt(2, rowPerPage);

		ResultSet rs = stmt.executeQuery();
		// ResultSet 자체를 리턴하는 것은 틀린 방법은 아니나 추천하지 않음
		
		while(rs.next()) {
			Dept d = new Dept();
			d.setDeptNo(rs.getString("deptNo")); // 이름은 맞춰주는 것이 좋다 그래서 as쓰는 것
			d.setDeptName(rs.getString("deptName"));
			list.add(d);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		return list;
	}
}
