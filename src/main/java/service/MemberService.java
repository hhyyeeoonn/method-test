package service;
import vo.*;


public class MemberService {
	
	public boolean loginBool(String id, String pw) {
		String sysId="admin";
		String sysPw="1234";
		if(id.equals(sysId) && pw.equals(sysPw)) {
			return true; // 로그인 성공 시
		}
		return false; // 로그인 실패 시
	}
	
   public Member loginMember(Member paramMember) {
	      Member returnMember = null;
	      
	      // DB에서 가져오는 정보(select)
	      String sysId = "admin";
	      String sysPw = "1234";
	      String sysName = "관리자";
	      
	      if(paramMember.getId().equals(sysId) && paramMember.getPw().equals(sysPw)) {
	         returnMember = new Member();
	         returnMember.setId(sysId);
	         returnMember.setName(sysName);
	         return returnMember; // 로그인 성공시
	      }
	      
	      return returnMember;
	   }
}
