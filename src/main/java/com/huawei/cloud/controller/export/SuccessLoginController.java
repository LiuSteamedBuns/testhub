package com.huawei.cloud.controller.export;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huawei.cloud.bean.SuccessLogin;
import com.huawei.cloud.service.StatisticsService;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.ResponseUtil;

@RequestMapping
@Controller
public class SuccessLoginController {
	
	@Autowired
	StatisticsService statservice;
	
	
public static Workbook fillExcelDataWithTemplate(List<SuccessLogin> list ,String templateFileUrl) {
		
		Workbook wb = null ;
		try {
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(templateFileUrl));
			 wb = new HSSFWorkbook(fs);
			// 取得 模板的 第一个sheet 页
			Sheet sheet = wb.getSheetAt(0);
			// 拿到sheet页有 多少列
/*			int cellNums = sheet.getRow(0).getLastCellNum();
*/			// 从第2行 开搞    下标1  就是第2行
			int rowIndex = 1;
			Row row ; 
			Row ww = sheet.createRow(0);
			ww.createCell(0).setCellValue("可用的号码"); 
			for(SuccessLogin successLogin : list){
				row = sheet.createRow(rowIndex);
				rowIndex ++;
				row.createCell(0).setCellValue(successLogin.getSuccussphone());
				row.createCell(1).setCellValue(DateUtil.formatDate(successLogin.getAdddate(), "MM月dd日HH时mm分ss秒")); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb;
	}
	
	@RequestMapping("/excel_downSuccLogin")
	public String excel_downAdmin(@RequestParam Integer middlename, HttpServletResponse response,HttpServletRequest  request)
			throws Exception {
		HttpSession session = request.getSession();
		Integer empno	= (Integer) session.getAttribute("empno");
		
		String webPath=request.getServletContext().getRealPath("/");
		
		List<SuccessLogin> list = statservice.selectSuccessLogin(middlename,empno);
		
		Workbook wb =fillExcelDataWithTemplate(list, webPath+"/static/client_down_model.xls");
		
		ResponseUtil.export(response,wb,DateUtil.getCurrentDateStr()+".xls");
		return null;
	}

	
}
