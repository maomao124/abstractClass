/**
 * Project name(项目名称)：抽象类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:55
 * Version(版本): 1.0
 * Description(描述)： 在 Java 中抽象类的语法格式如下：
 * <abstract>class<class_name>
 * {
 * <abstract><type><method_name>(parameter-iist);
 * }
 * 其中，abstract 表示该类或该方法是抽象的；class_name 表示抽象类的名称；method_name 表示抽象方法名称，parameter-list 表示方法参数列表。
 * 如果一个方法使用 abstract 来修饰，则说明该方法是抽象方法，抽象方法只有声明没有实现。
 * 需要注意的是 abstract 关键字只能用于普通方法，不能用于 static 方法或者构造方法中。
 * 抽象方法的 3 个特征如下：
 * 抽象方法没有方法体
 * 抽象方法必须存在于抽象类中
 * 子类重写父类时，必须重写父类所有的抽象方法
 * 注意：在使用 abstract 关键字修饰抽象方法时不能使用 private 修饰，因为抽象方法必须被子类重写，而如果使用了 private 声明，则子类是无法重写的。
 * 抽象类的定义和使用规则如下：
 * 抽象类和抽象方法都要使用 abstract 关键字声明。
 * 如果一个方法被声明为抽象的，那么这个类也必须声明为抽象的。而一个抽象类中，可以有 0~n 个抽象方法，以及 0~n 个具体方法。
 * 抽象类不能实例化，也就是不能使用 new 关键字创建对象。
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Square square = new Square(5, 9);
        System.out.println("正方形的面积：" + square.area());
        Triangle triangle = new Triangle(7, 3);
        System.out.println("三角形的面积：" + triangle.area());
        //Shape shape=new Shape(4,6);   无法使用
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
