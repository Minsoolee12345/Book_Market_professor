package member;

import java.util.List;

public interface MemberDAO 
{
	int insert(Member member);
	Member select(int no);
	Member select(String id, String password);
	List<Member> selectAll();
	int update(Member member);
	int delete(int no);
}
