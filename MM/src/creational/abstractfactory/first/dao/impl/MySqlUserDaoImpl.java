package creational.abstractfactory.first.dao.impl;

import creational.abstractfactory.first.dao.IUserDao;
import creational.abstractfactory.first.domain.User;

public class MySqlUserDaoImpl implements IUserDao {
    @Override
    public void insert(User user) {
        System.out.println("使用 Mysql insert user： " + user.getName() + " " + user.getAge());
    }

    @Override
    public User get(int id) {
        System.out.println("使用 Mysql get user, id:  " + id);
        return null;
    }
}
