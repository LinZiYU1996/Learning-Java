//package chapter_13.c_13_6.c_13_6_8;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * @Author: Mr.Lin
// * @Description:
// * @Date: Create in 13:31 2020/1/4
// */
//public class JGrep {
//
//    public static void main(String[] args) throws Exception {
//        if(args.length < 2) {
//            System.out.println("Usage: java JGrep file regex");
//            System.exit(0);
//        }
//        Pattern p = Pattern.compile(args[1]);
//// Iterate through the lines of the input file:
//        int index = 0;
//        Matcher m = p.matcher("");
//        for(String line : new TextFile(args[0])) {
//            m.reset(line);
//            while(m.find())
//                System.out.println(index++ + ": " +
//                        m.group() + ": " + m.start());
//        }
//    }
//
//
//}
