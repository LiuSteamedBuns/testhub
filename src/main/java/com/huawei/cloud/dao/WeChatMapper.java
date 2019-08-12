package com.huawei.cloud.dao;

import com.huawei.cloud.bean.WeChat;
import com.huawei.cloud.bean.WeChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeChatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    long countByExample(WeChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int deleteByExample(WeChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int deleteByPrimaryKey(Integer wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int insert(WeChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int insertSelective(WeChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    List<WeChat> selectByExample(WeChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    WeChat selectByPrimaryKey(Integer wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") WeChat record, @Param("example") WeChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int updateByExample(@Param("record") WeChat record, @Param("example") WeChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int updateByPrimaryKeySelective(WeChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_wechat
     *
     * @mbg.generated Tue Jun 04 17:25:33 CST 2019
     */
    int updateByPrimaryKey(WeChat record);
    
    
    
	List<WeChat> selectDownWechat(@Param("adwid")Integer adwid);

	void deleteWechat(@Param("adwid")Integer adwid);
    
    Integer countWechat(@Param("adwid")Integer adwid);
    
    
    
    
}