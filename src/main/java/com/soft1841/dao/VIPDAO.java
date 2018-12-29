package com.soft1841.dao;

import com.soft1841.entity.VIP;

import java.sql.SQLException;
import java.util.List;

/**
 * 会员接口
 * @author 岳凡
 * 2018.12.26
 */

public interface VIPDAO {
    /**
     * 增加VIP
     * @param vip
     * @return
     */
    Long insertVIP(VIP vip) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteVIPById(long id) throws SQLException;

    /**
     * 查询所有VIP
     * @return
     */
    List<VIP> selectAllVIP() throws SQLException;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    VIP getVIPById(int id) throws SQLException;

    /**
     * 根据number查会员
     * @param number
     * @return
     * @throws SQLException
     */

    VIP getVIPByNumber(int number) throws SQLException;

    /**
     * 根据name关键词模糊查询
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<VIP> selectVIPLike(String keywords) throws SQLException;
}