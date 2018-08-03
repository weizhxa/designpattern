package creational.abstractfactory.first.dao;

public interface IDaoFactory {
    public IScoreDao getScoreDao();

    public IUserDao getUserDao();
}
