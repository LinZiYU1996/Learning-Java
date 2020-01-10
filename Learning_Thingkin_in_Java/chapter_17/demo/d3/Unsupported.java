package chapter_17.demo.d3;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 11:47
 * \* Description:
 * \
 */
public class Unsupported {

    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        System.out.println("___________________________________");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
// Copy of the sublist:
        Collection<String> c2 = new ArrayList<String>(subList);
        try { c.retainAll(c2); } catch(Exception e) {
            System.out.println("retainAll(): " + e);
            System.out.println("___________________________________");
        }
        try { c.removeAll(c2); } catch(Exception e) {
            System.out.println("removeAll(): " + e);
            System.out.println("___________________________________");
        }
        try { c.clear(); } catch(Exception e) {
            System.out.println("clear(): " + e);
            System.out.println("___________________________________");
        }
        try { c.add("X"); } catch(Exception e) {
            System.out.println("add(): " + e);
            System.out.println("___________________________________");
        }
        try { c.addAll(c2); } catch(Exception e) {
            System.out.println("addAll(): " + e);
            System.out.println("___________________________________");
        }
        try { c.remove("C"); } catch(Exception e) {
            System.out.println("remove(): " + e);
            System.out.println("___________________________________");
        }
// The List.set() method modifies the value but
// doesn’t change the size of the data structure:
        try {
            list.set(0, "X");
        } catch(Exception e) {
            System.out.println("List.set(): " + e);
        }
    }
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()",
                Collections.unmodifiableList(
                        new ArrayList<String>(list)));
    }


}
