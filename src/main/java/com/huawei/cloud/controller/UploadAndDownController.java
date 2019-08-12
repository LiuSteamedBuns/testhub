package com.huawei.cloud.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.huawei.cloud.bean.PhoneNum;
import com.huawei.cloud.service.PhoneService;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.ExcelUtil;
import com.huawei.cloud.util.FileUtil;
import com.huawei.cloud.util.ResponseUtil;

import net.sf.json.JSONObject;

@RequestMapping
@Controller
public class UploadAndDownController {

	private Logger logger = Logger.getRootLogger();

	@Autowired
	private PhoneService phoneService;

	/*
	 * =================================================
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/upload_excel",method=RequestMethod.POST) public
	 * JSONObject upload_excel(@RequestParam("file") MultipartFile file,
	 * HttpServletResponse response,HttpServletRequest request)throws Exception
	 * {
	 * logger.info("upload"+"{===filename==="+file.getOriginalFilename()+"===}")
	 * ;
	 * 
	 * JSONObject result = new JSONObject(); HttpSession session
	 * =request.getSession(); Integer empno = (Integer)
	 * session.getAttribute("empno");
	 * 
	 * if(!file.isEmpty()){ String
	 * webPath=request.getServletContext().getRealPath(""); String filePath=
	 * "/static/upload_file/excel/"; //把文件名子换成（时间搓.png） String
	 * fileName=DateUtil.formatDate(new Date(),
	 * "yyyyMMdd-HHmmssSSS")+"_"+file.getOriginalFilename();
	 * FileUtil.makeDirs(webPath+filePath); //保存服务器 file.transferTo(new
	 * File(webPath+filePath+fileName)); //解析 List<String> list =
	 * excel_to_clientInfo(new File(webPath+filePath+fileName));
	 * logger.info("liseSize"+"{===size===="+list.size()+"===}"); //循环执行 for
	 * (String string : list) { PhoneNum phoneNum = new PhoneNum();
	 * phoneNum.setEmpno(empno); phoneNum.setTelephone(string);
	 * phoneService.insertSelective(phoneNum); } Map<String, Integer> map = new
	 * HashMap<String, Integer>(); for (String string : list) { map.put(string,
	 * empno); } phoneService.insertMapBatche(map); //解析
	 * 可以获取了电话号码,接下来调用service存进数据库 for (Entry<String, Integer> entry :
	 * map.entrySet()) { System.out.println("map的key"+entry.getKey());
	 * System.out.println("map的empno"+ entry.getValue()); } //删除用过的文件
	 * FileUtil.deleteFile(webPath+filePath+fileName); //删除用过的文件 }
	 * result.put("success", true); result.put("msg", "导入成功"); return result;
	 * ================================================ }
	 */

	@ResponseBody
	@RequestMapping(value = "/upload_excel", method = RequestMethod.POST)
	public JSONObject upload_excel(@RequestParam("file") MultipartFile file, String tablename,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
		logger.info("upload" + "{===filename===" + file.getOriginalFilename() + "===}");
		JSONObject result = new JSONObject();
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");

		if (!file.isEmpty()) {
			String webPath = request.getServletContext().getRealPath("");
			String filePath = "/static/upload_file/excel/";
			// 把文件名子换成（时间搓.png）
			String fileName = DateUtil.formatDate(new Date(), "yyyyMMdd-HHmmssSSS") + "_" + file.getOriginalFilename();
			FileUtil.makeDirs(webPath + filePath);
			// 保存服务器
			file.transferTo(new File(webPath + filePath + fileName));

			Map<String, Object> sqlmap = new HashMap<String, Object>();

			// 解析
			List<String> list = excel_to_clientInfo(new File(webPath + filePath + fileName));

			logger.info("liseSize" + "{===size====" + list.size() + "===}");

			// 循环执行
			sqlmap.put("tablename", tablename);
			sqlmap.put("empno", empno);
			sqlmap.put("list", list);

			phoneService.insertdynamictable(sqlmap);

			// 删除用过的文件
			FileUtil.deleteFile(webPath + filePath + fileName);
			// 删除用过的文件
		}
		result.put("success", true);
		result.put("msg", "导入成功");
		return result;
	}

