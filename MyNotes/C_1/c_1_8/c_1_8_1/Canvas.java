package C_1.c_1_8.c_1_8_1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 20:07
 * \* Description:
 * \
 */
public class Canvas {

    // 同时在画布上绘制多个形状
	public void drawAll_error(List<Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}

    // 同时在画布上绘制多个形状，使用被限制的泛型通配符
    public void drawAll(List<? extends Shape> shapes)
    {
        for (Shape s : shapes)
        {
            s.draw(this);
        }
    }

    public static void main(String[] args)
    {
        List<Circle> circleList = new ArrayList<Circle>();
        Canvas c = new Canvas();
        // 由于List<Circle>并不是List<Shape>的子类型,
        // 所以下面代码引发编译错误
//        c.drawAll_error(circleList);

        c.drawAll(circleList);
    }
}
