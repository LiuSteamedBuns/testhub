package com.huawei.cloud.controller.statistics;


import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.bean.HistorySame;
import com.huawei.cloud.service.StatisticsService;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.MSG;

@Controller
@RequestMapping
public class RecordController {

	@Autowired
	StatisticsService service;

	private Object Object = new Object();

	@ResponseBody
	@RequestMapping("/recordlist")
	public MSG ajaxRecord(@RequestParam("middlename") Integer middlename,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		

		System.out.println("middlename" + middlename);
		Integer countAllphones = service.countAllphone(middlename,empno);
		Integer countSuccessLogin = service.countSuccessLogin(middlename,empno);
		Integer countFailsends = service.countFailSend(middlename,empno);
		Integer countSuccessGet = service.countSuccessGet(middlename,empno);
		Integer countGetfailphones = service.countGetfailphones(middlename,empno);
		Integer countSuccReturn = service.countSuccReturn(middlename,empno);
		Integer conutPending = service.conutPending(middlename,empno);
 
		List<Integer> counlist = new ArrayList<>();
		counlist.add(countAllphones);
		counlist.add(countSuccessLogin);
		counlist.add(countFailsends);
		counlist.add(countSuccessGet);
		counlist.add(countGetfailphones);
		counlist.add(countSuccReturn);
		counlist.add(conutPending);

		return MSG.success().add("list", counlist);
	}

	@RequestMapping("/addAllphone")
	@ResponseBody
	public void addAllPhone(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "alltelephone") String alltelephone) throws Exception {
		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + alltelephone).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addAllphone(str, middlename,empno);
		}

	}

	@RequestMapping("/addFailsend")
	@ResponseBody
	public void addFailsend(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "sendfail") String sendfail) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + sendfail).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addFailsend(str, middlename,empno);
		}
	}

	@RequestMapping("/addGetfail")
	@ResponseBody
	public void addGetfail(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "getfailsendphone") String getfailsendphone) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + getfailsendphone).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addGetfail(str, middlename,empno);
		}
	}

	@RequestMapping("/addSuccessGet") // 改变量
	@ResponseBody
	public void addSuccessGet(		
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "successgetphone") String successgetphone, @RequestParam(value = "code") String code)
			throws Exception {
		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + successgetphone).append(" 码: " + code).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			System.out.println("str" + str);
			service.addSuccessGet(str, middlename,empno);
		}
	}
	
	@ResponseBody
	@RequestMapping("/countHistory")
	public Integer countHistory() {
		Integer countHistory = service.countHistory();
		return countHistory;
	}
	
	@ResponseBody
	@RequestMapping("/findSame")
	public Integer findSame(@RequestParam("successgetphone")String successgetphone,@RequestParam("empno")Integer empno,@RequestParam("middletag")Integer middletag, HttpServletRequest request) {
		
		List<HistorySame> same = service.searchSameHistory(successgetphone);
		if (same.isEmpty()) {
			return 2;
		}else {
			Date olddate = null;
			for (HistorySame historySame : same) {
			olddate =historySame.getAdddate();
			}			
			Date adddate = new Date();
			service.addRepetition(empno,adddate,successgetphone,olddate,middletag);
			
			return 1;			
		}
	}
	   
	@ResponseBody
	@RequestMapping("/listRepetition")
	public Integer listRepetition(HttpServletRequest request,@RequestParam("middletag")Integer middletag){
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		
		return service.countRepetition(empno,middletag);
	   }
	   
	  
	@RequestMapping("/addSuccessLogin")
	@ResponseBody
	public void addSuccessLogin(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "successphone") String successphone) throws Exception {
		service.addRecordGetSuccess(successphone);
		synchronized (Object) {		
			service.addSuccessLogin(successphone,middlename,empno);
		}
	}

	@RequestMapping("/addSuccReturn")
	@ResponseBody
	public void addSuccReturn(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "SuccReturn") String SuccReturn) throws Exception {
			System.out.println("empno="+empno);
			service.addSuccReturn(SuccReturn, middlename,empno);
					
	}
	
	@RequestMapping("/addPending")
	@ResponseBody
	public void addPending(
			@RequestParam(value = "empno") Integer empno,
			@RequestParam(value = "middlename") Integer middlename,
			@RequestParam(value = "Pending") String Pending) throws Exception {

		synchronized (Object) {
			StringBuffer sbf = new StringBuffer();
			sbf.append("号: " + Pending).append(" 时间: " + DateUtil.getCurrentDateStr());
			String str = sbf.toString();
			service.addPending(str, middlename,empno);
		}
	}
	

	@RequestMapping("/selPhone")
	@ResponseBody
	public String selePhone(@RequestParam(value = "phonenum") String phonenum){
			
		return service.recePhon(phonenum) ;
		
		 
	}
	@RequestMapping("/seleLogin")
	@ResponseBody
	public String seleLogin(@RequestParam(value = "phonenum") String phonenum){

		return service.seleLogin(phonenum) ;
		 
	}
	
	
	
}
