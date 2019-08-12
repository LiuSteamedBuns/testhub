package com.huawei.cloud.service;

import java.util.Date;
import java.util.List;

import com.huawei.cloud.bean.CardSend;

public interface CardSengService {

	Integer countCardRecord(Integer middletag,Integer empno);

	List<CardSend> downCardSend(Integer empno,Integer middletag);

	void deleteCard(Integer middletag, Integer empno);
	
	void saveCardSend(String comnum,Date date,String phonenum,String carddetails,Integer middletag,Integer empno);
	
}
