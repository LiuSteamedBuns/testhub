package com.huawei.cloud.controller.statistics;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huawei.cloud.service.TrunateService;

@RequestMapping
@Controller
public class TrunateController {
	
	@Autowired
	TrunateService service;

	@RequestMapping("/deleteALLNum")
	public String deleteDataAllphone(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteALLNum(middlename,empno);
		return "comm-main";	}

	@RequestMapping("/deleteSuccLogin")
	public String deleteSuccLogin(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteSuccLogin(middlename,empno);
		return "comm-main";	}

	@RequestMapping("/deleteFaildSend")
	public String deleteFaildSend(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteFaildSend(middlename,empno);
		return "comm-main";	}

	@RequestMapping("/deleteSuccGet")
	public String deleteSuccGet(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteSuccGet(middlename,empno);
		return "comm-main";	}

	@RequestMapping("/deleteGetFailLogin")
	public String deleteGetFailLogin(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteGetFailLogin(middlename,empno);
		return "comm-main";
	}


	@RequestMapping("/deleteSuccreturn")
	public String deleteSuccreturn(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deleteSuccreturn(middlename,empno);
		return "comm-main";	}

	@RequestMapping("/deletePending")
	public String deletePending(@RequestParam Integer middlename,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.deletePending(middlename,empno);
		return "comm-main";
	}

	
	@RequestMapping("/delHistory")
	public String delHistory() {
		service.delHistory();
		return "comm-main";
	}
	
	@RequestMapping("/delRepetition")
	public String delRepetition(HttpServletRequest request,@RequestParam("middletag")Integer middletag){
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		service.delRepetition(empno,middletag);
		
		return "comm-main";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
