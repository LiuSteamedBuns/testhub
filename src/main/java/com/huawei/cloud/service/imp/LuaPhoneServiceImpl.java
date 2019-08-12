package com.huawei.cloud.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.PhoneNum;
import com.huawei.cloud.dao.PhoneNumMapper;
import com.huawei.cloud.service.LuaPhoneSerice;

@Service
public class LuaPhoneServiceImpl implements LuaPhoneSerice {
	
	@Autowired
	PhoneNumMapper phoneNumMapper;

	/** 
	 * 数据一条一条查tab_phone
	 */
		@Override
		public PhoneNum findALLWithoutUsedOne(Integer empno){
			return	phoneNumMapper.findALLWithoutUsedOne(empno);
			
		}
		/*	tab_phone
		 * 查询之后立刻更新,与上面的方法共同执行
		 * @see 
		 */
	@Override
	public void updateImmediatelyUsed(Integer pid) {	
		phoneNumMapper.updateImmediatelyUsed(pid);
	}
		@Override
		public PhoneNum findALLWithoutUsedOne_1(Integer empno) {
			return	phoneNumMapper.findALL_1(empno);
		 
		}
		@Override
		public void updateImmediatelyUsed_1(Integer pid) {
			phoneNumMapper.update_1(pid);
			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_2(Integer empno) {
			return	phoneNumMapper.findALL_2(empno);			 
		}
		@Override
		public void updateImmediatelyUsed_2(Integer pid) {
			phoneNumMapper.update_2(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_3(Integer empno) {
			return	phoneNumMapper.findALL_3(empno);
			}		 
		@Override
		public void updateImmediatelyUsed_3(Integer pid) {
			phoneNumMapper.update_3(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_4(Integer empno) {
			return	phoneNumMapper.findALL_4(empno);			 
		}
		@Override
		public void updateImmediatelyUsed_4(Integer pid) {
			phoneNumMapper.update_4(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_5(Integer empno) {
			return	phoneNumMapper.findALL_5(empno);		 
		}
		@Override
		public void updateImmediatelyUsed_5(Integer pid) {
			phoneNumMapper.update_5(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_6(Integer empno) {
			return	phoneNumMapper.findALL_6(empno);			 
		}
		@Override
		public void updateImmediatelyUsed_6(Integer pid) {
			phoneNumMapper.update_6(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_7(Integer empno) {
			return	phoneNumMapper.findALL_7(empno);	 
		}
		@Override
		public void updateImmediatelyUsed_7(Integer pid) {
			phoneNumMapper.update_7(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_8(Integer empno) {
			return	phoneNumMapper.findALL_8(empno);		 
		}
		@Override
		public void updateImmediatelyUsed_8(Integer pid) {
			phoneNumMapper.update_8(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_9(Integer empno) {
			return	phoneNumMapper.findALL_9(empno);
			}
		
		@Override
		public void updateImmediatelyUsed_9(Integer pid) {
			phoneNumMapper.update_9(pid);			
		}
		@Override
		public PhoneNum findALLWithoutUsedOne_10(Integer empno) {
			return	phoneNumMapper.findALL_10(empno);
		}
		@Override
		public void updateImmediatelyUsed_10(Integer pid) {
			phoneNumMapper.update_10(pid);			
		}
		
		
		@Override
		public PhoneNum findAllPhoneNumByIdTableNames(String tablename, Integer empno) {

			return  phoneNumMapper.getPhone(tablename,empno);
		 
		}
		@Override
		public void updateAllPhoneNumByIdTableNames(String tablename,Integer pid) {
			phoneNumMapper.updatePhone(tablename,pid);
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
