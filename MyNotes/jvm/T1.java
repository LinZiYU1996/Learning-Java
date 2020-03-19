package jvm;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/18
 * \* Time: 16:01
 * \* Description:
 * \
 */
public class T1 {

    public int m() {

        return 1+3;
    }


    public static void main(String[] args) {

        System.out.println("hello world");

    }
}
//-XX:+UnlockDiagnosticVMOptions -XX:CompileCommand=print,*T1.main



//-XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly
//-XX:+UnlockDiagnosticVMOptions -XX:CompileCommand=print,T1.main T1


//    $ java -XX:CompileThreshold=1 -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand="compileonly jvm/T1 m" T1
