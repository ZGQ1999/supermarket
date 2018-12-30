package com.soft1841.service;

import com.soft1841.entity.VIP;

import java.util.List;

/**
 * 会员服务接口
 * 2018.12.26
 */

public interface VIPService {

    /**
     * 添加会员
     * @param vip
     */
    Long insertVIP(VIP vip);

    /**
     * 删除会员
     * @param id
     */
    void deleteVIPById(long id);

    /**
     * 查询所有会员
     * @return
     */
    List<VIP> selectAllVIP();

    /**
     * 根据id查询会员
     * @param id
     * @return
     */
    VIP getVIPById(long id);

    /**
     * 根据账号查会员
     * @param number
     * @return
     */
    VIP getVIPByNumber(long number);

    /**
     * 根据用户名关键词模糊查询
     * @param keywords
     * @return List<VIP>
     */
    List<VIP> getVIPLike(String keywords);

}

