package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Component t1 = new TestCase("testcase-1");

        Component t2 = new TestCase("testcase-2");


        Component root = new Collection("root");
        Component collection1 = new Collection("collection-1");

        root.add(t1);
        root.add(collection1);
        collection1.add(t2);

        root.runTestcase();


        System.out.println("------------");


        collection1.runTestcase();
    }
}
