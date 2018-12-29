package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Detail;

import java.sql.SQLException;
import java.util.List;

public interface DetailDAO {
    /**
     * 增加明细
     * @param detail
     * @return
     * @throws SQLException
     */
    Long insertDetail(Detail detail) throws SQLException;

    /**
     * 查询所有明细
     * @return
     * @throws SQLException
     */
    List <Entity> selectAllDetail() throws SQLException;

    /**
     * 根据id查明细
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getDetailById(long id) throws SQLException;

    /**
     * 根据小票id查明细
     * @param
     * @return
     * @throws SQLException
     */
    List<Detail> getDetailByTicketId(long ticket_id) throws SQLException;


}
