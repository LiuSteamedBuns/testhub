package com.huawei.cloud.dao;

import com.huawei.cloud.bean.Repetition;
import com.huawei.cloud.bean.RepetitionExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepetitionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    long countByExample(RepetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int deleteByExample(RepetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int deleteByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int insert(Repetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int insertSelective(Repetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    List<Repetition> selectByExample(RepetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    Repetition selectByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") Repetition record, @Param("example") RepetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int updateByExample(@Param("record") Repetition record, @Param("example") RepetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int updateByPrimaryKeySelective(Repetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    int updateByPrimaryKey(Repetition record);
    

    void addRepetition(@Param("empno") Integer empno, @Param("adddate") Date adddate,@Param("repetition") String repetition,@Param("olddate") Date olddate,@Param("middletag") Integer middletag);
    
    Integer countRepetition(@Param("empno")Integer empno,@Param("middletag") Integer middletag);
    
    List<Repetition> downRepetition(@Param("empno")Integer empno,@Param("middletag") Integer middletag);
    
    void delRepetition(@Param("empno")Integer empno,@Param("middletag") Integer middletag);
    
    
    
    
    
    
    
    
}