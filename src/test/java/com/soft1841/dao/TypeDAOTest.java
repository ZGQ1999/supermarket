package com.soft1841.dao;

import com.soft1841.entity.Type;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class TypeDAOTest {
    TypeDAO typeDAO = DAOFactory.getTypeDAOInstance();

    @Test
    public void insertType() {
    }

    @Test
    public void deleteTypeById() {
    }

    @Test
    public void selectAllTypes() throws SQLException {
            List<Type> typeList= typeDAO.selectAllTypes();
        typeList.forEach(type -> System.out.println(type.getName()));
    }

    @Test
    public void getTypeById() {
    }
}