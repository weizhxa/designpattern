package creational.abstractfactory.first.dao.impl;

import creational.abstractfactory.first.dao.IDaoFactory;
import creational.abstractfactory.first.dao.IScoreDao;
import creational.abstractfactory.first.dao.IUserDao;

public class OracleDaoFactoryImpl implements IDaoFactory {

    @Override
    public IScoreDao getScoreDao() {
        return new OracleScoreDaoImpl();
    }

    @Override
    public IUserDao getUserDao() {
        return new OracleUserDaoImpl();
    }
}
