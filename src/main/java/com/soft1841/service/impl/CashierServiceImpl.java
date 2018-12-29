package com.soft1841.service.impl;

import com.soft1841.dao.CashierDAO;
import com.soft1841.entity.Cashier;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @周国庆
 * 2018.12.24
 */
public class CashierServiceImpl  implements CashierService {
    private CashierDAO CashierDAO = DAOFactory.getCashierDAOInstance();


    public boolean login(String number, String password) {
        Cashier Cashier = null;
        try {
            Cashier = CashierDAO.getCashierByNumber(number);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据工号查找成功
        if (Cashier != null) {
            //比较密码
            if (password.equals(Cashier.getPassword())) {
                return true;
            }
        }
        return false;
    }


    public List<Cashier> getAllCashiers () {
        List<Cashier> cashierList = new ArrayList<>();
        try {
            cashierList =CashierDAO.selectCashiers();
        } catch (SQLException e) {
            //友好处理
            System.err.println("查询所有收银员信息出现异常");
        }
        return cashierList;
    }


    public void deleteCashier (Long id) {
        try {
            CashierDAO.deleteById(id);
        } catch (SQLException e) {
            System.err.println("删除收银员信息出现异常");
        }
    }

    public Long insertCashier (Cashier cashier) {
        long result = 0;
        try {
            result=CashierDAO.insertCashier(cashier);
        result = CashierDAO.insertCashier(cashier);
        } catch (SQLException e) {
            System.err.println("新增收银员信息出现异常");
        }
        return result;
    }
}
