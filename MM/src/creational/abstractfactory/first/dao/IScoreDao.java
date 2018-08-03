package creational.abstractfactory.first.dao;

import creational.abstractfactory.first.domain.Score;

public interface IScoreDao {
    public void insert(Score score);
    public Score get(int id);
}
