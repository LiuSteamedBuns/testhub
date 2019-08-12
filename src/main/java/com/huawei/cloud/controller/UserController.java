package com.huawei.cloud.controller;


import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.cloud.bean.User;
import com.huawei.cloud.service.UserService;

@Controller
@RequestMapping
public class UserController {
	
	/**
	 * 日志记录对象
	 */
	private Logger logger = Logger.getRootLogger();
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)	
	public ModelAndView  checkLogin(@Param("username") String username,@Param("password")String password,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		User user =userService.checkedLogin(username);
		
		if(user!=null &&  password.equals(user.getPassword())){
			session.setAttribute("username", user.getEname());
			session.setAttribute("empno", user.getEmpno());			
			if (user.getRole()!=null && user.getRole()==0) {
				mv.setViewName("admin-main");
				logger.info("login"+"{======"+username+"======succuss}");

				return mv;
			}
			else if (user.getRole()!=null && user.getRole()==2) {
				if(password.equals(user.getPassword())){
					mv.setViewName("comm-main");
					logger.info("login"+"{======"+username+"======succuss}");

					return  mv;
				}
			}
			
			else if (user.getRole()!=null && user.getRole()==4) {
				if(password.equals(user.getPassword())){
					mv.setViewName("wechat-main");
					logger.info("login"+"{======"+username+"======succuss}");

					return  mv;
				}
			}
			
			
			else if (user.getRole()!=null && user.getRole()==3) {
				if(password.equals(user.getPassword())){
					mv.setViewName("other-main");
					logger.info("login"+"{======"+username+"======succuss}");

					return  mv;
				}
			}
			else {
					session.setAttribute("empno", user.getEmpno());
					session.setAttribute("username", user.getEname());
					mv.setViewName("user-main");
					logger.info("login"+"{======"+username+"======succuss}");

					return  mv;					
			}			
		}		
		mv.addObject("errormessage","用户名密码错误，请重新输入");
		return new ModelAndView("redirect:/index.jsp");
	}	
	
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session){
		session.invalidate();
		return "redirect:/index.jsp";
	}	
}
