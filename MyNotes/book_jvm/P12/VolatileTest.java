package book_jvm.P12;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/17
 * \* Time: 10:35
 * \* Description:
 * \
 */
public class VolatileTest {


    public static volatile int race = 0;

    public static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {

        Thread[] threads = new Thread[THREADS_COUNT];

        for (int i = 0; i < THREADS_COUNT; i++) {

            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 100; j++) {
                        increase();
                    }

                }
            });

            threads[i].start();
        }

        while (Thread.activeCount() > 1) {

            Thread.yield();

        }

        System.out.println(race);

    }
}


/**
 *
 *
 E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P12>javap -verbose VolatileTest
 警告: 二进制文件VolatileTest包含book_jvm.P12.VolatileTest
 Classfile /E:/learn-java/Learning-Java/output/production/Learning-Java/book_jvm/P12/VolatileTest.class
 Last modified 2020-3-17; size 1101 bytes
 MD5 checksum 77bab7465ed9994d446a8c8b37a70a12
 Compiled from "VolatileTest.java"
 public class book_jvm.P12.VolatileTest
 minor version: 0
 major version: 52
 flags: ACC_PUBLIC, ACC_SUPER
 Constant pool:
 #1 = Methodref          #13.#40        // java/lang/Object."<init>":()V
 #2 = Fieldref           #3.#41         // book_jvm/P12/VolatileTest.race:I
 #3 = Class              #42            // book_jvm/P12/VolatileTest
 #4 = Class              #43            // java/lang/Thread
 #5 = Class              #44            // book_jvm/P12/VolatileTest$1
 #6 = Methodref          #5.#40         // book_jvm/P12/VolatileTest$1."<init>":()V
 #7 = Methodref          #4.#45         // java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
 #8 = Methodref          #4.#46         // java/lang/Thread.start:()V
 #9 = Methodref          #4.#47         // java/lang/Thread.activeCount:()I
 #10 = Methodref          #4.#48         // java/lang/Thread.yield:()V
 #11 = Fieldref           #49.#50        // java/lang/System.out:Ljava/io/PrintStream;
 #12 = Methodref          #51.#52        // java/io/PrintStream.println:(I)V
 #13 = Class              #53            // java/lang/Object
 #14 = Utf8               InnerClasses
 #15 = Utf8               race
 #16 = Utf8               I
 #17 = Utf8               THREADS_COUNT
 #18 = Utf8               ConstantValue
 #19 = Integer            20
 #20 = Utf8               <init>
 #21 = Utf8               ()V
 #22 = Utf8               Code
 #23 = Utf8               LineNumberTable
 #24 = Utf8               LocalVariableTable
 #25 = Utf8               this
 #26 = Utf8               Lbook_jvm/P12/VolatileTest;
 #27 = Utf8               increase
 #28 = Utf8               main
 #29 = Utf8               ([Ljava/lang/String;)V
 #30 = Utf8               i
 #31 = Utf8               args
 #32 = Utf8               [Ljava/lang/String;
 #33 = Utf8               threads
 #34 = Utf8               [Ljava/lang/Thread;
 #35 = Utf8               StackMapTable
 #36 = Class              #34            // "[Ljava/lang/Thread;"
 #37 = Utf8               <clinit>
 #38 = Utf8               SourceFile
 #39 = Utf8               VolatileTest.java
 #40 = NameAndType        #20:#21        // "<init>":()V
 #41 = NameAndType        #15:#16        // race:I
 #42 = Utf8               book_jvm/P12/VolatileTest
 #43 = Utf8               java/lang/Thread
 #44 = Utf8               book_jvm/P12/VolatileTest$1
 #45 = NameAndType        #20:#54        // "<init>":(Ljava/lang/Runnable;)V
 #46 = NameAndType        #55:#21        // start:()V
 #47 = NameAndType        #56:#57        // activeCount:()I
 #48 = NameAndType        #58:#21        // yield:()V
 #49 = Class              #59            // java/lang/System
 #50 = NameAndType        #60:#61        // out:Ljava/io/PrintStream;
 #51 = Class              #62            // java/io/PrintStream
 #52 = NameAndType        #63:#64        // println:(I)V
 #53 = Utf8               java/lang/Object
 #54 = Utf8               (Ljava/lang/Runnable;)V
 #55 = Utf8               start
 #56 = Utf8               activeCount
 #57 = Utf8               ()I
 #58 = Utf8               yield
 #59 = Utf8               java/lang/System
 #60 = Utf8               out
 #61 = Utf8               Ljava/io/PrintStream;
 #62 = Utf8               java/io/PrintStream
 #63 = Utf8               println
 #64 = Utf8               (I)V
 {
 public static volatile int race;
 descriptor: I
 flags: ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

 public book_jvm.P12.VolatileTest();
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
 0       5     0  this   Lbook_jvm/P12/VolatileTest;

 public static void increase();
 descriptor: ()V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=2, locals=0, args_size=0
 0: getstatic     #2                  // Field race:I
 3: iconst_1
 4: iadd
 5: putstatic     #2                  // Field race:I
 8: return
 LineNumberTable:
 line 17: 0
 line 18: 8

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=6, locals=3, args_size=1
 0: bipush        20
 2: anewarray     #4                  // class java/lang/Thread
 5: astore_1
 6: iconst_0
 7: istore_2
 8: iload_2
 9: bipush        20
 11: if_icmpge     43
 14: aload_1
 15: iload_2
 16: new           #4                  // class java/lang/Thread
 19: dup
 20: new           #5                  // class book_jvm/P12/VolatileTest$1
 23: dup
 24: invokespecial #6                  // Method book_jvm/P12/VolatileTest$1."<init>":()V
 27: invokespecial #7                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
 30: aastore
 31: aload_1
 32: iload_2
 33: aaload
 34: invokevirtual #8                  // Method java/lang/Thread.start:()V
 37: iinc          2, 1
 40: goto          8
 43: invokestatic  #9                  // Method java/lang/Thread.activeCount:()I
 46: iconst_1
 47: if_icmple     56
 50: invokestatic  #10                 // Method java/lang/Thread.yield:()V
 53: goto          43
 56: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
 59: getstatic     #2                  // Field race:I
 62: invokevirtual #12                 // Method java/io/PrintStream.println:(I)V
 65: return
 LineNumberTable:
 line 24: 0
 line 26: 6
 line 28: 14
 line 39: 31
 line 26: 37
 line 42: 43
 line 44: 50
 line 48: 56
 line 50: 65
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 8      35     2     i   I
 0      66     0  args   [Ljava/lang/String;
 6      60     1 threads   [Ljava/lang/Thread;
 StackMapTable: number_of_entries = 3
 frame_type = 253
          offset_delta = 8
                  locals = [ class "[Ljava/lang/Thread;", int ]
        frame_type = 250
        offset_delta = 34
        frame_type = 12

static {};
        descriptor: ()V
        flags: ACC_STATIC
        Code:
        stack=1, locals=0, args_size=0
        0: iconst_0
        1: putstatic     #2                  // Field race:I
        4: return
        LineNumberTable:
        line 14: 0
        }
        SourceFile: "VolatileTest.java"
        InnerClasses:
static #5; //class book_jvm/P12/VolatileTest$1

        E:\learn-java\Learning-Java\output\production\Learning-Java\book_jvm\P12>

        *
 */
