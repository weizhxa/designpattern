package creational.abstractfactory.first.dao.impl;

import creational.abstractfactory.first.dao.IScoreDao;
import creational.abstractfactory.first.domain.Score;

public class OracleScoreDaoImpl implements IScoreDao {

    @Override
    public void insert(Score score) {
        System.out.println("使用 Oracle insert score： " + score.getId() + " " + score.getScore());
    }

    @Override
    public Score get(int id) {
        System.out.println("使用 Oracle get score, id:  " + id);
        return null;
    }
}
