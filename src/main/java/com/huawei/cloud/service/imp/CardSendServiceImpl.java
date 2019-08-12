package com.huawei.cloud.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.CardSend;
import com.huawei.cloud.dao.CardSendMapper;
import com.huawei.cloud.service.CardSengService;

@Service
public class CardSendServiceImpl implements CardSengService {

	@Autowired
	CardSendMapper cardmapper;
	
	
	@Override
	public Integer countCardRecord(Integer middletag,Integer empno) {
		return cardmapper.countCardRecord(middletag,empno);
		 
	}

	@Override
	public List<CardSend> downCardSend(Integer empno, Integer middletag) {
		return cardmapper.downCardSend(empno, middletag);
	}

	@Override
	public void deleteCard(Integer middletag, Integer empno) {
		cardmapper.deleteCard(middletag,empno);
		
	}

 
	@Override
	public void saveCardSend(String comnum, Date date, String phonenum, String carddetails, Integer middletag,
			Integer empno) {
		cardmapper.saveCardSend(comnum, date, phonenum, carddetails, middletag, empno);
		
	}
	
}
