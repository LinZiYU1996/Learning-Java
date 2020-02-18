package design_pattern.Facade_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/18
 * \* Time: 20:56
 * \* Description:
 * \
 */
public class CipherMachine {

    //数据加密类：子系统类

    public String encrypt(String plainText) {
        System.out.print("数据加密，将明文转换为密文：");
        String es = "";
        for(int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }


}
