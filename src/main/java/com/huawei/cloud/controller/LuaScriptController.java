package com.huawei.cloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.bean.PhoneNum;
import com.huawei.cloud.service.LuaPhoneSerice;

@Controller
public class LuaScriptController {

	@Autowired
	LuaPhoneSerice phoneService;

	private Object Object = new Object();

	@RequestMapping(value = "/selectPhoneByid")
	@ResponseBody
	public String findAllPhoneNumById(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_1")
	@ResponseBody
	public String findAllPhoneNumById_1(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_1(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_1(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_2")
	@ResponseBody
	public String findAllPhoneNumById_2(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_2(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_2(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_3")
	@ResponseBody
	public String findAllPhoneNumById_3(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_3(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_3(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_4")
	@ResponseBody
	public String findAllPhoneNumById_4(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_4(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_4(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_5")
	@ResponseBody
	public String findAllPhoneNumById_5(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_5(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_5(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_6")
	@ResponseBody
	public String findAllPhoneNumById_6(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_6(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_6(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_7")
	@ResponseBody
	public String findAllPhoneNumById_7(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_7(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_7(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_8")
	@ResponseBody
	public String findAllPhoneNumById_8(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_8(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_8(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_9")
	@ResponseBody
	public String findAllPhoneNumById_9(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_9(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_9(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/selectPhoneByid_10")
	@ResponseBody
	public String findAllPhoneNumById_10(@RequestParam Integer empno, HttpServletRequest request) {

		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findALLWithoutUsedOne_10(empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateImmediatelyUsed_10(pid);
			return telephone;
		}
	}

	@RequestMapping(value = "/getPhone")
	@ResponseBody
	public String findAllPhoneNumByIdTableName(@RequestParam("tablename") String tablename,
			@RequestParam("empno") Integer empno, HttpServletRequest request) {
		synchronized (Object) {
			PhoneNum phoneNum = phoneService.findAllPhoneNumByIdTableNames(tablename, empno);
			String telephone = phoneNum.getTelephone();
			Integer pid = phoneNum.getPid();
			phoneService.updateAllPhoneNumByIdTableNames(tablename, pid);
			return telephone;
		}
	}

}
