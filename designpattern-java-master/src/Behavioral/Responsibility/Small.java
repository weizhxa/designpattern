package Behavioral.Responsibility;

public class Small extends Handle {
    @Override
    public void check(int number) {
        if (number < 30){
            System.out.println(number + ": 小奖");
        }

        if (nextHandle != null){
            nextHandle.check(number);
        }
    }
}
