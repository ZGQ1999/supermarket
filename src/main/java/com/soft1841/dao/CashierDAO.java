package com.soft1841.dao;

import com.soft1841.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * @田震
 * 2018.12.26
 * 收营员DAO接口
 */

public interface CashierDAO {

    /**
     * 根据工号查询收银员
     * @param number
     * @return
     * @throws SQLException
     */
   Cashier getCashierByNumber(String number)throws SQLException;

     long insertCashier(Cashier cashier) throws SQLException;

    /**
     * 查询所有收银员信息
     * @return List<Cashier>
     * @throws SQLException
     */
    List<Cashier> selectCashiers() throws SQLException;

    /**
     * 根据id删除实体
     * @param id
     * @return
     * @throws SQLException
     */
     int deleteById(long id) throws SQLException;


    /**
     * 根据身份角色统计收银员数量
     * @param role
     * @return
     * @throws SQLException
     */
     int countByRole(String role) throws SQLException;

    /**
     * 根据身份角色统计收银员数量
     * @param department
     * @return
     * @throws SQLException
     */
   int countByDepartment(String department) throws SQLException;
}
