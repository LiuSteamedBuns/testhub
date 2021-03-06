package com.huawei.cloud.dao;

import com.huawei.cloud.bean.Pending;
import com.huawei.cloud.bean.PendingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PendingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    long countByExample(PendingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByExample(PendingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByPrimaryKey(Integer ppid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insert(Pending record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insertSelective(Pending record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    List<Pending> selectByExample(PendingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    Pending selectByPrimaryKey(Integer ppid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") Pending record, @Param("example") PendingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExample(@Param("record") Pending record, @Param("example") PendingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKeySelective(Pending record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKey(Pending record);

	void addPending(@Param("ppending")String ppending,@Param("middlename") Integer middlename,@Param("empno")Integer empno);

	Integer conutPending(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	List<Pending> selectPending(@Param("middlename")Integer middlename,@Param("empno")Integer empno);

	void deletePending(@Param("middlename")Integer middlename,@Param("empno")Integer empno);
}