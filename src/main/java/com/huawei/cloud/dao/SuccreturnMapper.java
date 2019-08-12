package com.huawei.cloud.dao;

import com.huawei.cloud.bean.Succreturn;
import com.huawei.cloud.bean.SuccreturnExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccreturnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    long countByExample(SuccreturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByExample(SuccreturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByPrimaryKey(Integer ssid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insert(Succreturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insertSelective(Succreturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    List<Succreturn> selectByExample(SuccreturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    Succreturn selectByPrimaryKey(Integer ssid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") Succreturn record, @Param("example") SuccreturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExample(@Param("record") Succreturn record, @Param("example") SuccreturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKeySelective(Succreturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succreturn
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKey(Succreturn record);

	void addSuccReturn(@Param("succreturn")String succreturn,@Param("middlename") Integer middlename,@Param("empno")Integer empno,@Param("date")Date date);

	Integer countSuccReturn(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	List<Succreturn> selectSuccreturn(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	void deleteSuccreturn(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	String selectByPhone(@Param("phonenum")String phonenum);
	
	
	 
	
	
	
	
	
	
	
	
	
	
}