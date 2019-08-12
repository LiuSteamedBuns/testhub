package com.huawei.cloud.dao;

import com.huawei.cloud.bean.Pending_1;
import com.huawei.cloud.bean.Pending_1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pending_1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    long countByExample(Pending_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByExample(Pending_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByPrimaryKey(Integer ppid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insert(Pending_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insertSelective(Pending_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    List<Pending_1> selectByExample(Pending_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    Pending_1 selectByPrimaryKey(Integer ppid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") Pending_1 record, @Param("example") Pending_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExample(@Param("record") Pending_1 record, @Param("example") Pending_1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKeySelective(Pending_1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKey(Pending_1 record);

	void addPending_1(@Param("ppending")String ppending,@Param("middlename") Integer middlename);

	Integer conutPending_1(Integer middlename);

	List<Pending_1> selectPending_1(Integer middlename);

	void deletePending_1(Integer middlename);



}