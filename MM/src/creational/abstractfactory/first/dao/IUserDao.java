package creational.abstractfactory.first.dao;

import creational.abstractfactory.first.domain.User;

public interface IUserDao {
    public void insert(User user);
    public User get(int id);
}
