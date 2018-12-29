package com.soft1841.service.impl;

import com.soft1841.dao.CashierDAO;
import com.soft1841.entity.Cashier;
import com.soft1841.service.CashierService;
import com.soft1841.utils.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 国庆
 * 2018.12.24
 */
public class CashierServiceImpl  implements CashierService {
    private CashierDAO sellerDAO = DAOFactory.getCashierDAOInstance();

    @Override
    public boolean login(String number, String password) {
        Cashier seller = null;
        try {
            seller = sellerDAO.getCashierByNumber(number);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据工号查找成功
        if (seller != null) {
            //比较密码
            if (password.equals(seller.getPassword())) {
                return true;
            }
        }
        return false;

    }

    @Override
    public List<Cashier> getAllCashiers () {
        List<Cashier> cashierList = new ArrayList<>();
        try {
            cashierList =sellerDAO.selectCashiers();
        } catch (SQLException e) {
            //友好处理
            System.err.println("查询所有收银员信息出现异常");
        }
        return cashierList;
    }

    @Override
    public void deleteCashier (long id) {
        try {
            sellerDAO.deleteById(id);
        } catch (SQLException e) {
            System.err.println("删除收银员信息出现异常");
        }
    }

    @Override
    public Long insertCashier (Cashier cashier) {
        long result = 0;
        try {
            result=sellerDAO.insertCashier(cashier);
//            result = CashierDAO.insertCashier(cashier);
        } catch (SQLException e) {
            System.err.println("新增收银员信息出现异常");
        }
        return result;
    }

    @Override
    public int countByRole (String role) {
        int result = 0;
        try {
            result = sellerDAO.countByRole(role);
        } catch (SQLException e) {
            System.err.println("根据角色统计收银员信息出现异常");
        }
        return result;
    }

    @Override
    public int countByDepartment (String department) {
        int result = 0;
        try {
            result = sellerDAO.countByDepartment(department);
        } catch (SQLException e) {
            System.err.println("根据部门统计收银员信息出现异常");
        }
        return result;
    }
}
