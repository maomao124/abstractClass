/**
 * Project name(项目名称)：抽象类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Triangle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Triangle extends Shape
{

    public Triangle(int width, int height)
    {
        super(width, height);
    }

    @Override
    public double area()
    {
        return 0.5 * width * height;
    }
}
