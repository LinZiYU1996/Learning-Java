package design_pattern.Interpreter_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/26
 * \* Time: 20:47
 * \* Description:
 * \
 */
public class Constant extends Expression{

    //一个Constant对象代表一个布尔常量


    private boolean value;
    public Constant(boolean value) {
        this.value = value;
    }
    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Constant) {
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}
