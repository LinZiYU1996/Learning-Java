//package book_jvm.P13;
//
//import java.util.Vector;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* User: LinZiYu
// * \* Date: 2020/3/17
// * \* Time: 19:57
// * \* Description:
// * \
// */
//public class Test {
//
//    private static Vector<Integer> vector = new Vector<>();
//
//    public static void main(String[] args) {
//
//
//        while (true) {
//
//            for (int i = 0; i < 10; i++) {
//                vector.add(i);
//            }
//
//        }
//
//        Thread remove = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i = 0; i < vector.size(); i++) {
//                    vector.remove(i);
//                }
//            }
//        });
//
//
//        Thread print = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < vector.size(); i++) {
//                    System.out.println(vector.get(i));
//                }
//            }
//        });
//
//        remove.start();
//
//        print.start();
//
//    }
//}
