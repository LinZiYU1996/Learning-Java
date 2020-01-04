//package chapter_13.c_13_6.c_13_6_6;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import static chapter_6.c_6_1.c_6_1_3.Print.print;
//
///**
// * @Author: Mr.Lin
// * @Description:
// * @Date: Create in 13:29 2020/1/4
// */
//public class TheReplacements {
//
//    public static void main(String[] args) throws Exception {
//        String s = TextFile.read("TheReplacements.java");
//// Match the specially commented block of text above:
//        Matcher mInput =
//                Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
//                        .matcher(s);
//        if(mInput.find())
//            s = mInput.group(1); // Captured by parentheses
//// Replace two or more spaces with a single space:
//        s = s.replaceAll(" {2,}", " ");
//// Replace one or more spaces at the beginning of each
//// line with no spaces. Must enable MULTILINE mode:
//        s = s.replaceAll("(?m)^ +", "");
//        print(s);
//        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
//        StringBuffer sbuf = new StringBuffer();
//        Pattern p = Pattern.compile("[aeiou]");
//        Matcher m = p.matcher(s);
//// Process the find information as you
//        // perform the replacements:
//        while(m.find())
//            m.appendReplacement(sbuf, m.group().toUpperCase());
//// Put in the remainder of the text:
//        m.appendTail(sbuf);
//        print(sbuf);
//    }
//}
