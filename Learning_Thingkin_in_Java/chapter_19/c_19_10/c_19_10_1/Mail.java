package chapter_19.c_19_10.c_19_10_1;

import chapter_19.c_19_6.Enums;

import java.util.Iterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 15:47
 * \* Description:
 * \
 */
public class Mail {

//    责任链设计模式

//    程序员以不同的方式来解决一个问题  然后将它们链接到一起

//    以一个邮局的模型为例，邮局需要以尽可能通用的方式来处理每一封邮件，并且要不断尝试处理邮件 直到该邮件被认定为一封死信

//    邮件的每个关键特征都可以用enum来表示  程序将随机生成Mail对象

    // The NO’s lower the probability of random selection:
    enum GeneralDelivery {YES,NO1,NO2,NO3,NO4,NO5}

    enum Scannability {UNSCANNABLE,YES1,YES2,YES3,YES4}

    enum Readability {ILLEGIBLE,YES1,YES2,YES3,YES4}

    enum Address {INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}

    enum ReturnAddress {MISSING,OK1,OK2,OK3,OK4,OK5}

    GeneralDelivery generalDelivery;

    Scannability scannability;

    Readability readability;

    Address address;

    ReturnAddress returnAddress;

    static long counter = 0;

    long id = counter++;

    public String toString() { return "Mail " + id; }

    public String details() {
        return toString() +
                ", General Delivery: " + generalDelivery +
                ", Address Scanability: " + scannability +
                ", Address Readability: " + readability +
                ", Address Address: " + address +
                ", Return address: " + returnAddress;
    }


    // Generate test Mail:
//    负责随机的创建用于测试的邮件
    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery= Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }


    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    public boolean hasNext() { return n-- > 0; }
                    public Mail next() { return randomMail(); }
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }


}
