package better_write.ma_chu_gao_xiao.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 15:45
 * \* Description:
 * \
 */
public class DoNotUserObjectVariargs {

// 不要使用 Object 作为可变参数
    public static void main(String[] args) {

        list(1,2,3);

        System.out.println("");

        list(new int[]{1,2,3});

        System.out.println("");

        list(3,new String[]{"1","2"});

        System.out.println("");

        list(new Integer[]{1,2,3});

        System.out.println("");

        list(3,new Integer[]{1,2,3});


        // Integer[] 可以转型为  Object[]  也可以作为 一个  Object对象

        // int[] 只能当做一个单纯的Object对象
    }

    public static void list(Object...args){

        System.out.println(args.length);

    }

}
