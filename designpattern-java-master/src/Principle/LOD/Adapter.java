package Principle.LOD;

public class Adapter {

    public void communicate(String msg, Object fromObject, Object toObject){//泛型
        if (fromObject instanceof Person){
            //强制类型转换
            Person person = (Person) fromObject;
            Dog dog = (Dog) toObject;

            person.talk(msg);
            dog.listen(msg);
        }else{
            Dog dog = (Dog) fromObject;
            Person person = (Person) toObject;

            dog.bark(msg);
            person.hear(msg);

        }
    }
}
