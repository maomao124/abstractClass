/**
 * Project name(项目名称)：抽象类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Shape
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/11
 * Time(创建时间)： 22:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public abstract class Shape
{
    public int width;
    public int height;

    public Shape(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public abstract double area();
}
