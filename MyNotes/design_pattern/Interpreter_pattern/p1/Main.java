package design_pattern.Interpreter_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/26
 * \* Time: 20:48
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        Variable xVariable = new Variable("X");
        Variable yVariable = new Variable("Y");
        Constant constant = new Constant(true);
        context.assign(xVariable, false);
        context.assign(yVariable, true);

        Expression expression = new Or(new And(constant, xVariable), new And(yVariable, new Not(xVariable)));
        System.out.println("X = " + xVariable.interpret(context));
        System.out.println("Y = " + yVariable.interpret(context));
        System.out.println(expression.toString() + " = " + expression.interpret(context));

    }
}
