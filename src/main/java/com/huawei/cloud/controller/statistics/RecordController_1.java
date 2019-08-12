package com.huawei.cloud.controller.statistics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.service.StatisticsService_1;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.MSG;

@Controller
@RequestMapping
public class RecordController_1 {

	@Autowired
	StatisticsService_1 service;

	private Object Object = new Object();

	@ResponseBody
	@RequestMapping("/recordlist_1")
	public MSG ajaxRecord_1(@RequestParam("middlename") Integer middlename) {

		Integer countAllphones = service.countAllphone_1(middlename);
		Integer countSuccessLogin = service.countSuccessLogin_1(middlename);
		Integer countFailsends = service.countFailSend_1(middlename);
		Integer countSuccessGet = service.countSuccessGet_1(middlename);
		Integer countGetfailphones = service.countGetfailphones_1(middlename);
		Integer countSuccReturn = service.countSuccReturn_1(middlename);
		Integer conutPending = service.conutPending_1(middlename);
		System.out.println("countSuccReturn="+countSuccReturn);
		System.out.println("conutPending="+conutPending);

		
		List<Integer> counlist = new ArrayList<>();
		counlist.add(countAllphones);
		counlist.add(countSuccessLogin);
		counlist.add(countFailsends);
		counlist.add(countSuccessGet);
		counlist.add(countGetfailphones);
		counlist.add(countSuccReturn);
		counlist.add(conutPending);
		
		for (Integer integer : counlist) {
			System.out.println("list[]===" +integer);
		}
		return MSG.success().add("list", counlist);
	}

	@RequestMapping("/addAllphone_1")
	@ResponseBody
	public void addAllPhone_1(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "alltelephone") String alltelephone) throws Exception {
		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + alltelephone).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addAllphone_1(str, middlename);
		}

	}

	@RequestMapping("/addFailsend_1")
	@ResponseBody
	public void addFailsend_1(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "sendfail") String sendfail) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + sendfail).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addFailsend_1(str, middlename);
		}
	}

	@RequestMapping("/addGetfail_1")
	@ResponseBody
	public void addGetfail_1(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "getfailsendphone") String getfailsendphone) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + getfailsendphone).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addGetfail_1(str, middlename);
		}
	}

	@RequestMapping("/addSuccessGet_1") // 改变量
	@ResponseBody
	public void addSuccessGet_1(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "successgetphone") String successgetphone, @RequestParam(value = "code") String code)
			throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + successgetphone).append(" 码: " + code).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			System.out.println("str" + str);
			service.addSuccessGet_1(str, middlename);
		}
	}

	@RequestMapping("/addSuccessLogin_1")
	@ResponseBody
	public void addSuccessLogin_1(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "successphone") String successphone) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + successphone).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addSuccessLogin_1(str, middlename);
		}
	}
	
	
	
	
	@RequestMapping("/addSuccReturn_1")
	@ResponseBody
	public void addSuccReturn(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "SuccReturn") String SuccReturn) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + SuccReturn).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addSuccReturn_1(str, middlename);
		}
	}
	
	@RequestMapping("/addPending_1")
	@ResponseBody
	public void addPending(@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "Pending") String Pending) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + Pending).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addPending_1(str, middlename);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
