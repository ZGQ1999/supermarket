package com.soft1841.service.impl;

import com.soft1841.dao.VIPDAO;
import com.soft1841.entity.VIP;
import com.soft1841.service.VIPService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * VUPService的实现类
 * @author 岳凡
 * 2018.12.27
 */

public class VIPServiceImpl implements VIPService {
    private VIPDAO vipDAO = DAOFactory.getVIPDAOInstance();
    @Override
    public Long insertVIP(VIP vip) {
        long result = 0;
        try {
            result = vipDAO.insertVIP(vip);
        }catch (SQLException e){
            System.err.println("增加VIP异常");
        }
        return result;
    }

    @Override
    public void deleteVIPById(long id) {
        try {
            vipDAO.deleteVIPById(id);
        }catch (SQLException e){
            System.err.println("删除VIP异常");
        }
    }

    @Override
    public List<VIP> selectAllVIP() {
        List<VIP> vipList = new ArrayList<>();
        try {
            vipList = vipDAO.selectAllVIP();
        }catch (SQLException e){
            System.err.println("查询VIP异常");
        }
        return vipList;
    }

    @Override
    public VIP getVIPById(long id) {
        VIP vip = new VIP();
        try {
            vip = vipDAO.getVIPById((int) id);
        }catch (SQLException e){
            System.err.println("根据id查询单个会员异常");
        }
        return vip;
    }

    @Override
    public VIP getVIPByNumber(long number) {
        VIP vip = new VIP();
        try {
            vip = vipDAO.getVIPByNumber((int) number);
        }catch (SQLException e){
            System.err.println("根据账号查询单个会员异常");
        }
        return vip;
    }

    @Override
    public List<VIP> getVIPLike(String keywords) {
        List<VIP> vipList = new ArrayList<>();
        try {
            vipList = vipDAO.selectVIPLike(keywords);
        }catch (SQLException e){
            System.err.println("查询VIP异常");
        }
        return vipList;
    }

}
