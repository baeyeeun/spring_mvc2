package com.junefw.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeServiceImpl service;
	
	@RequestMapping(value = "/code/codeList")
	public String CodeGroupList(CodeVo vo, Model model) throws Exception {

		List<Code> list = service.selectListCode(vo);
		List<Code> listCodeGruop = service.selectList(vo);		
		
		model.addAttribute("list", list);
		model.addAttribute("listCodeGruop", listCodeGruop);
		
		return "code/CodeGroupList";
	}
	
	@RequestMapping(value = "/code/codeGroupForm")
	public String codeGroupForm(Model model) throws Exception {

		return "code/codeGroupForm";
	}
	
	@RequestMapping(value = "/code/codeGroupInst")
	public String codeGroupInst(Code dto) throws Exception {
		
		System.out.println();
		
		service.insert(dto);
		
		return "";
	}
	@RequestMapping(value = "/code/codeGroupInst")
	public String codeView(CodeVo vo, Model model) throws Exception {
		
		Code rt= service.selectOne(vo);
		
		model.addAttribute("item", rt);
		
		return "";
	}
	
	@RequestMapping(value = "/code/codeGroupForm2")
	public String codeGroupForm2(CodeVo vo, Model model) throws Exception {
		
		Code rt= service.selectOne(vo);
		
		model.addAttribute("item", rt);
		
		return "code/codeGroupForm2";
	}
}