package chapter_14.c_14_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:08 2020/1/5
 */
public class Person {

    public final String first;
    public final String last;
    public final String address;
    // etc.
    public Person(String first, String last, String address){
        this.first = first;
        this.last = last;
        this.address = address;
    }
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }
    public static class NullPerson
            extends Person implements Null {
        private NullPerson() { super("None", "None", "None"); }
        public String toString() { return "NullPerson"; }
    }

//    通常，空对象都是单例，因此这里将其作为静态final实例创建。这可以正常工作的，因为
//    Person是不可变的一你只能在构造器中设置它的值， 然后读取这些值，
//    但是你不能修改它们（因为String自身具备内在的不可变性）。 如果你想要修改一个NullPerson,
//    那只能用一个新的 Person对象来替换它。
//    注意，你可以选择使用instanceof来探测泛化的Null还是更具体的NullPerson,
//    但是由千使用了单例方式，所以你还可以只使用eq皿屈湛；至＝今长与Person.Null比较。
    public static final Person NULL = new NullPerson();



}
