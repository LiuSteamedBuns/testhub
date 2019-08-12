package com.huawei.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedictController {
	

	@RequestMapping("/cn")
	public String r(@RequestParam(value="a") String a){
		
		return "redirect: https://dh1.ffhrjl.cn/?c=500138";
	}
	
	@RequestMapping("/rp")
	public String e(@RequestParam(value="b") String b){
		
		return "redirect: https://dh1.ffhrjl.cn/?c=500072";
	}
	
	@RequestMapping("/qd")
	public String d(@RequestParam(value="r") String r){
		
		return "redirect: https://game.ecqla.cn/static/html/download/download_apk.html?userid=B004000&pid=105504";
	}
	
	
	@RequestMapping("/al")
	public String i(@RequestParam(value="o") String o){
		
		return "redirect: https://app.54zms.com/?c=600";
	}
	
	
}
