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
        return convertSeller(entity);
    }

    private Cashier convertSeller (Entity entity) {
        Cashier cashier = new Cashier(
        );
        return cashier;
    }

    @Override
    public long insertCashier (Cashier cashier) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_cashier")
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
            cashierList.add(converCashier(entity));
        }
        return cashierList;
    }

    private Cashier converCashier (Entity entity) {
        Cashier cashier = new Cashier(
        );
        return cashier;
    }

    @Override
    public int deleteById (long id) throws SQLException {
        return Db.use().del(Entity.create("t_cashier").set("id",id));
    }


    @Override
    public int countByRole (String role) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_cashier WHERE role = ? ",role).intValue();
    }

    @Override
    public int countByDepartment (String department) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_cashier WHERE department = ?", department).intValue();

    }
}
