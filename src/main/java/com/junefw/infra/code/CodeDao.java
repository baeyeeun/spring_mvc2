package com.junefw.infra.code;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDao {
	
	@Inject
//	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.code.CodeMpp";

//infrCodeGroup
	public List<Code> selecList(CodeVo vo) {List<Code> list=sqlSession.selectList(namespace+ ".selectList", vo); return list;}
	public int insert(Code dto) {return sqlSession.insert(namespace + ".insert", dto);}
	public Code selectOne(CodeVo vo) {return sqlSession.selectOne(namespace + ".selecOne", vo);}
	public int update(Code dto) {return sqlSession.update(namespace + ".update", dto);}

	// infrCode
	public List<Code> selecListCode() {List<Code> list=sqlSession.selectList(namespace+ ".selectListCode", ""); return list;}
	public int inserCode(Code dto) {return sqlSession.insert(namespace + ".insertCode", dto);}
	public Code selectOneCode(CodeVo vo) {return sqlSession.selectOne(namespace + ".selecOneCode", vo);}
	public int updateCode(Code dto) {return sqlSession.update(namespace + ".updateCode", dto);}
}