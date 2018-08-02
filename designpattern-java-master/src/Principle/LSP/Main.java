package Principle.LSP;

/**
 * 里氏代换原则
 * Liskov Substitution Principle
 */
public class Main {
    public static void main(String[] args) {

        /**
         * 父类对象指向子类引用
         */
        TakeCare takeCare = new TakeCare(new Cat());
        takeCare.care();

        TakeCare takeCare1 = new TakeCare(new Dog());
        takeCare1.care();


        System.out.println();


        //隐式类型转换
        /**
         * 8位
         * -128 ~ 127
         */
        byte a = -128;
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();


        /**
         * 16位
         * -32768 ~ 32767
         * 隐式类型转换 byte -> short
         */
        short b = a;
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();


        /**
         * 32位
         * -2,147,483,648（-2^31）
         * 2,147,483,647（2^31 - 1）
         * 隐式类型转换 short -> int
         */
        int c = b;
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();


        /**
         * 32位
         * -9,223,372,036,854,775,808（-2^63）
         *  9,223,372,036,854,775,807（2^63 -1）
         * 隐式类型转换 int -> long
         */
        long d = c;
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();


        /**
         *  单精度、32位浮点数

         *  隐式类型转换 long -> float
         */
        float e = d;
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        /**
         * 双精度、64位浮点数
         * 隐式类型转换float -> double
         */
        double f = e;
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        //显示类型转换(强制转换)
        /**
         * 从低级向高级转换时为自动隐式转换
         * 从高低向低级转换时，必须显示强制转换
         */
        float g = 3.1415926f;
        System.out.println(g);
        byte h = (byte) g;
        System.out.println(h);


        /**
         * 隐式类型转换
         */
        test(a);
        test(b);
        test(c);
        test(d);
        test(e);
        test(f);
    }

    public static void test(double a){
        System.out.println(a);
    }
}
