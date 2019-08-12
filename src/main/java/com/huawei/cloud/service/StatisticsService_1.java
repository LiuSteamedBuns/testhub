package com.huawei.cloud.service;

import java.util.List;

import com.huawei.cloud.bean.AllPhone_1;
import com.huawei.cloud.bean.FailSend_1;
import com.huawei.cloud.bean.GetFail_1;
import com.huawei.cloud.bean.Pending_1;
import com.huawei.cloud.bean.SuccessGet_1;
import com.huawei.cloud.bean.SuccessLogin_1;
import com.huawei.cloud.bean.Succreturn_1;

public interface StatisticsService_1 {

	List<AllPhone_1> selectAllphone_1(Integer middlename);

	Integer countAllphone_1(Integer middlename);

	List<FailSend_1> selectFailSend_1(Integer middlename);

	Integer countFailSend_1(Integer middlename);

	List<GetFail_1> selectGetfailphone_1(Integer middlename);

	Integer countGetfailphones_1(Integer middlename);

	List<SuccessGet_1> selectSuccessGet_1(Integer middlename);

	Integer countSuccessGet_1(Integer middlename);

	List<SuccessLogin_1> selectSuccessLogin_1(Integer middlename);

	Integer countSuccessLogin_1(Integer middlename);

	void addAllphone_1(String alltelephone, Integer middlename);

	void addFailsend_1(String sendfail, Integer middlename);

	void addGetfail_1(String getfailsendphone, Integer middlename);
	 
	void addSuccessGet_1(String successgetphone, Integer middlename);

	void addSuccessLogin_1(String successphone, Integer middlename);
	
	
	void addPending_1(String ppending, Integer middlename);

	void addSuccReturn_1(String succreturn, Integer middlename);

	Integer conutPending_1(Integer middlename);

	Integer countSuccReturn_1(Integer middlename);

	List<Succreturn_1> selectSuccreturn_1(Integer middlename);

	List<Pending_1> selectPending_1(Integer middlename);


	
	
	
	
	
	
	
	
	
	
	
	
	

}
