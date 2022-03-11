package com.junefw.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.junefw.infra.member.Member;

public class CodeServiceImpl implements CodeService{
	
	@Autowired
	CodeDao dao;

	@Override
	public List<Code> selectList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Code dao) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Code selectOne(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Code> selectListCode(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCode(Code dao) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Code selectOneCode(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCode(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Code> selectList(CodeVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Code> selectListCode() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Code> selectListCode(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}
