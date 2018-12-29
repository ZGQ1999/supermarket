package com.soft1841.utils;

import com.soft1841.dao.*;
import com.soft1841.dao.impl.*;

public class DAOFactory {
    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }
    public static GoodsDAO getGoodsDAOInstance () {
        return new GoodsDAOImpl();
    }
    public static DetailDAO getDetailDAOInstance () {
        return new DetailDAOImpl();
    }
    public static VIPDAO getVIPDAOInstance () {
        return new VIPDAOImpl();
    }
}



