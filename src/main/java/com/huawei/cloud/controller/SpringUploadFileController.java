package com.huawei.cloud.controller;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.cloud.bean.Txtupload;
import com.huawei.cloud.service.TxtUpService;
import com.huawei.cloud.util.MSG;

@Controller
public class SpringUploadFileController {

	/**
	 * 日志记录对象
	 */
	private Logger logger = Logger.getRootLogger();

	@Autowired
	TxtUpService txtUpService;

	/**
	 * 删除文件，
	 * 
	 * @param request请求
	 * @param filePath文件路径
	 *            (static/upload/...)
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/fileDelete",method=RequestMethod.POST)
	public MSG fileDelete(HttpServletRequest request,@RequestParam("txtname")String txtname) {
		logger.info("文件名字:"+txtname);

	    String ctxPath = request.getSession().getServletContext().getRealPath("/")+"upload/";
	    logger.debug("==============得到文件的路径======================"+ctxPath);
	    String delePath = ctxPath + txtname;
	    logger.debug("====================删除的路径:============================"+delePath);

		
		File file = new File(delePath);	
		logger.debug("=================文件是否存在======================"+file.exists());
			file.delete();
		txtUpService.deleteTxt(txtname);			
		return MSG.success();
	}
 	
	/**
	 * 读取文件 返回给lua脚本;
	 * 
	 * @param 文件名字   filename
	 * @return json
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping("/readFile")
	public StringBuffer readFile(HttpServletRequest request,@RequestParam("txtname")String txtname){


	    String ctxPath = request.getSession().getServletContext().getRealPath("/")+"upload/";
	    logger.debug("==============得到文件的路径======================"+ctxPath);
	    String readPath = ctxPath + txtname;
	    logger.debug("====================下载的路径:============================"+readPath);

		
		File file  = new File(readPath);
		StringBuffer sbf = new StringBuffer();
		
		
		try (   
				InputStream is = new FileInputStream(file);  
				InputStreamReader inputS = new InputStreamReader(is,"GBK");
	            BufferedReader br = new BufferedReader(inputS); // 建立一个对象，它把文件内容转成计算机能读懂的语言
			)				 
				 {
	            String line;
	         
	            while ((line = br.readLine()) != null) {
	               
	                sbf.append(line);                 
	              }
	            br.close();
	            inputS.close();
	            is.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
        return sbf;
  
	}
  
	@ResponseBody
	@RequestMapping("/listTxtByempno")
	public MSG listTxtByempno(HttpServletRequest request) {

		HttpSession session = request.getSession();
		Integer empno = (Integer) session.getAttribute("empno");
		List<Txtupload> list = txtUpService.listTxtAll(empno);
		return MSG.success().add("list", list);

	}

}
