package better_write.Netty_Book.serializ.package3;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/20
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -6869602940598284059L;

    private String name;

    private String pwd;

    private Character sex;

    private Integer year;

    private void writeobject(ObjectOutputStream out) throws IOException {

        System.out.println("pwd : " + pwd);

        byte[] nameByte = pwd.getBytes("utf-8");

        if (nameByte != null) {
            pwd = new BASE64Encoder().encode(nameByte);
        }
        System.out.println("encodedPassword: " + pwd);
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        //反序列化时对password进行解密
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] b = null;
        if (pwd != null) {
            b = decoder.decodeBuffer(pwd);
            pwd = new String(b, "utf-8");
            System.out.println("decodedPassword: " + pwd);

        }
    }

    public Student(String name, String pwd, Character sex, Integer year) {
        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                ", year=" + year +
                '}';
    }
}
