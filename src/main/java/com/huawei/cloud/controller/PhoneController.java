package com.huawei.cloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
public class PhoneController {

	@Autowired
	PhoneService phoneService;

	@RequestMapping(value = "/teleListWithEmpno", method = RequestMethod.GET)
	@ResponseBody
	public MSG teleLisWithEmpno(@RequestParam(value = "pn", defaultValue = "1") Integer pn, String tablename,
			HttpServletRequest request) {
 
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		PageHelper.startPage(pn, 20);

		Map<String, Object> sqlmap = new HashMap<>();
		sqlmap.put("tablename", tablename);
		sqlmap.put("empno", empno);
		
		List<PhoneNum> phonelist = phoneService.findALLWithEmpno(sqlmap);
		Integer notusedcount  = phoneService.findCountNotUsed(sqlmap);
		Integer usedcount =phoneService.findCountUsed(sqlmap);
		PageInfo page = new PageInfo(phonelist, 5);
	
		return MSG.success().add("usedcount", usedcount).add("notusedcount", notusedcount).add("PageInfo", page);
	}

	@RequestMapping(value = "/teleListWithoutUsed", method = RequestMethod.GET)
	@ResponseBody
	public MSG teleListWithoutUsed(@RequestParam(value = "pn", defaultValue = "1") Integer pn, String tablename,
			HttpServletRequest request) {

		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		PageHelper.startPage(pn, 20);
		
		Map<String, Object> sqlmap = new HashMap<>();
		sqlmap.put("tablename", tablename);
		sqlmap.put("empno", empno);

		List<PhoneNum> phonelist = phoneService.findALLWithoutUsed(sqlmap);

		PageInfo page = new PageInfo(phonelist, 5);
		return MSG.success().add("PageInfo", page);
	}

	@RequestMapping(value = "/teleListWithUsed", method = RequestMethod.GET)
	@ResponseBody
	public MSG teleListWithUsed(@RequestParam(value = "pn", defaultValue = "1") Integer pn, String tablename,
			HttpServletRequest request) {

		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		PageHelper.startPage(pn, 20);

		Map<String, Object> sqlmap = new HashMap<>();
		sqlmap.put("tablename", tablename);
		sqlmap.put("empno", empno);

		List<PhoneNum> phonelist = phoneService.findALLWithUsed(sqlmap);
		PageInfo page = new PageInfo(phonelist, 5);
		return MSG.success().add("PageInfo", page);
	}

	@RequestMapping(value = "/telePhone/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public MSG deletePhones(@PathVariable("ids") String ids,String tablename) {
		Map<String, Object> sqlmap = new  HashMap<>();	
		sqlmap.put("tablename",tablename);
		
		if (ids.contains("-")) {
			List<Integer> list = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for (String string : str_ids) {
				list.add(Integer.parseInt(string));
			}
			sqlmap.put("list", list);
			phoneService.deleteBatch(sqlmap);
		} else {
			Integer id = Integer.parseInt(ids);
			sqlmap.put("pid", id);
			phoneService.deletePhone(sqlmap);
		}
		return MSG.success();
	}

	@ResponseBody
	@RequestMapping(value = "/updateToUsed", method = RequestMethod.POST)
	public MSG updateWithUsed(@RequestParam("pids") String pids,@RequestParam("tablename")String tablename) {
		Map<String, Object> sqlmap = new  HashMap<>();	
		sqlmap.put("tablename",tablename);

		if (pids.contains("-")) {
			List<Integer> list = new ArrayList<>();
			String[] str_ids = pids.split("-");
			for (String string : str_ids) {
				list.add(Integer.parseInt(string));
			}	
			sqlmap.put("list", list);

			phoneService.updateToUsed(sqlmap);
		} else {
			Integer pid = Integer.parseInt(pids);
			sqlmap.put("pid", pid);

			phoneService.updateOneToUsed(sqlmap);
		}
		return MSG.success();
	}

	@ResponseBody
	@RequestMapping(value = "/updateToNotUsed", method = RequestMethod.POST)
	public MSG updateWithoutUsed(@RequestParam("pids") String pids,@RequestParam("tablename")String tablename) {
		Map<String, Object> sqlmap = new  HashMap<>();	
		sqlmap.put("tablename",tablename);
	
		if (pids.contains("-")) {
			List<Integer> list = new ArrayList<>();
			String[] str_ids = pids.split("-");
			for (String string : str_ids) {
				list.add(Integer.parseInt(string));
			}
			sqlmap.put("list", list);
			phoneService.updateToNotUsed(sqlmap);
		} else {
			Integer pid = Integer.parseInt(pids);
			sqlmap.put("pid", pid);
			phoneService.updateOneToNotUsed(sqlmap);
		}
		return MSG.success();
	}

	@ResponseBody
	@RequestMapping(value = "/emptyUserDataById",method = RequestMethod.POST)
	public MSG emptyUserDataById(@RequestParam(value="tablename",required=false)String tablename, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		Map<String, Object> sqlmap = new HashMap<>();
		sqlmap.put("tablename", tablename );
		sqlmap.put("empno", empno);
		phoneService.emptyUserDataById(sqlmap);
		return MSG.success();
	}

}
