package better_write.ma_chu_gao_xiao.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 15:35
 * \* Description:
 * \
 */
public class ParamPassing {

    private static int intStatic = 222;

    private static String stringStatic = "old string";

    private static StringBuilder stringBuilderStatic = new StringBuilder("old StringBuilder");

    public static void main(String[] args) {

        method(intStatic);

        method(stringStatic);

        meth(stringBuilderStatic,stringBuilderStatic);

        System.out.println(intStatic);

        method();

        System.out.println("------------------------------------");


        System.out.println(intStatic);

        System.out.println(stringStatic);

        System.out.println(stringBuilderStatic);

    }

    public static void method(int intStatic){
        intStatic = 777;
    }

    public static void method(){
        intStatic = 888;
    }

    public static void method(String stringStatic){

        stringStatic = " new string";

    }

    public static void meth(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
        stringBuilder1.append("  method first");

        stringBuilder2.append("method second");


        stringBuilder1 = new StringBuilder("new StringBuilder");
        stringBuilder1.append("new method append");

    }
}
