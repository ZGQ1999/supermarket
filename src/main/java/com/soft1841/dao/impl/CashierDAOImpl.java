package com.soft1841.dao.impl;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.CashierDAO;
import com.soft1841.entity.Cashier;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @tianzhen
 * 2018.12.24
 */
public class CashierDAOImpl implements CashierDAO {
    @Override
    public Cashier getCashierByNumber(String number) throws SQLException {
        Entity entity =  Db.use().queryOne("SELECT * FROM t_cashier WHERE number = ? ",number );
        return convertCashier(entity);
    }

    private Cashier convertCashier (Entity entity) {
        Cashier Cashier = new Cashier();
        Cashier.setName(entity.getStr("name"));
        Cashier.setNumber(entity.getStr("number"));
        Cashier.setPassword(entity.getStr("password"));
        Cashier.setPicture(entity.getStr("picture"));
        return  Cashier;
    }

    @Override
    public long insertCashier (Cashier cashier) throws SQLException {
        return  Db.use().insertForGeneratedKey( Entity.create("t_cashier")
                .set("name",cashier.getName())
                .set("number",cashier.getNumber())
                .set("password",cashier.getPassword())
                .set("picture",cashier.getPicture()));
    }

    @Override
    public List<Cashier> selectCashiers () throws SQLException {
        List<Entity> entityList = Db.use().query("SELECT * FROM t_cashier ");
        List<Cashier> cashierList = new ArrayList<>();
        for (Entity entity : entityList) {
            cashierList.add(convertCashier(entity));
        }
        return cashierList;
    }

    @Override
    public int deleteById (Long id) throws SQLException {
        return Db.use().del(Entity.create("t_cashier").set("id",id));
    }

}
