package com.huawei.cloud.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.AllPhone;
import com.huawei.cloud.bean.FailSend;
import com.huawei.cloud.bean.GetFail;
import com.huawei.cloud.bean.HistorySame;
import com.huawei.cloud.bean.Pending;
import com.huawei.cloud.bean.Repetition;
import com.huawei.cloud.bean.SuccessGet;
import com.huawei.cloud.bean.SuccessLogin;
import com.huawei.cloud.bean.Succreturn;
import com.huawei.cloud.dao.AllPhoneMapper;
import com.huawei.cloud.dao.FailSendMapper;
import com.huawei.cloud.dao.GetFailMapper;
import com.huawei.cloud.dao.HistorySameMapper;
import com.huawei.cloud.dao.PendingMapper;
import com.huawei.cloud.dao.RepetitionMapper;
import com.huawei.cloud.dao.SuccessGetMapper;
import com.huawei.cloud.dao.SuccessLoginMapper;
import com.huawei.cloud.dao.SuccreturnMapper;
import com.huawei.cloud.service.StatisticsService;

@Service
public class StatisticsServiceImpl implements StatisticsService {

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
	public List<AllPhone> selectAllphone(Integer middlename,Integer empno) {

		return phoneMapper.selectAllphone(middlename,empno);

	}

	@Override
	public List<FailSend> selectFailSend(Integer middlename,Integer empno) {

		return failSendMapper.selectFailSend(middlename,empno);

	}


	@Override
	public List<GetFail> selectGetfailphone(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return getFailMapper.selectGetfailphone(middlename,empno);
	}

	@Override
	public List<SuccessGet> selectSuccessGet(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return successGetMapper.selectSuccessGet(middlename,empno);
	}
	
	
	@Override
	public List<SuccessLogin> selectSuccessLogin(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return  successLoginMapper.selectSuccessLogin(middlename,empno);
	}
	
	@Override
	public Integer countAllphone(Integer middlename,Integer empno) {
		return phoneMapper.countAllphone(middlename,empno);
	}

	
	@Override
	public Integer countSuccessGet(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return successGetMapper.countSuccessGet(middlename,empno);
	}


	@Override
	public Integer countGetfailphones(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return getFailMapper.countGetfailphones(middlename,empno);
	}

	@Override
	public Integer countFailSend(Integer middlename,Integer empno) {
		return failSendMapper.countFailSend(middlename,empno);
	}

	@Override
	public Integer countSuccessLogin(Integer middlename,Integer empno) {
		// TODO Auto-generated method stub
		return successLoginMapper.countSuccessLogin(middlename,empno);
	}

	@Override
	public void addAllphone(String alltelephone,Integer middlename,Integer empno) {
		
		phoneMapper.insertAllphone(alltelephone,middlename,empno);
		
	}

	@Override
	public void addFailsend(String sendfail,Integer middlename,Integer empno) {
		
		failSendMapper.addFailsend(sendfail,middlename,empno);		
	}

	@Override
	public void addGetfail(String getfailsendphone,Integer middlename,Integer empno) {
		getFailMapper.addGetfail(getfailsendphone,middlename,empno);
	}
 
	@Override
	public void addSuccessGet(String successgetphone,Integer middlename,Integer empno) {
		successGetMapper.addSuccessGet(successgetphone,middlename,empno);			
	}

	@Override
	public void addSuccessLogin(String successphone,Integer middlename,Integer empno) {
		Date date = new Date();
		successLoginMapper.addSuccessLogin(successphone,middlename,empno,date);
	}

	@Override
	public void addPending(String ppending, Integer middlename,Integer empno) {
		pendingMapper.addPending(ppending,middlename,empno);
		
	}

	@Override
	public void addSuccReturn(String succreturn, Integer middlename,Integer empno) {
		
		Date date = new Date();

		succreturnMapper.addSuccReturn(succreturn,middlename,empno,date);
	
	}

	@Override
	public Integer countSuccReturn(Integer middlename,Integer empno) {
		return succreturnMapper.countSuccReturn(middlename,empno);
		  
	}

	@Override
	public Integer countHistory() {
		return  historyMapper.countHistory();
	}
	

	@Override
	public Integer conutPending(Integer middlename,Integer empno) {
		return pendingMapper.conutPending(middlename,empno);
	}
	
	
	
	

	@Override
	public List<Pending> selectPending(Integer middlename,Integer empno) {
		
		return  pendingMapper.selectPending(middlename,empno);
	}

	@Override
	public List<Succreturn> selectSuccreturn(Integer middlename,Integer empno) {
		 
		return  succreturnMapper.selectSuccreturn(middlename,empno);
	}

	@Override
	public String recePhon(String phonenum) {
		return succreturnMapper.selectByPhone(phonenum);
	}

	@Override
	public String seleLogin(String phonenum) {
		return successLoginMapper.seleLogin(phonenum);
	}

	@Override
	public void addRecordGetSuccess(String successphone) {

		Date adddate = new Date();
		historyMapper.saveHistory(successphone,adddate);		
	}

	@Override
	public List<HistorySame> searchSameHistory(String successgetphone) {
		return historyMapper.searchSameHistory(successgetphone);
	}

	@Override
	public void addRepetition(Integer empno,Date adddate,String repetition,Date olddate,Integer middletag) {
		
		repetitionMapper.addRepetition(empno, adddate, repetition,olddate,middletag);
		
	}

	@Override
	public List<Repetition> downRepetition(Integer empno,Integer middletag) {
		return repetitionMapper.downRepetition(empno,middletag);
	}

	@Override
	public Integer countRepetition(Integer empno,Integer middletag) {
		return  repetitionMapper.countRepetition(empno,middletag);
	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	

}
