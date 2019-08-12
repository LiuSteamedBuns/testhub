package com.huawei.cloud.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huawei.cloud.bean.PhoneNum;
import com.huawei.cloud.dao.PhoneNumMapper;
import com.huawei.cloud.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	PhoneNumMapper phoneNumMapper;

	@Override
	public List<PhoneNum> findALL() {
		List<PhoneNum> phoneNums  =  phoneNumMapper.findALL();
		return phoneNums;
	}
	
	public List<PhoneNum> findALLWithEmpno(Map<String,Object> sqlmap) {
		List<PhoneNum> phoneNums  =  phoneNumMapper.findALLWithEmpno(sqlmap);
		return phoneNums;
	}

	public void deletePhone(Map<String,Object> sqlmap) {
		phoneNumMapper.deleteByPidkey(sqlmap);	
	}

	@Override
	public void deleteBatch(Map<String,Object> sqlmap) {
		
		phoneNumMapper.deleteBatch(sqlmap);
	

	}

	@Override
	public List<PhoneNum> findALLWithoutUsed(Map<String,Object> sqlmap) {
		List<PhoneNum> phoneNums  =  phoneNumMapper.findALLWithoutUsed(sqlmap);
		return phoneNums;
	}

	@Override
	public List<PhoneNum> findALLWithUsed(Map<String,Object> sqlmap) {
		List<PhoneNum> phoneNums  =  phoneNumMapper.findALLWithUsed(sqlmap);

		return phoneNums;
	}

	@Override   //批量更新为已使用
	public void updateToUsed(Map<String,Object> sqlmap) {
		phoneNumMapper.updateToUsed(sqlmap);

	}

	@Override  
	public void updateOneToUsed(Map<String,Object> sqlmap) {
		phoneNumMapper.updateOneToUsed(sqlmap);
		
	}

	@Override	//批量更新为未使用
	public void updateToNotUsed(Map<String,Object> sqlmap) {
		phoneNumMapper.updateToNotUsed(sqlmap);	
	}

	@Override
	public void updateOneToNotUsed(Map<String,Object> sqlmap) {
		phoneNumMapper.updateOneToNotUsed(sqlmap);
	}

	@Override
	public List<PhoneNum> findALLAdminWithUsed() {
	
		return phoneNumMapper.findALLAdminWithUsed();
	}
	
	@Override
	public List<PhoneNum> findALLAdminWithoutUsed() {
		
		return phoneNumMapper.findALLAdminWithoutUsed();
		
	}

	/**
	 * 
	 * 新增数据
	 */
	@Override
	public void insertSelective(PhoneNum record){
			
		phoneNumMapper.insertSelective(record);		
	}
	
	
	@Override
	public void emptyUserDataById(Map<String,Object> sqlmap) {
		
		phoneNumMapper.emptyUserDataById(sqlmap);
		
	}
	
	@Transactional
	@Override
	public void insertdynamictable(Map<String, Object> sqlmap)throws Exception {
		 phoneNumMapper.insertdynamictable(sqlmap);
	}

	@Override
	public List<PhoneNum> exportDynamicTable(Map<String,Object> exportmap) {
		return phoneNumMapper.exportDynamicTable(exportmap);
	}

	@Override
	public Integer findCountUsed(Map<String, Object> sqlmap) {
		return	phoneNumMapper.findCountUsed(sqlmap);
		
	}

	@Override
	public Integer findCountNotUsed(Map<String, Object> sqlmap) {	
		return phoneNumMapper.findCountNotUsed(sqlmap);
	}

		
}
