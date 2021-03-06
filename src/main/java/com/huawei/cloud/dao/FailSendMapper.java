package com.huawei.cloud.dao;

import com.huawei.cloud.bean.FailSend;
import com.huawei.cloud.bean.FailSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FailSendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    long countByExample(FailSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int deleteByExample(FailSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int deleteByPrimaryKey(Integer ffid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int insert(FailSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int insertSelective(FailSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    List<FailSend> selectByExample(FailSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    FailSend selectByPrimaryKey(Integer ffid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") FailSend record, @Param("example") FailSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByExample(@Param("record") FailSend record, @Param("example") FailSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByPrimaryKeySelective(FailSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_failsendphone
     *
     * @mbg.generated Thu May 30 11:35:03 CST 2019
     */
    int updateByPrimaryKey(FailSend record);

	Integer countFailSend(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	List<FailSend> selectFailSend(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	void addFailsend(@Param("sendfail")String sendfail,@Param("middlename") Integer middlename,@Param("empno")Integer empno);

	void deleteFaildSend(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

}