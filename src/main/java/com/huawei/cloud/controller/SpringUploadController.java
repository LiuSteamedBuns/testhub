package com.huawei.cloud.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.huawei.cloud.service.TxtUpService;



@RequestMapping
@Controller
public class SpringUploadController {
	
	/**
	 * 日志记录对象
	 */
	private Logger logger = Logger.getRootLogger();
	
	
	
	/*
     *采用spring提供的上传文件的方法
     */
    		@Resource
    	    HttpServletRequest request;
   		
            @Autowired
      	    TxtUpService txtUpService;
 		
    	    /**
    	     * @return  返回相对路径RelativePath
    	     */
    	    public String RelPath() {
    	        String path = request.getContextPath();
    	        return request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    	    }

    	    /**
    	     * @return  返回服务器目录的真实路径
    	     */
    	    public String RealPath() {
    	        return request.getSession().getServletContext().getRealPath("/");
    	    }

    	    /**
    	     *  单文件上传
    	     * 
    	     * @param File
    	     * @param request
    	     * @return
    	     * @throws Exception 
    	     */  
    	    @RequestMapping(value="/springUpload",method=RequestMethod.POST)    
    	    public String singleUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception{ 
    	    	
    	    	if (!file.isEmpty()) {
					        
    	        File dir = new File(RealPath()+"upload/");//1.新建一个文件夹对象
    	        if(!dir.exists()){              //2.检查路径下upload文件夹是否存在
    	            dir.mkdirs();
    	        }
    	        String filename = file.getOriginalFilename();
    	        HttpSession session  = request.getSession();
    	    	Integer empno  =(Integer) session.getAttribute("empno");
    	    			
    			String preffix = filename.substring(0,filename.indexOf("."));

    	        String suffix = filename.substring(filename.lastIndexOf('.'));
    	        
    			String latefilename = preffix+empno+suffix;
    	        
    	        File targetFile = new File(RealPath()+"upload/"+ latefilename);//3.在文件夹下新建一个filename文件的文件对象,此处新建文件应该新建在确切的物理路径下
    	        logger.info("目标文件的路径"+targetFile);
    	        String tarUrl = RealPath()+"upload/"+ latefilename;
    	       	if(!targetFile.exists()){//4.判断真实路径下是否存在filename文件
    	            try {
    	                targetFile.createNewFile();//5.在真实路径下创建filename空文件
    	            } catch (IOException e) {
    	                e.printStackTrace();
    	            }
    	        }
    	        try {
    	        	file.transferTo(targetFile);//6.复制文件到真实路径下
    	        	Date date = new Date();
       	        	txtUpService.saveTxtUpload(empno,  date , latefilename, tarUrl);     	
   	        	
    	        } catch (IllegalStateException e) {
    	            e.printStackTrace();
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
  	          	        
    	        return "user-main";         
    	        //非安全目录下使用(可用)
    	        //return "redirect:"+RealPath()+"upload/"+filename;        //重定向到真实地址(不可用)
    	        //return "redirect:http://localhost:8080/SpringMvcTest/upload/"+filename;
    	    }else {	    	
				return "user-main";
			}
   } 
}
