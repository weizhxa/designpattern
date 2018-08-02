package Behavioral.Responsibility;

public class Main {
    public static void main(String[] args) {

        Handle small = new Small();
        Handle middle = new Middle();
        Handle big = new Big();

//        small.setNextHandle(middle);
//        middle.setNextHandle(big);
//
//        Random random1 = new Random();
//        for(int i=0; i<10; i++) {
//            small.check(random1.nextInt(100) + 1);
//        }

        System.out.println("----------");

//        small.setNextHandle2(big).setNextHandle2(middle);
//
//        small.check(44);
//        small.check(1);
//        small.check(88);

        System.out.println("----------");

        HandleRequest handleRequest = new HandleRequest(small, middle, big);
        Handle handle = handleRequest.getRequestHandle();
        handle.check(15);

    }
}