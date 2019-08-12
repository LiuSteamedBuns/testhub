package com.huawei.cloud.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.bean.CardSend;
import com.huawei.cloud.service.CardSengService;
import com.huawei.cloud.util.DateUtil;
import com.huawei.cloud.util.MSG;
import com.huawei.cloud.util.ResponseUtil;

@Controller
public class CardSendController {

	String COM[] = new String[] { "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM10",
			"COM11", "COM12", "COM13", "COM14", "COM15", "COM16", "COM17", "COM18", "COM19", "COM20", "COM21", "COM22",
			"COM23", "COM24", "COM25", "COM26", "COM27", "COM28", "COM29", "COM30", "COM31", "COM32", "COM33", "COM34",
			"COM35", "COM36", "COM37", "COM38", "COM39", "COM40", "COM41", "COM42", "COM43", "COM44", "COM45", "COM46",
			"COM47", "COM48", "COM49", "COM50", "COM51", "COM52", "COM53", "COM54", "COM55", "COM56", "COM57", "COM68",
			"COM59", "COM60", "COM61", "COM62", "COM63", "COM64", "COM65", "COM66", "COM67", "COM58", "COM69", "COM70",
			"COM71", "COM72", "COM73", "COM74", "COM75", "COM76", "COM77", "COM88", "COM79", "COM80", "COM81", "COM82",
			"COM83", "COM84", "COM85", "COM86", "COM87", "COM98", "COM89", "COM90", "COM91", "COM92", "COM93", "COM94",
			"COM95", "COM96", "COM97", "COM78", "COM99", "COM100", };

	@Autowired
	CardSengService service;

	@ResponseBody
	@RequestMapping("/cardSendList")
	public MSG cardSendRecord(HttpServletRequest request, @RequestParam String numlist) {
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");

		String arr[] = numlist.split("-");
		Integer inarr[] = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			Integer num = Integer.parseInt(arr[i]);
			inarr[i] = num;
		}
		Integer CardRecord1 = service.countCardRecord(inarr[0], empno);
		Integer CardRecord2 = service.countCardRecord(inarr[1], empno);
		Integer CardRecord3 = service.countCardRecord(inarr[2], empno);
		Integer CardRecord4 = service.countCardRecord(inarr[3], empno);
		Integer CardRecord5 = service.countCardRecord(inarr[4], empno);
		Integer CardRecord6 = service.countCardRecord(inarr[5], empno);
		Integer CardRecord7 = service.countCardRecord(inarr[6], empno);
		Integer CardRecord8 = service.countCardRecord(inarr[7], empno);
		Integer CardRecord9 = service.countCardRecord(inarr[8], empno);
		Integer CardRecord10 = service.countCardRecord(inarr[9], empno);

		List<Integer> counlist = new ArrayList<>();
		counlist.add(CardRecord1);
		counlist.add(CardRecord2);
		counlist.add(CardRecord3);
		counlist.add(CardRecord4);
		counlist.add(CardRecord5);
		counlist.add(CardRecord6);
		counlist.add(CardRecord7);
		counlist.add(CardRecord8);
		counlist.add(CardRecord9);
		counlist.add(CardRecord10);

		return MSG.success().add("list", counlist);
	}

	@ResponseBody
	@RequestMapping("/addCardSend")
	public void saveCard(@RequestParam("phonenum") String phonenum, @RequestParam("middletag") Integer middletag,
			@RequestParam("carddetails") String carddetails, @RequestParam("empno") Integer empno) {
		String comnum = COM[new Random().nextInt(99)];
		Date date = new Date();

		service.saveCardSend(comnum, date, phonenum, carddetails, middletag, empno);

	}

	@RequestMapping("/deletecak")
	public String deleteCard(@RequestParam("middletag") Integer middletag, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		service.deleteCard(middletag, empno);

		return "cardsend";
	}

	public static Workbook fillExcelDataWithTemplate(List<CardSend> list, String templateFileUrl) {

		Workbook wb = null;
		try {
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(templateFileUrl));
			wb = new HSSFWorkbook(fs);
			// 取得 模板的 第一个sheet 页
			Sheet sheet = wb.getSheetAt(0);
			// 拿到sheet页有 多少列
			/*
			 * int cellNums = sheet.getRow(0).getLastCellNum();
			 */ // 从第2行 开搞 下标1 就是第2行
			int rowIndex = 1;
			Row row;
			Row ww = sheet.createRow(0);
			ww.createCell(0).setCellValue("端口号");
			ww.createCell(1).setCellValue("时间");
			ww.createCell(2).setCellValue("电话号码");
			ww.createCell(3).setCellValue("话术");
			for (CardSend cardSend : list) {
				row = sheet.createRow(rowIndex);
				rowIndex++;
				row.createCell(0).setCellValue(cardSend.getComnum());
				row.createCell(1).setCellValue(DateUtil.formatDate(cardSend.getDate(), "MM月dd日HH时mm分ss秒"));
				row.createCell(2).setCellValue(cardSend.getPhonenum());
				row.createCell(3).setCellValue(cardSend.getCarddetails());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb;
	}

	@RequestMapping("/excel_downCard")
	public String excel_downAdmin(@RequestParam(value = "middletag") Integer middletag, HttpServletResponse response,
			HttpServletRequest request)

			throws Exception {
		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");

		String webPath = request.getServletContext().getRealPath("/");

		List<CardSend> list = service.downCardSend(empno, middletag);

		Workbook wb = fillExcelDataWithTemplate(list, webPath + "/static/client_down_model.xls");

		ResponseUtil.export(response, wb, DateUtil.getCurrentDateStr() + ".xls");
		return null;
	}

	@RequestMapping("/cardSendDetail")
	public String cardSendDetail() {

		return "cardsend";
	}

}
