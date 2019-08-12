package com.huawei.cloud.service;


public interface TrunateService {
	
	
	 void deleteALLNum(Integer middlename,Integer empno);
	
	 void deleteSuccLogin(Integer middlename,Integer empno);
	 
	 void deleteFaildSend(Integer middlename,Integer empno);
	 
	 void deleteSuccGet(Integer middlename,Integer empno);
	 
	 void deleteGetFailLogin(Integer middlename,Integer empno);

	void deletePending(Integer middlename,Integer empno);

	void deleteSuccreturn(Integer middlename,Integer empno);
	
	void delHistory();
	
	void delRepetition(Integer empno,Integer middletag);
	
	
	
	
	
	
	
	
}
