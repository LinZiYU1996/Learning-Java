package CsApp.B;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/9
 * \* Time: 17:50
 * \* Description:
 * \
 */
public class Test {


    public int call(int x, int y) {
        int a = 100;

        x = x + a;

        return x+y;
    }


    public static void main(String[] args) {

        Test t = new Test();

        t.call(100,100);

//        System.out.println("hello");

    }


//    java -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*Test.call

//    -server -Xcomp -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand=compileonly,*ClassName.method

//    -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand=compileonly,*Test.call

//     -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly。

//    java -XX:+PrintCompilation Test

//     -XX:+UnlockDiagnosticVMOptions -XX:CompileCommand=print,*Test.call -Xcomp Test

//    $ java -XX:CompileThreshold=1 -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand="compileonly pCsApp/B/Test call" Test

    //-XX: UnlockDiagnosticVMOptions \ -XX:-UseCompressedOops \ -XX:PrintAssemblyO

//    java a-XX:+UnlockDiagnosticVMOptions -XX:CompileCommnd=print,*Test.call -Xcomp call


}
