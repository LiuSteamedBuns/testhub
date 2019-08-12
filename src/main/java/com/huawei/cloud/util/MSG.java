package com.huawei.cloud.util;

import java.util.HashMap;
import java.util.Map;

public class MSG {
	
	private Integer code;
	private String msg;
	
	private  Map<String, Object> extend = new HashMap<>();

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	public static MSG success(){
		MSG result  = new MSG();
		result.setCode(100);
		result.setMsg("处理成功");
		return result;
	}
	
	
	public  MSG successOne(){
		MSG result  = new MSG(extend);		
		return result;
	}
	
	public MSG addOne(String key,Object value){
		this.getExtend().put(key, value);
		return this;
		
	}
	public MSG(Map<String, Object> extend) {	
		this.extend = extend;
	}
	
	
		
	public static MSG fail(){
		MSG result  = new MSG();
		result.setCode(200);
		result.setMsg("处理失败");
		return result;
	}
	
	public MSG add(String key,Object value){
		this.getExtend().put(key, value);
		return this;
		
	}
	
	
	public MSG() {
		super();
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", extend=" + extend + "]";
	}

	public MSG(Integer code, String msg, Map<String, Object> extend) {
		super();
		this.code = code;
		this.msg = msg;
		this.extend = extend;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	

}
