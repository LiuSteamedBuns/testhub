package com.huawei.cloud.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.AllPhone_1;
import com.huawei.cloud.bean.FailSend_1;
import com.huawei.cloud.bean.GetFail_1;
import com.huawei.cloud.bean.Pending_1;
import com.huawei.cloud.bean.SuccessGet_1;
import com.huawei.cloud.bean.SuccessLogin_1;
import com.huawei.cloud.bean.Succreturn_1;
import com.huawei.cloud.dao.AllPhone_1Mapper;
import com.huawei.cloud.dao.FailSend_1Mapper;
import com.huawei.cloud.dao.GetFail_1Mapper;
import com.huawei.cloud.dao.Pending_1Mapper;
import com.huawei.cloud.dao.SuccessGet_1Mapper;
import com.huawei.cloud.dao.SuccessLogin_1Mapper;
import com.huawei.cloud.dao.Succreturn_1Mapper;
import com.huawei.cloud.service.StatisticsService_1;

@Service
public class StatisticsServiceImpl_1 implements StatisticsService_1 {

	@Autowired
	AllPhone_1Mapper phoneMapper;

	@Autowired
	FailSend_1Mapper failSendMapper;

	@Autowired
	GetFail_1Mapper getFailMapper;

	@Autowired
	SuccessGet_1Mapper successGetMapper;

	@Autowired
	SuccessLogin_1Mapper successLoginMapper;
	
	@Autowired
	Succreturn_1Mapper succreturnMapper;
	
	@Autowired
	Pending_1Mapper pendingMapper;
	
	
	 
	@Override
	public List<AllPhone_1> selectAllphone_1(Integer middlename) {

		return phoneMapper.selectAllphone_1(middlename);

	}

	@Override
	public List<FailSend_1> selectFailSend_1(Integer middlename) {

		return failSendMapper.selectFailSend_1(middlename);

	}


	@Override
	public List<GetFail_1> selectGetfailphone_1(Integer middlename) {
		// TODO Auto-generated method stub
		return getFailMapper.selectGetfailphone_1(middlename);
	}

	@Override
	public List<SuccessGet_1> selectSuccessGet_1(Integer middlename) {
		// TODO Auto-generated method stub
		return successGetMapper.selectSuccessGet_1(middlename);
	}
	
	
	@Override
	public List<SuccessLogin_1> selectSuccessLogin_1(Integer middlename) {
		// TODO Auto-generated method stub
		return  successLoginMapper.selectSuccessLogin_1(middlename);
	}
	
	@Override
	public Integer countAllphone_1(Integer middlename) {
		return phoneMapper.countAllphone_1(middlename);
	}

	
	@Override
	public Integer countSuccessGet_1(Integer middlename) {
		// TODO Auto-generated method stub
		return successGetMapper.countSuccessGet_1(middlename);
	}


	@Override
	public Integer countGetfailphones_1(Integer middlename) {
		// TODO Auto-generated method stub
		return getFailMapper.countGetfailphones_1(middlename);
	}

	@Override
	public Integer countFailSend_1(Integer middlename) {
		return failSendMapper.countFailSend_1(middlename);
	}

	@Override
	public Integer countSuccessLogin_1(Integer middlename) {
		// TODO Auto-generated method stub
		return successLoginMapper.countSuccessLogin_1(middlename);
	}

	@Override
	public void addAllphone_1(String alltelephone,Integer middlename) {
		
		phoneMapper.insertAllphone_1(alltelephone, middlename);
		
	}

	@Override
	public void addFailsend_1(String sendfail,Integer middlename) {
		
		failSendMapper.addFailsend_1(sendfail,middlename);		
	}

	@Override
	public void addGetfail_1(String getfailsendphone,Integer middlename) {
		getFailMapper.addGetfail_1(getfailsendphone,middlename);
	}
 
	@Override
	public void addSuccessGet_1(String successgetphone,Integer middlename) {
		successGetMapper.addSuccessGet_1(successgetphone,middlename);			
	}

	@Override
	public void addSuccessLogin_1(String successphone,Integer middlename) {
		successLoginMapper.addSuccessLogin_1(successphone,middlename);
	}

	@Override
	public void addPending_1(String ppending, Integer middlename) {
		pendingMapper.addPending_1(ppending,middlename);
		
	}

	@Override
	public void addSuccReturn_1(String succreturn, Integer middlename) {
		succreturnMapper.addSuccReturn_1(succreturn,middlename);

		
	}

	@Override
	public Integer conutPending_1(Integer middlename) {
 	
 	return pendingMapper.conutPending_1(middlename);
	}

	@Override
	public Integer countSuccReturn_1(Integer middlename) {
		return succreturnMapper.countSuccReturn_1(middlename);
	}

	@Override
	public List<Succreturn_1> selectSuccreturn_1(Integer middlename) {
		// TODO Auto-generated method stub
		return  succreturnMapper.selectSuccreturn_1(middlename);
	}

	@Override
	public List<Pending_1> selectPending_1(Integer middlename) {
		// TODO Auto-generated method stub
		return pendingMapper.selectPending_1(middlename);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
