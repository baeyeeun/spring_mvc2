package com.mycompany.myapp.member;

import java.util.List;

public interface MemberService {
	
	public List<Member> selectList() throws Exception; 
	public int selectList(Member dto) throws Exception; 

}