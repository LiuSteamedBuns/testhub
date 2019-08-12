package com.huawei.cloud.service;

import java.util.List;
import java.util.Map;

import com.huawei.cloud.bean.PhoneNum;

public interface PhoneService {

	List<PhoneNum> findALL();

	List<PhoneNum> findALLWithEmpno(Map<String,Object> sqlmap);

	List<PhoneNum> findALLWithoutUsed(Map<String,Object> sqlmap);//未使用
	
	List<PhoneNum> findALLWithUsed(Map<String,Object> sqlmap);//查找使用s

	List<PhoneNum> findALLAdminWithoutUsed();
	
	List<PhoneNum> findALLAdminWithUsed();

	void deletePhone(Map<String,Object> sqlmap);

	void deleteBatch(Map<String,Object> sqlmap);

	void updateToUsed(Map<String,Object> sqlmap);//批量修改

	void updateOneToUsed(Map<String,Object> sqlmap);//单个修改

	void updateToNotUsed(Map<String,Object> sqlmap);

	void updateOneToNotUsed(Map<String,Object> sqlmap);

	void insertSelective(PhoneNum record);

	void emptyUserDataById(Map<String,Object> sqlmap);

	void insertdynamictable(Map<String, Object> sqlmap) throws Exception;

	List<PhoneNum> exportDynamicTable(Map<String,Object> exportmap);
	
	Integer findCountUsed(Map<String,Object> sqlmap);
    
	Integer findCountNotUsed(Map<String,Object> sqlmap);
    
	
	
	
}
