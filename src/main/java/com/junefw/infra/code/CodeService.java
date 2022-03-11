package com.junefw.infra.code;

import java.util.List;

public interface CodeService {

	//infrCodeGroup
	public List<Code> selectList() throws Exception; 
	public int insert(Code dao) throws Exception;
	public Code selectOne(CodeVo vo) throws Exception;
	public int update(Code dto) throws Exception; 
	
	//infrCode
	public List<Code> selectListCode() throws Exception; 
	public int insertCode(Code dao) throws Exception;
	public Code selectOneCode(CodeVo vo) throws Exception;
	public int updateCode(Code dto) throws Exception; 
}
