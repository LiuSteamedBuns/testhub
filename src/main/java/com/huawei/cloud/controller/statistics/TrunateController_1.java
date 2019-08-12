package com.huawei.cloud.controller.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huawei.cloud.service.TrunateService_1;

@RequestMapping
@Controller
public class TrunateController_1 {
	
	@Autowired
	TrunateService_1 service;

	@RequestMapping("/deleteALLNum_1")
	public String deleteDataAllphone_1(@RequestParam Integer middlename) {
		
		service.deleteALLNum_1(middlename);
		return "other-main";	}

	@RequestMapping("/deleteSuccLogin_1")
	public String deleteSuccLogin_1(@RequestParam Integer middlename) {
		service.deleteSuccLogin_1(middlename);
		return "other-main";	}

	@RequestMapping("/deleteFaildSend_1")
	public String deleteFaildSend_1(@RequestParam Integer middlename) {
		service.deleteFaildSend_1(middlename);
		return "other-main";	}

	@RequestMapping("/deleteSuccGet_1")
	public String deleteSuccGet_1(@RequestParam Integer middlename) {
		service.deleteSuccGet_1(middlename);
		return "other-main";	}

	@RequestMapping("/deleteGetFailLogin_1")
	public String deleteGetFailLogin_1(@RequestParam Integer middlename) {
		service.deleteGetFailLogin_1(middlename);
		return "other-main";
	}
	
	@RequestMapping("/deletePending_1")
	public String deletePending_1(@RequestParam Integer middlename) {
		service.deletePending_1(middlename);
		return "other-main";	}

	@RequestMapping("/deleteSuccreturn_1")
	public String deleteSuccreturn_1(@RequestParam Integer middlename) {
		service.deleteSuccreturn_1(middlename);
		return "other-main";
	}
	
	
	

}
