package com.huawei.cloud.service;

import java.util.List;

import com.huawei.cloud.bean.WeChat;

public interface WechatService {

	void addWechat(Integer adwid,String addwxid, String addwxname, String gender, String addtime, String localid, String localname);

	List<WeChat> downWechat(Integer adwid);

	void deleteWechat(Integer adwid);
	
	 Integer countWechat(Integer adwid);
	
	
}
