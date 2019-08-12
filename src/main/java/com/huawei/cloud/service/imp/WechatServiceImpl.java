package com.huawei.cloud.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.WeChat;
import com.huawei.cloud.dao.WeChatMapper;
import com.huawei.cloud.service.WechatService;


@Service
public class WechatServiceImpl implements WechatService {
	
	@Autowired
	WeChatMapper mapper;
	 
	@Override
	public void addWechat(Integer adwid,String addwxid, String addwxname, String gender, String addtime, String localid,
			String localname) {
		WeChat weChat = new WeChat();
		weChat.setAdwid(adwid);
		weChat.setAddtime(addtime);
		weChat.setAddwxid(addwxid);
		weChat.setAddwxname(addwxname);
		weChat.setGender(gender);
		weChat.setLocalid(localid);
		weChat.setLocalname(localname);
		mapper.insertSelective(weChat);
			 
	}

	@Override
	public List<WeChat> downWechat(Integer adwid) {
		return mapper.selectDownWechat(adwid);
		
	}

	@Override
	public void deleteWechat(Integer adwid) {

		mapper.deleteWechat(adwid);
		
	}

	@Override
	public Integer countWechat(Integer adwid) {
		return mapper.countWechat(adwid)	;
	}

 
		
}	
