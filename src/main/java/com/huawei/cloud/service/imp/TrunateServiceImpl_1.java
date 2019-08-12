package com.huawei.cloud.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.dao.AllPhone_1Mapper;
import com.huawei.cloud.dao.FailSend_1Mapper;
import com.huawei.cloud.dao.GetFail_1Mapper;
import com.huawei.cloud.dao.Pending_1Mapper;
import com.huawei.cloud.dao.SuccessGet_1Mapper;
import com.huawei.cloud.dao.SuccessLogin_1Mapper;
import com.huawei.cloud.dao.Succreturn_1Mapper;
import com.huawei.cloud.service.TrunateService_1;

@Service
public class TrunateServiceImpl_1 implements TrunateService_1 {
	
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
	public void deleteALLNum_1(Integer middlename) {
		phoneMapper.deleteALLNum_1(middlename);
		
	}

	@Override
	public void deleteSuccLogin_1(Integer middlename) {
		successLoginMapper.deleteSuccLogin_1(middlename);
		
	}

	@Override
	public void deleteFaildSend_1(Integer middlename) {
		failSendMapper.deleteFaildSend_1(middlename);
	}

	@Override
	public void deleteSuccGet_1(Integer middlename) {
		successGetMapper.deleteSuccGet_1(middlename);
		
	}

	@Override
	public void deleteGetFailLogin_1(Integer middlename) {
		getFailMapper.deleteGetFailLogin_1(middlename);
		
	}

	@Override
	public void deletePending_1(Integer middlename) {
		pendingMapper.deletePending_1(middlename);	
	}

	@Override
	public void deleteSuccreturn_1(Integer middlename) {
		succreturnMapper.deleteSuccreturn_1(middlename);
	}

	
	
	
	
	
	
	
	
}
