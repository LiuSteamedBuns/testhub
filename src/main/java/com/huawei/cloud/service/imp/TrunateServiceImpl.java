package com.huawei.cloud.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.dao.AllPhoneMapper;
import com.huawei.cloud.dao.FailSendMapper;
import com.huawei.cloud.dao.GetFailMapper;
import com.huawei.cloud.dao.HistorySameMapper;
import com.huawei.cloud.dao.PendingMapper;
import com.huawei.cloud.dao.RepetitionMapper;
import com.huawei.cloud.dao.SuccessGetMapper;
import com.huawei.cloud.dao.SuccessLoginMapper;
import com.huawei.cloud.dao.SuccreturnMapper;
import com.huawei.cloud.service.TrunateService;

@Service
public class TrunateServiceImpl implements TrunateService {
	
	@Autowired
	AllPhoneMapper phoneMapper;

	@Autowired
	FailSendMapper failSendMapper;

	@Autowired
	GetFailMapper getFailMapper;

	@Autowired
	SuccessGetMapper successGetMapper;

	@Autowired
	SuccessLoginMapper successLoginMapper;
	
	@Autowired
	SuccreturnMapper succreturnMapper;
	
	@Autowired
	PendingMapper pendingMapper;
	
	@Autowired
	HistorySameMapper historyMapper;
	

	@Autowired
	RepetitionMapper repetitionMapper;
	
	
	@Override
	public void deleteALLNum(Integer middlename,Integer empno) {
		phoneMapper.deleteALLNum(middlename,empno);
		
	}

	@Override
	public void deleteSuccLogin(Integer middlename,Integer empno) {
		successLoginMapper.deleteSuccLogin(middlename,empno);
		
	}

	@Override
	public void deleteFaildSend(Integer middlename,Integer empno) {
		failSendMapper.deleteFaildSend(middlename,empno);
	}

	@Override
	public void deleteSuccGet(Integer middlename,Integer empno) {
		successGetMapper.deleteSuccGet(middlename,empno);
		
	}

	@Override
	public void deleteGetFailLogin(Integer middlename,Integer empno) {
		getFailMapper.deleteGetFailLogin(middlename,empno);
		
	}

	@Override
	public void deletePending(Integer middlename,Integer empno) {
		pendingMapper.deletePending(middlename,empno);
		
	}

	@Override
	public void deleteSuccreturn(Integer middlename,Integer empno) {
		succreturnMapper.deleteSuccreturn(middlename,empno);
	}

	@Override
	public void delHistory() {
		historyMapper.delHistory();
	}

	@Override
	public void delRepetition(Integer empno,Integer middletag) {
		repetitionMapper.delRepetition(empno,middletag);
		
	}

	
	
	
	
}
