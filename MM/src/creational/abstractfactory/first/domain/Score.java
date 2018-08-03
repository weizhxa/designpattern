package creational.abstractfactory.first.domain;

public class Score {
    public Score() {
    }

    public Score(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int id;
    public int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