	private List<String> excel_to_clientInfo(File userUploadFile) throws ParseException {
		List<String> list = new ArrayList<String>();
		try {
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(userUploadFile));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			// 获取第一个sheet页
			HSSFSheet sheet = wb.getSheetAt(0);
			if (sheet != null) {
				for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
					HSSFRow row = sheet.getRow(rowNum);
					if (row == null) {
						continue;
					}
					list.add(ExcelUtil.formatCell(row.getCell(0)));
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 下载客户资料 导出 excel 使用我们的模板导出 / 模板路径 /static/client_down_model.xls"
	 */
	@RequestMapping("/excel_down")
	public String excel_down(@RequestParam(value = "tablename", required = false) String tablename,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		logger.info("{export==user==" + empno + "===excel===}");
		String webPath = request.getServletContext().getRealPath("/");
		Map<String, Object> exportmap = new HashMap<>();	
		exportmap.put("tablename", tablename);
		exportmap.put("empno", empno);

		List<PhoneNum> list = phoneService.exportDynamicTable(exportmap);

		logger.info("下载的大小"+list.size());
		Workbook wb = fillExcelDataWithTemplate(list, webPath + "/static/client_down_model.xls");
		ResponseUtil.export(response, wb, DateUtil.getCurrentDateStr() + ".xls");
		return null;
	}

	/**
	 * @param templateFileUrl
	 *            模板路径 /static/client_down_model.xls"
	 * @return
	 */
	public static Workbook fillExcelDataWithTemplate(List<PhoneNum> list, String templateFileUrl) {

		Workbook wb = null;
		try {
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(templateFileUrl));
			wb = new HSSFWorkbook(fs);
			// 取得 模板的 第一个sheet 页
			Sheet sheet = wb.getSheetAt(0);
			Sheet sheet2 =wb.getSheetAt(1);
			// 拿到sheet页有 多少列
			/*
			 * int cellNums = sheet.getRow(0).getLastCellNum();
			 */ // 从第2行 开搞 下标1 就是第2行
			if (list.size()>60000) {
				for(int i=0;i<=65000;i++){	
					Row row;
					row = sheet.createRow(i);	
					row.createCell(0).setCellValue(list.get(i).getTelephone());
				}
				for(int i=65000;i<list.size();i++){
					Row row;
					row = sheet2.createRow(i-65000);	
					row.createCell(0).setCellValue(list.get(i).getTelephone());
					
				}		
			}else{				// 拿到sheet页有 多少列
	/*			int cellNums = sheet.getRow(0).getLastCellNum();
	*/			// 从第2行 开搞    下标1  就是第2行
				int rowIndex = 1;
				Row row ; 
				for(PhoneNum phoneNum : list){
					row = sheet.createRow(rowIndex);
					rowIndex ++;
					row.createCell(0).setCellValue(phoneNum.getTelephone());
		 
				}
			 
		}
			}
			catch (IOException e) {
			e.printStackTrace();
		}
		return wb;
	}

	/**
	 * 下载客户资料 导出 excel 使用我们的模板导出 /
	 */
	@RequestMapping("/excel_downAdmin")
	public String excel_downAdmin(HttpServletResponse response, HttpServletRequest request) throws Exception {
		logger.info("export" + "{=== excel====Admin-notUsed==}");

		String webPath = request.getServletContext().getRealPath("/");
		//
		List<PhoneNum> list = phoneService.findALLAdminWithoutUsed();
		 logger.info("下载的大小"+list.size());
		Workbook wb = fillExcelDataWithTemplate(list, webPath + "/static/client_down_model.xls");
		ResponseUtil.export(response, wb, DateUtil.getCurrentDateStr() + ".xls");
		return null;
	}

}
