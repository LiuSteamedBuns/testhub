package com.huawei.cloud.dao;

import com.huawei.cloud.bean.User;
import com.huawei.cloud.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int deleteByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    User selectByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_emp
     *
     * @mbg.generated Fri Apr 26 13:25:41 CST 2019
     */
    int updateByPrimaryKey(User record);

    
    //ͨ
	User findByUsername(String username);

	//
	
	
	
	
	
	
	
	
	
}