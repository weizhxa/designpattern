package creational.abstractfactory.first.dao.impl;

import creational.abstractfactory.first.dao.IScoreDao;
import creational.abstractfactory.first.dao.IUserDao;
import creational.abstractfactory.first.domain.Score;
import creational.abstractfactory.first.domain.User;

public class MySqlScoreDaoImpl implements IScoreDao {

    @Override
    public void insert(Score score) {
        System.out.println("使用 Mysql insert score： " + score.getId() + " " + score.getScore());
    }

    @Override
    public Score get(int id) {
        System.out.println("使用 Mysql get score, id:  " + id);
        return null;
    }
}
