package design_pattern.Facade_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/18
 * \* Time: 20:57
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("E:\\learn-java\\Learning-Java\\MyNotes\\design_pattern\\Facade_pattern\\p1\\src.txt","des.txt");

    }
}
