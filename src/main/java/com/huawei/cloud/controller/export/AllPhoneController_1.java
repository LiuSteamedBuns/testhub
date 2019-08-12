package com.huawei.cloud.controller.export;

import java.io.FileInputStream;
import java.io.IOException;
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

import com.huawei.cloud.bean.AllPhone_1;
import com.huawei.cloud.service.StatisticsService_1;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.ResponseUtil;

@RequestMapping
@Controller
public class AllPhoneController_1 {
	
	@Autowired
	StatisticsService_1 statservice;
	
	
public static Workbook fillExcelDataWithTemplate(List<AllPhone_1> list ,String templateFileUrl) {
		
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
			ww.createCell(0).setCellValue("全部电话号码"); 
			for(AllPhone_1 allPhone : list){
				row = sheet.createRow(rowIndex);
				rowIndex ++;
				row.createCell(0).setCellValue(allPhone.getAlltelephone());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb;
	}
	
	@RequestMapping("/excel_downALLNum_1")
	public String excel_downAdmin(@RequestParam Integer middlename,HttpServletResponse response,HttpServletRequest  request)
			throws Exception {
		
		String webPath=request.getServletContext().getRealPath("/");
		
		List<AllPhone_1> list = statservice.selectAllphone_1(middlename);
		
		Workbook wb =fillExcelDataWithTemplate(list, webPath+"/static/client_down_model.xls");
		
		ResponseUtil.export(response,wb,DateUtil.getCurrentDateStr()+".xls");
		return null;
	}

	
}
