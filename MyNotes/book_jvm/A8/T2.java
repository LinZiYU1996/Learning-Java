package book_jvm.A8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/17
 * \* Time: 15:10
 * \* Description:
 * \
 */
public class T2 {


    public void m(int i) {
        System.out.println(i);
    }

    public int m(int i,int j) {
        System.out.println(i + "---" +j);
        return 0;
    }

    public void m(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        T2 t2 = new T2();

        t2.m(100);

        t2.m(100,200);

        t2.m("string");

    }
}


/*

        看main方法字节码:
          public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: new           #11                 // class book_jvm/A8/T2
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: bipush        100
        11: invokevirtual #13                 // Method m:(I)V
        14: aload_1
        15: bipush        100
        17: sipush        200
        20: invokevirtual #14                 // Method m:(II)I
        23: pop
        24: aload_1
        25: ldc           #15                 // String string
        27: invokevirtual #16                 // Method m:(Ljava/lang/String;)V
        30: return


与覆盖类似       重载 也是使用 invokevirtual指令实现方法的调用

然后 与覆盖时invokevirtual指令索引相同的运行时 常量池有所不同

重载使用了不同的索引以区别不同的方法

在下面常量池可以看到

13 14 16

不一样的索引


这样一来

三个重载方法

在编译时就已经被表示为不同的符号引用了

当虚拟机运行期对类解析时
会在常量池中获取相应的符号引用

并将符号引用翻译为运行时的内存地址

 */

/*

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A8>javap -v T2
警告: 二进制文件T2包含book_jvm.A8.T2
Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/A8/T2.class
  Last modified 2020-3-17; size 1140 bytes
  MD5 checksum 88b32865d23a522e98c02d5071d7595f
  Compiled from "T2.java"
public class book_jvm.A8.T2
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #17.#41        // java/lang/Object."<init>":()V
   #2 = Fieldref           #42.#43        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = Methodref          #44.#45        // java/io/PrintStream.println:(I)V
   #4 = Class              #46            // java/lang/StringBuilder
   #5 = Methodref          #4.#41         // java/lang/StringBuilder."<init>":()V
   #6 = Methodref          #4.#47         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
   #7 = String             #48            // ---
   #8 = Methodref          #4.#49         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #9 = Methodref          #4.#50         // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #10 = Methodref          #44.#51        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #11 = Class              #52            // book_jvm/A8/T2
  #12 = Methodref          #11.#41        // book_jvm/A8/T2."<init>":()V
  #13 = Methodref          #11.#53        // book_jvm/A8/T2.m:(I)V
  #14 = Methodref          #11.#54        // book_jvm/A8/T2.m:(II)I
  #15 = String             #55            // string
  #16 = Methodref          #11.#56        // book_jvm/A8/T2.m:(Ljava/lang/String;)V
  #17 = Class              #57            // java/lang/Object
  #18 = Utf8               <init>
  #19 = Utf8               ()V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lbook_jvm/A8/T2;
  #25 = Utf8               m
  #26 = Utf8               (I)V
  #27 = Utf8               i
  #28 = Utf8               I
  #29 = Utf8               (II)I
  #30 = Utf8               j
  #31 = Utf8               (Ljava/lang/String;)V
  #32 = Utf8               s
  #33 = Utf8               Ljava/lang/String;
  #34 = Utf8               main
  #35 = Utf8               ([Ljava/lang/String;)V
  #36 = Utf8               args
  #37 = Utf8               [Ljava/lang/String;
  #38 = Utf8               t2
  #39 = Utf8               SourceFile
  #40 = Utf8               T2.java
  #41 = NameAndType        #18:#19        // "<init>":()V
  #42 = Class              #58            // java/lang/System
  #43 = NameAndType        #59:#60        // out:Ljava/io/PrintStream;
  #44 = Class              #61            // java/io/PrintStream
  #45 = NameAndType        #62:#26        // println:(I)V
  #46 = Utf8               java/lang/StringBuilder
  #47 = NameAndType        #63:#64        // append:(I)Ljava/lang/StringBuilder;
  #48 = Utf8               ---
  #49 = NameAndType        #63:#65        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #50 = NameAndType        #66:#67        // toString:()Ljava/lang/String;
  #51 = NameAndType        #62:#31        // println:(Ljava/lang/String;)V
  #52 = Utf8               book_jvm/A8/T2
  #53 = NameAndType        #25:#26        // m:(I)V
  #54 = NameAndType        #25:#29        // m:(II)I
  #55 = Utf8               string
  #56 = NameAndType        #25:#31        // m:(Ljava/lang/String;)V
  #57 = Utf8               java/lang/Object
  #58 = Utf8               java/lang/System
  #59 = Utf8               out
  #60 = Utf8               Ljava/io/PrintStream;
  #61 = Utf8               java/io/PrintStream
  #62 = Utf8               println
  #63 = Utf8               append
  #64 = Utf8               (I)Ljava/lang/StringBuilder;
  #65 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #66 = Utf8               toString
  #67 = Utf8               ()Ljava/lang/String;
{
  public book_jvm.A8.T2();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lbook_jvm/A8/T2;

  public void m(int);
    descriptor: (I)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: iload_1
         4: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
         7: return
      LineNumberTable:
        line 15: 0
        line 16: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lbook_jvm/A8/T2;
            0       8     1     i   I

  public int m(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: new           #4                  // class java/lang/StringBuilder
         6: dup
         7: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
        10: iload_1
        11: invokevirtual #6                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        14: ldc           #7                  // String ---
        16: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        19: iload_2
        20: invokevirtual #6                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        23: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        26: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 19: 0
        line 20: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lbook_jvm/A8/T2;
            0      31     1     i   I
            0      31     2     j   I

  public void m(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_1
         4: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 24: 0
        line 25: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lbook_jvm/A8/T2;
            0       8     1     s   Ljava/lang/String;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: new           #11                 // class book_jvm/A8/T2
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: bipush        100
        11: invokevirtual #13                 // Method m:(I)V
        14: aload_1
        15: bipush        100
        17: sipush        200
        20: invokevirtual #14                 // Method m:(II)I
        23: pop
        24: aload_1
        25: ldc           #15                 // String string
        27: invokevirtual #16                 // Method m:(Ljava/lang/String;)V
        30: return
      LineNumberTable:
        line 29: 0
        line 31: 8
        line 33: 14
        line 35: 24
        line 37: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  args   [Ljava/lang/String;
            8      23     1    t2   Lbook_jvm/A8/T2;
}
SourceFile: "T2.java"

E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\A8>




 */