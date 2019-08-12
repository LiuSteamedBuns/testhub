package com.huawei.cloud.service;

import com.huawei.cloud.bean.PhoneNum;

public interface LuaPhoneSerice {
	 
	PhoneNum findALLWithoutUsedOne(Integer empno);//脚本tab_phone

	void updateImmediatelyUsed(Integer pid);//tab_phone
	
	PhoneNum findALLWithoutUsedOne_1(Integer empno);//脚本tab_phone1

	void updateImmediatelyUsed_1(Integer pid);//tab_phone1
	
	
	PhoneNum findALLWithoutUsedOne_2(Integer empno);//脚本tab_phone2

	void updateImmediatelyUsed_2(Integer pid);//tab_phone2

	
	PhoneNum findALLWithoutUsedOne_3(Integer empno);//脚本tab_phone3

	void updateImmediatelyUsed_3(Integer pid);//tab_phone3
		
	PhoneNum findALLWithoutUsedOne_4(Integer empno);//脚本tab_phone1

	void updateImmediatelyUsed_4(Integer pid);//tab_phone1
	
	
	PhoneNum findALLWithoutUsedOne_5(Integer empno);//脚本tab_phone2

	void updateImmediatelyUsed_5(Integer pid);//tab_phone2

	
	PhoneNum findALLWithoutUsedOne_6(Integer empno);//脚本tab_phone3

	void updateImmediatelyUsed_6(Integer pid);//tab_phone3
	
	
	PhoneNum findALLWithoutUsedOne_7(Integer empno);//脚本tab_phone3

	void updateImmediatelyUsed_7(Integer pid);//tab_phone3
		
	PhoneNum findALLWithoutUsedOne_8(Integer empno);//脚本tab_phone1

	void updateImmediatelyUsed_8(Integer pid);//tab_phone1
	
	
	PhoneNum findALLWithoutUsedOne_9(Integer empno);//脚本tab_phone2

	void updateImmediatelyUsed_9(Integer pid);//tab_phone2

	
	PhoneNum findALLWithoutUsedOne_10(Integer empno);//脚本tab_phone3

	void updateImmediatelyUsed_10(Integer pid);//tab_phone3

	PhoneNum findAllPhoneNumByIdTableNames(String tablename, Integer empno);

	void updateAllPhoneNumByIdTableNames(String tablename,Integer pid);
	
	
	
	
	
	
	
	
	
	
	
}
