package com.huawei.cloud.service;

import java.util.Date;
import java.util.List;

import com.huawei.cloud.bean.Txtupload;
 
public interface TxtUpService {
	
	void saveTxtUpload(Integer empno,Date date ,String latefilename,String  tarUrl);

	 List<Txtupload> listTxtAll(Integer empno);

	Integer deleteTxt(String txtname);
	
}
