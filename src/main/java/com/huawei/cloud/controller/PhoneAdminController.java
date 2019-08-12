package com.huawei.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huawei.cloud.bean.PhoneNum;
import com.huawei.cloud.service.PhoneService;
import com.huawei.cloud.util.MSG;

@RequestMapping
@Controller
public class PhoneAdminController {

	@Autowired
	PhoneService phoneService;

	@RequestMapping(value = "/telListNotUsed", method = RequestMethod.GET)
	@ResponseBody
	public MSG findAllWithoutUsed(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 20);
		List<PhoneNum> phonelist = phoneService.findALLAdminWithoutUsed();
		PageInfo page = new PageInfo(phonelist, 5);
		return MSG.success().add("PageInfo", page);
	}

	@RequestMapping(value = "/telListUsed", method = RequestMethod.GET)
	@ResponseBody
	public MSG findAllWithUsed(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 20);
		List<PhoneNum> phonelist = phoneService.findALLAdminWithUsed();
		PageInfo page = new PageInfo(phonelist, 5);
		return MSG.success().add("PageInfo", page);
	}

	@RequestMapping(value = "/teleList", method = RequestMethod.GET)
	@ResponseBody
	public MSG findAllWithEmpnoJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 20);
		List<PhoneNum> phonelist = phoneService.findALL();
		PageInfo page = new PageInfo(phonelist, 5);
		return MSG.success().add("PageInfo", page);
	}
	
	
	
	
	
	
}
