package Behavioral.Observer;

public class Teacher extends Observable{
    String lesson = "";

    public void setLesson(String lesson) {
        this.lesson = lesson;
        System.out.println("老师的课堂内容发生了变化：" + lesson);
        this.setChanged();
        this.notifyAll(lesson);
    }
}
