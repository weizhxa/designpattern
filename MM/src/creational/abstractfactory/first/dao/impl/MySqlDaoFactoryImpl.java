package creational.abstractfactory.first.dao.impl;

import creational.abstractfactory.first.dao.IDaoFactory;
import creational.abstractfactory.first.dao.IScoreDao;
import creational.abstractfactory.first.dao.IUserDao;

public class MySqlDaoFactoryImpl implements IDaoFactory {

    @Override
    public IScoreDao getScoreDao() {
        return new MySqlScoreDaoImpl();
    }

    @Override
    public IUserDao getUserDao() {
        return new MySqlUserDaoImpl();
    }
}
