package Principle.LOD;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * 说话
     * @param words
     */
    public void talk(String words){
        System.out.println("(人)" + name + "说：" + words);
    }

    /**
     * 听到
     * @param words
     */
    public void hear(String words){
        System.out.println("(人)" + name + "听到：" + words);
    }

    /**
     * 向狗说
     * @param words
     */
    public void talkToDog(String words, Dog dog){
        talk(words);
        dog.listen(words);
    }
}
