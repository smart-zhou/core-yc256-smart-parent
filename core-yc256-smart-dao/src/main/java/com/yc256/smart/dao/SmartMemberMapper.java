package com.yc256.smart.dao;

import com.yc256.smart.model.SmartMember;

public interface SmartMemberMapper {


    /**
     * 根据主键删除
     * @param id 主键值
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * @param record 待新增的对象
     */
    int insert(SmartMember record);

    /**
     * 新增记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待新增的对象
     */
    int insertSelective(SmartMember record);

    /**
     * 根据主键查询
     * @param id 主键值
     */
    SmartMember selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 记录
     */
    int updateByPrimaryKeySelective(SmartMember record);

    /**
     * 根据主键更新记录
     * @param record 记录
     */
    int updateByPrimaryKey(SmartMember record);
}