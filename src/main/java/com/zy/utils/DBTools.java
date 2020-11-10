package com.zy.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.util.Properties;

public class DBTools {
    private   static DruidDataSource dataSource;
    static {
        Properties  ps = new Properties();
        try {
            ps.load(DBTools.class.getClassLoader().getResourceAsStream("db.properties"));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DruidDataSource getDataSource() {
        return dataSource;
    }
}
