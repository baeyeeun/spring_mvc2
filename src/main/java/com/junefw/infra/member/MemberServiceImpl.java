package com.junefw.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public List<Member> selectList() throws Exception {
		return dao.selectList(); 
	}

	public int insert(Member dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectList(Member dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}