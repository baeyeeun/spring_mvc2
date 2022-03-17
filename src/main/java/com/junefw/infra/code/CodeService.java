package com.junefw.infra.code;

import java.util.List;

public interface CodeService {
	
//	infrCodeGroup
	int selectOneCount(CodeVo vo) throws Exception;
	List<Code> selectList(CodeVo vo) throws Exception; 
	int insert(Code dto) throws Exception;
	Code selectOne(CodeVo vo) throws Exception;
	int update(Code dto) throws Exception;
	
//	infrCode
	List<Code> selectListCode(CodeVo vo) throws Exception; 
	int insertCode(Code dto) throws Exception;
	Code selectOneCode(CodeVo vo) throws Exception;
	int updateCode(Code dto) throws Exception;

}
