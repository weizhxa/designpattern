package Behavioral.Responsibility;

public class Big extends Handle {
    @Override
    public void check(int number) {
        if (number > 60){
            System.out.println(number + ": 大奖");
        }

        if (nextHandle != null){
            nextHandle.check(number);
        }
    }
}
