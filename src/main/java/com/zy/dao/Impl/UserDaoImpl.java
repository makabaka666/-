package com.zy.dao.Impl;

import com.zy.dao.UserDao;
import com.zy.pojo.User;
import com.zy.utils.DBTools;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    QueryRunner qr = new QueryRunner(DBTools.getDataSource());
    @Override
    public List<User> selectAll() {
        String sql = "select * from user";
        try {
            return qr.query(sql,new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User selectOne(int u_id) {
        String sql = "select * from user where u_id = ?";
        try {
            return qr.query(sql,new BeanHandler<>(User.class),u_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int update(User user) {
        String sql = "update user set u_name=?,u_sex=?,u_email=? where u_id=?";
        try {
            return qr.update(sql,user.getU_name(),user.getU_sex(),user.getU_email(),user.getU_id());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(int u_id) {
        String sql = "delete from user where u_id =?";
        try {
            return qr.update(sql,u_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public User insert(User user) {
        String sql = "insert  into  user values (?,?,?,'',?)";
        try {
            return qr.insert(sql,new BeanHandler<>(User.class),user.getU_id(),user.getU_name(),user.getU_sex(),user.getU_email());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
