package com.huawei.cloud.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.Txtupload;
import com.huawei.cloud.dao.TxtuploadMapper;
import com.huawei.cloud.service.TxtUpService;

@Service
public class TxtUpServiceImpl implements TxtUpService {

	@Autowired
	TxtuploadMapper txtuploadMapper;
 	
	@Override
	public void saveTxtUpload(Integer empno, Date date, String latefilename, String tarUrl) {
		
		txtuploadMapper.inserttxtupload(empno,date,latefilename,tarUrl);
	}

	@Override
	public List<Txtupload> listTxtAll(Integer empno) {
		
	return	txtuploadMapper.selectTxtByempno(empno);
	}

	@Override
	public Integer deleteTxt(String txtname) {
		txtuploadMapper.deleteByTxtname(txtname);
		return null;
	}

}
