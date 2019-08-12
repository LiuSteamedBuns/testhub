package com.huawei.cloud.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.bean.WeChat;
import com.huawei.cloud.service.WechatService;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.MSG;
import com.huawei.cloud.util.ResponseUtil;

@Controller
public class WeChatController {
	
	@Autowired
	WechatService service;
	
	 
	@ResponseBody
	@RequestMapping("/addWeChat")
	public String addWeChatMSG(@RequestParam Integer adwid, String addwxid, String addwxname, String gender, String addtime,
			String localid, String localname) {
		
		StringBuffer sbf = new StringBuffer();

		sbf.append(addwxid).append("-").append(addwxname).append("-").append(gender).append("-").append(addtime)
		.append("-").append(localid).append("-").append(localname);
		String sbf1 = sbf.toString();
		service.addWechat(adwid,addwxid,addwxname,gender,addtime,localid,localname);
	
		return null;
	}
		 
	@RequestMapping("/downWeChat")
	public String excel_downAdmin(@RequestParam Integer adwid, HttpServletResponse response,HttpServletRequest  request)
						throws Exception {
		String webPath=request.getServletContext().getRealPath("/");
					List<WeChat> list = service.downWechat(adwid); 
					Workbook wb =fillExcelDataWithTemplate(list, webPath+"/static/client_down_model.xls");
					ResponseUtil.export(response,wb,DateUtil.getCurrentDateStr()+".xls");
					return null;
				}

	 
		public static Workbook fillExcelDataWithTemplate(List<WeChat> list ,String templateFileUrl) {
			
			Workbook wb = null ;
			try {
				POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(templateFileUrl));
				 wb = new HSSFWorkbook(fs);
 				Sheet sheet = wb.getSheetAt(0);
			 
				int rowIndex = 1;
				Row row ; 
				Row ww = sheet.createRow(0);
				ww.createCell(0).setCellValue("客户编号");
				ww.createCell(1).setCellValue("客户主号"); 
				ww.createCell(2).setCellValue("昵称"); 
				ww.createCell(3).setCellValue("微信号"); 
				ww.createCell(4).setCellValue("手机号");
				ww.createCell(5).setCellValue("加粉的时间"); 
				for(WeChat weChat : list){
					row = sheet.createRow(rowIndex);
					rowIndex ++;
					row.createCell(0).setCellValue(weChat.getAddwxid());
					row.createCell(1).setCellValue(weChat.getAddwxname());
					row.createCell(2).setCellValue(weChat.getGender());
					row.createCell(3).setCellValue(weChat.getLocalid());
					row.createCell(4).setCellValue(weChat.getLocalname());	
					row.createCell(5).setCellValue(weChat.getAddtime());

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return wb;
		}
		
		@RequestMapping("/deleteWechat")
		public String deletewechat(@RequestParam Integer adwid){
			
			service.deleteWechat(adwid);
			return "wechat-main";
		}

		@ResponseBody
		@RequestMapping("/countWechat")
		public MSG conuntWechat(){ 
			Integer first = service.countWechat(1);
			Integer second = service.countWechat(2);
			Integer three = service.countWechat(3);
			Integer four = service.countWechat(4);
			Integer five = service.countWechat(5);
			
			List<Integer> list =new ArrayList<>();
			list.add(first);
			list.add(second);
			list.add(three);
			list.add(four);
			list.add(five);

			
 			return MSG.success().add("list", list);
		}

}