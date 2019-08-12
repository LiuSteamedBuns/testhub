package com.huawei.cloud.service;

import java.util.Date;
import java.util.List;

import com.huawei.cloud.bean.AllPhone;
import com.huawei.cloud.bean.FailSend;
import com.huawei.cloud.bean.GetFail;
import com.huawei.cloud.bean.HistorySame;
import com.huawei.cloud.bean.Pending;
import com.huawei.cloud.bean.Repetition;
import com.huawei.cloud.bean.SuccessGet;
import com.huawei.cloud.bean.SuccessLogin;
import com.huawei.cloud.bean.Succreturn;

public interface StatisticsService {

	List<AllPhone> selectAllphone(Integer middlename,Integer empno);

	Integer countAllphone(Integer middlename,Integer empno);

	List<FailSend> selectFailSend(Integer middlename,Integer empno);

	Integer countFailSend(Integer middlename,Integer empno);

	List<GetFail> selectGetfailphone(Integer middlename,Integer empno);

	Integer countGetfailphones(Integer middlename,Integer empno);

	List<SuccessGet> selectSuccessGet(Integer middlename,Integer empno);

	Integer countSuccessGet(Integer middlename,Integer empno);

	List<SuccessLogin> selectSuccessLogin(Integer middlename,Integer empno);

	Integer countSuccessLogin(Integer middlename,Integer empno);

	void addAllphone(String alltelephone, Integer middlename,Integer empno);

	void addFailsend(String sendfail, Integer middlename,Integer empno);

	void addGetfail(String getfailsendphone, Integer middlename,Integer empno);

	void addSuccessGet(String successgetphone, Integer middlename,Integer empno);

	void addSuccessLogin(String successphone, Integer middlename,Integer empno);

	void addPending(String ppending, Integer middlename,Integer empno);

	void addSuccReturn(String succreturn, Integer middlename,Integer empno);

	Integer conutPending(Integer middlename,Integer empno);

	Integer countSuccReturn(Integer middlename,Integer empno);
	
	List<Pending> selectPending(Integer middlename,Integer empno);
	
	List<Succreturn> selectSuccreturn(Integer middlename,Integer empno);
	
	String recePhon(String phonenum);

	String seleLogin(String phonenum);

	void addRecordGetSuccess(String successphone);
	
	Integer countHistory();

	List<HistorySame> searchSameHistory(String successgetphone);
	
	void addRepetition(Integer empno,Date adddate,String repetition,Date olddate,Integer middletag);
	
    List<Repetition> downRepetition(Integer empno,Integer middletag);
    
    Integer countRepetition(Integer empno,Integer middletag);

	
}
