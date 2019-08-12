package com.huawei.cloud.dao;

import com.huawei.cloud.bean.SuccessLogin_1;
import com.huawei.cloud.bean.SuccessLogin_1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccessLogin_1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    long countByExample(SuccessLogin_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int deleteByExample(SuccessLogin_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int deleteByPrimaryKey(Integer ssid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int insert(SuccessLogin_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int insertSelective(SuccessLogin_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    List<SuccessLogin_1> selectByExample(SuccessLogin_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    SuccessLogin_1 selectByPrimaryKey(Integer ssid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") SuccessLogin_1 record, @Param("example") SuccessLogin_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByExample(@Param("record") SuccessLogin_1 record, @Param("example") SuccessLogin_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByPrimaryKeySelective(SuccessLogin_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succloginphone_1
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByPrimaryKey(SuccessLogin_1 record);
    
   
   
    Integer countSuccessLogin_1(Integer middlename);

	List<SuccessLogin_1> selectSuccessLogin_1(Integer middlename);

	void addSuccessLogin_1(@Param("successphone") String successphone,@Param("middlename") Integer middlename);

	void deleteSuccLogin_1(Integer middlename);
    
    
    
    
    
    
    
    
    
}