package com.huawei.cloud.dao;

import com.huawei.cloud.bean.TxtFile;
import com.huawei.cloud.bean.TxtFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TxtFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    long countByExample(TxtFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int deleteByExample(TxtFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int insert(TxtFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int insertSelective(TxtFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    List<TxtFile> selectByExample(TxtFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    TxtFile selectByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") TxtFile record, @Param("example") TxtFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int updateByExample(@Param("record") TxtFile record, @Param("example") TxtFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int updateByPrimaryKeySelective(TxtFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_middname
     *
     * @mbg.generated Wed May 29 19:52:44 CST 2019
     */
    int updateByPrimaryKey(TxtFile record);
}