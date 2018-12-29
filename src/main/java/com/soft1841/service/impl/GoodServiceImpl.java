package com.soft1841.service.impl;

import com.soft1841.entity.Goods;
import com.soft1841.service.GoodsService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author  田震
 * 2018/12/26
 * 00：01
 */
public class GoodServiceImpl implements GoodsService {
    private com.soft1841.dao.GoodsDAO GoodsDAO = DAOFactory.getGoodsDAOInstance();

    @Override
    public Long addGoods (Goods goods) {
        long result = 0;
        try {
            result = GoodsDAO.insertGoods(goods);
        } catch (SQLException e) {
            System.err.println("新增商品出现异常");
        }
        return result;
    }

    @Override
    public void deleteGoods (long id) {
        try {
            GoodsDAO.deleteGoodsById(id);
        } catch (SQLException e) {
            System.err.println("删除商品出现异常");
        }
    }

    @Override
    public void updateGoods (Goods goods) {
        try {
            GoodsDAO.updateGoods(goods);
        } catch (SQLException e) {
            System.err.println("修改商品信息出现异常");
        }
    }


    @Override
    public List <Goods> getAllGoods () {
        List<Goods> goodsList = new ArrayList<>();
        try {
            goodsList = GoodsDAO.selectAllGoods();
        } catch (SQLException e) {
            System.err.println("查询所有商品信息出现异常");
        }
        return goodsList;
    }

    @Override
    public Goods getGoods (long id) {
        Goods goods = new Goods (  );
        try {
            goods = GoodsDAO.getGoodsById ( id );
        } catch (SQLException e) {
            System.err.println("查询单个商品信息出现异常");
        }
        return goods;
    }

    @Override
    public List <Goods> getGoodsLike (String keywords) {
        List<Goods> goodsList = new ArrayList<>();
        try {
            goodsList = GoodsDAO.selectGoodsLike(keywords);
        } catch (SQLException e) {
            System.err.println("根据关键字查询商品信息出现异常");
        }
        return goodsList;
    }

    @Override
    public List <Goods> getGoodsByTypeId (long typeId) {
        List<Goods> goodsList = new ArrayList<>();
        try {
            goodsList = GoodsDAO.selectGoodsByTypeId(typeId);
        } catch (SQLException e) {
            System.err.println("根据类别查询商品信息出现异常");
        }
        return goodsList;
    }

    @Override
    public int countByType (long typeId) {
        return 0;
    }
}
