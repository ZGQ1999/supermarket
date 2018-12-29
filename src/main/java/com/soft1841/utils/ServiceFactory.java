package com.soft1841.utils;

import com.soft1841.service.CashierService;
import com.soft1841.service.GoodsService;
import com.soft1841.service.TypeService;
import com.soft1841.service.VIPService;
import com.soft1841.service.impl.CashierServiceImpl;
import com.soft1841.service.impl.GoodServiceImpl;
import com.soft1841.service.impl.TypeServiceImpl;
import com.soft1841.service.impl.VIPServiceImpl;

public class ServiceFactory {
    public static CashierService getCashierServiceInstance () {
        return new CashierServiceImpl();
    }
    public static TypeService getTypeServiceInstance () {
        return new TypeServiceImpl();
    }
    public static GoodsService getGoodsServiceInstance () {
        return new GoodServiceImpl();
    }
    public static VIPService getVIPServiceInstance () {
        return new VIPServiceImpl();
    }
}