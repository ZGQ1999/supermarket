package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.sql.Condition;
import com.soft1841.dao.VIPDAO;
import com.soft1841.entity.VIP;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class VIPDAOImpl implements VIPDAO {
    @Override
    public Long insertVIP(VIP vip) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_vip")
                        .set("name", vip.getName())
                        .set("number", vip.getNumber())
                        .set("place",vip.getPlace())
                        .set("phonenumber", vip.getPhonenumber())
                        .set("integral",vip.getIntegral())

        );
    }

    @Override
    public int deleteVIPById(long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_vip").set("id", id)
        );
    }

    @Override
    public List<VIP> selectAllVIP() throws SQLException {
        List<Entity> entityList = Db.use().query("SELECT * FROM t_vip");
        List<VIP> vipList = new ArrayList<>();
        for (Entity entity : entityList) {
            vipList.add(convertVIP(entity));
        }
        return vipList;
    }

    /**
     * 将Entity转换为vip
     * @param entity
     * @return vip
     */

    private VIP convertVIP(Entity entity) {
        VIP vip = new VIP();
        vip.setId(entity.getLong("id"));
        vip.setName(entity.getStr("name"));
        vip.setNumber(entity.getStr("number"));
        vip.setPhonenumber(entity.getStr("phonenumber"));
        vip.setPlace(entity.getStr("place"));
        vip.setIntegral(entity.getStr("integral"));
        return vip;
    }

    @Override
    public VIP getVIPById(int id) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_vip WHERE id = ? ", id);
        return convertVIP(entity);
    }

    @Override
    public VIP getVIPByNumber(int number) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_vip WHERE number = ? ", number);
        return convertVIP(entity);
    }

    @Override
    public List<VIP> selectVIPLike(String keywords) throws SQLException {
        List<Entity> entityList = Db.use().findLike("t_vip", "name", keywords, Condition.LikeType.Contains);
        List<VIP> vipList = new ArrayList<>();
        for (Entity entity : entityList) {
            vipList.add(convertVIP(entity));
        }
        return vipList;
    }


}
