package com.huawei.cloud.dao;

import com.huawei.cloud.bean.SuccessGet_2;
import com.huawei.cloud.bean.SuccessGet_2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccessGet_2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    long countByExample(SuccessGet_2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByExample(SuccessGet_2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int deleteByPrimaryKey(Integer sgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insert(SuccessGet_2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int insertSelective(SuccessGet_2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    List<SuccessGet_2> selectByExample(SuccessGet_2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    SuccessGet_2 selectByPrimaryKey(Integer sgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") SuccessGet_2 record, @Param("example") SuccessGet_2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByExample(@Param("record") SuccessGet_2 record, @Param("example") SuccessGet_2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKeySelective(SuccessGet_2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_succgetphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    int updateByPrimaryKey(SuccessGet_2 record);
}