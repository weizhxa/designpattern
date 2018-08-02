package Structural.Decorator;

import Structural.Decorator.Person.*;
import Structural.Decorator.Phone.*;

public class Main {
    public static void main(String[] args) {
        Phone phoneBase = new PhoneBase();
        phoneBase.feature();

        System.out.println("=============");
        //使用装饰器，扩展游戏功能
        PhoneDecorator gamePhone = new PhoneGameDecorator(phoneBase);
        gamePhone.feature();

        //使用装饰器，扩展拍照功能
        System.out.println("=============");
        PhoneDecorator cameraPhone = new PhoneCameraDecorator(gamePhone);
        cameraPhone.feature();

        //使用装饰器，扩展短信功能
        System.out.println("=============");
        PhoneDecorator messagePhone = new PhoneMessageDecorator(cameraPhone);
        messagePhone.feature();




        //基础类
        System.out.println("=============");
        Person personSimple = new PersonSimple();
        personSimple.ability();

        //扩展跳舞
        System.out.println("=============");
        PersonDecorator personDance = new PersonDance(personSimple);
        personDance.ability();

        //扩展唱歌
        System.out.println("=============");
        PersonDecorator personSing = new PersonSing(personDance);
        personSing.ability();
    }
}
