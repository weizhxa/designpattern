package Behavioral.Responsibility;

public class Middle extends Handle {
    @Override
    public void check(int number) {
        if (number >=30 && number <= 60){
            System.out.println(number + ":中奖");
        }

        if (nextHandle != null){
            nextHandle.check(number);
        }
    }
}
