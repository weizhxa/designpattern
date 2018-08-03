package creational.abstractfactory.first.view;

import creational.abstractfactory.first.dao.IDaoFactory;
import creational.abstractfactory.first.dao.IScoreDao;
import creational.abstractfactory.first.dao.IUserDao;
import creational.abstractfactory.first.dao.impl.MySqlDaoFactoryImpl;
import creational.abstractfactory.first.dao.impl.OracleDaoFactoryImpl;
import creational.abstractfactory.first.domain.Score;
import creational.abstractfactory.first.domain.User;

public class Main {
    public static void main(String[] args) {
//        IDaoFactory daoFactory = new MySqlDaoFactoryImpl();
        IDaoFactory daoFactory = new OracleDaoFactoryImpl();
        IScoreDao scoreDao = daoFactory.getScoreDao();
        scoreDao.get(1);
        scoreDao.insert(new Score(1, 1));

        IUserDao userDao = daoFactory.getUserDao();
        userDao.get(2);
        userDao.insert(new User("2", 2));
    }
}
