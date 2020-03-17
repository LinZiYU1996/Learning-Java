package book_jvm.P10;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/16
 * \* Time: 17:56
 * \* Description:
 * \
 */
public class T3 {

    public static final int NUM=15000;


    public static int doubleValue(int i){
        //这个空循环用于后面演示JIT代码优化过程
        for(int j=0;j<100000;j++);
        return i*2;
    }


    public static long calcSum() {
        long sum = 0;
        for (int i = 1; i<=100; i++) {
            sum += doubleValue(i);
        }
        return sum;
    }


    public static void main(String[] args){
            for(int i=0;i<NUM;i++){
                calcSum();
            }
        }

}

/*

查看即时编译效果命令码

-XX:+PrintCompilation +PrintInlining -verbose:gc


查看方法内联

-XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining


 */

/*
"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" -XX:+PrintCompilation -verbose:gc
"-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=6590:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin"
-Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;
C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" book_jvm.P10.T3
    125    1       3       java.lang.Math::min (11 bytes)
    126    2       3       java.lang.String::indexOf (166 bytes)
    126    5     n 0       java.lang.System::arraycopy (native)   (static)
    126    6       3       java.lang.String::hashCode (55 bytes)
    126    7       3       sun.nio.cs.ext.DoubleByte$Encoder::encodeChar (21 bytes)
    126    8       3       java.lang.System::getSecurityManager (4 bytes)
    127    9       3       java.lang.String::equals (81 bytes)
    127   10       3       java.lang.String::getChars (62 bytes)
    128   11       3       java.lang.Object::<init> (1 bytes)
    128   12       3       java.lang.Character::toLowerCase (9 bytes)
    128   13       3       java.lang.CharacterDataLatin1::toLowerCase (39 bytes)
    129   15       3       java.util.Arrays::copyOf (19 bytes)
    129   14       1       java.lang.ref.Reference::get (5 bytes)
    129    4       4       java.lang.String::length (6 bytes)
    129    3       4       java.lang.String::charAt (29 bytes)
    130   16       3       java.io.WinNTFileSystem::normalize (143 bytes)
    131   17       3       java.lang.String::startsWith (72 bytes)
    132   18       3       java.lang.String::startsWith (7 bytes)
    132   19       3       java.lang.String::indexOf (70 bytes)
    132   21       3       java.lang.String::<init> (82 bytes)
    132   22       4       java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
    132   25       4       java.lang.AbstractStringBuilder::append (29 bytes)
    132   23       3       java.io.WinNTFileSystem::isSlash (18 bytes)
    133   24  s    3       java.lang.StringBuffer::append (13 bytes)
    133   20       3       java.lang.StringBuilder::<init> (7 bytes)
    133   26       1       sun.instrument.TransformerManager::getSnapshotTransformerList (5 bytes)
    135   27 %     3       book_jvm.P10.T3::doubleValue @ 2 (18 bytes)
    135   28       3       book_jvm.P10.T3::doubleValue (18 bytes)
    135   29 %     4       book_jvm.P10.T3::doubleValue @ 2 (18 bytes)
    135   27 %     3       book_jvm.P10.T3::doubleValue @ -2 (18 bytes)   made not entrant
    136   30       4       book_jvm.P10.T3::doubleValue (18 bytes)
    136   28       3       book_jvm.P10.T3::doubleValue (18 bytes)   made not entrant
    136   31       3       book_jvm.P10.T3::calcSum (26 bytes)
    137   32 %     4       book_jvm.P10.T3::calcSum @ 4 (26 bytes)
    137   33       3       java.util.Arrays::copyOfRange (63 bytes)
    138   34       3       java.lang.String::indexOf (7 bytes)
    138   35       3       java.lang.CharacterData::of (120 bytes)
    138   37       4       book_jvm.P10.T3::calcSum (26 bytes)
    138   36       3       java.lang.CharacterDataLatin1::getProperties (11 bytes)
    138   38       3       java.lang.StringBuilder::append (8 bytes)
    139   31       3       book_jvm.P10.T3::calcSum (26 bytes)   made not entrant
    139   39       3       java.util.HashMap::hash (20 bytes)
 */

/*
第一列

第一列'260'是时间戳。

第二列

第二列是compilation_id和method_attributes。当一个HotSpot编译被触发时，
每个编译单元都会得到一个编译ID。第二列中的数字是编译ID。JIT编译和OSR编译对于编译ID有两个不同的序列。
所以1％和1是不同的编译单元。前两行中的％表示这是OSR编译的事实。OSR编译被触发是因为代码正在循环大循环，
并且VM确定此代码很热。因此，一个OSR编译被触发，这将使VM能够进行堆栈替换，并在准备就绪后转移到优化的代码。

第三栏

第三列performance.api.PerformantIteration::iterateWithConstantSize是方法名称。

第四栏

当OSR编译发生时以及没有时，第四列再次不同。我们先看看通用部分。第四列（59字节）的末尾是指字节码中编译单元的大小（不是编译代码的大小）。
OSR编译中的@ 19部分引用了osr_bci。我将从上面提到的链接引用 -

 Java方法中的“位置”由其字节码索引（BCI）定义，触发OSR编译的位置称为“osr_bci”。OSR编译的nmethod只能从其osr_bci输入; 只要它们的osr_bci不同，就可以同时使用同一个方法的多个OSR编译版本。
 */

/*


    134    1       3       java.lang.Math::min (11 bytes)
    134    2       3       java.lang.String::indexOf (166 bytes)
    134    5     n 0       java.lang.System::arraycopy (native)   (static)
    135    6       3       sun.nio.cs.ext.DoubleByte$Encoder::encodeChar (21 bytes)
    135    7       3       java.lang.String::hashCode (55 bytes)
    135    8       3       java.lang.System::getSecurityManager (4 bytes)
    135    9       3       java.lang.String::equals (81 bytes)
    136   10       3       java.lang.String::getChars (62 bytes)
                              @ 9  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 27  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 43  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 58   java.lang.System::arraycopy (0 bytes)   intrinsic
    137   11       3       java.lang.Object::<init> (1 bytes)
    137   12       3       java.lang.Character::toLowerCase (9 bytes)
                              @ 1   java.lang.CharacterData::of (120 bytes)   callee is too large
                              @ 5   java.lang.CharacterData::toLowerCase (0 bytes)   no static binding
    137    4       4       java.lang.String::length (6 bytes)
    137    3       4       java.lang.String::charAt (29 bytes)
    137   13       3       java.lang.CharacterDataLatin1::toLowerCase (39 bytes)
                              @ 4   java.lang.CharacterDataLatin1::getProperties (11 bytes)
    137   15       3       java.util.Arrays::copyOf (19 bytes)
                              @ 11   java.lang.Math::min (11 bytes)
                              @ 14   java.lang.System::arraycopy (0 bytes)   intrinsic
    138   14       1       java.lang.ref.Reference::get (5 bytes)
    138   16       3       java.io.WinNTFileSystem::normalize (143 bytes)
                              @ 1   java.lang.String::length (6 bytes)
                              @ 31   java.lang.String::charAt (29 bytes)
                                @ 18  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 61   java.io.WinNTFileSystem::normalize (231 bytes)   callee is too large
                              @ 90   java.io.WinNTFileSystem::normalize (231 bytes)   callee is too large
                              @ 111   java.io.WinNTFileSystem::normalize (231 bytes)   callee is too large
                              @ 137   java.io.WinNTFileSystem::normalize (231 bytes)   callee is too large
    140   17       3       java.lang.String::startsWith (72 bytes)
    140   19       3       java.lang.String::indexOf (70 bytes)
                              @ 66   java.lang.String::indexOfSupplementary (71 bytes)   callee is too large
    141   18       3       java.lang.String::startsWith (7 bytes)
                              @ 3   java.lang.String::startsWith (72 bytes)   callee is too large
    141   22       4       java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
    141   21       3       java.lang.String::<init> (82 bytes)
    141   25       4       java.lang.AbstractStringBuilder::append (29 bytes)
                              @ 1   java.lang.Object::<init> (1 bytes)
                              @ 13  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 30  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 65  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 75   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
    142   23       3       java.io.WinNTFileSystem::isSlash (18 bytes)
    142   24  s    3       java.lang.StringBuffer::append (13 bytes)
                              @ 7   java.lang.AbstractStringBuilder::append (29 bytes)
                                @ 7   java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
                                  @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   callee is too large
                              @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   inline (hot)
                                @ 31   java.lang.AbstractStringBuilder::hugeCapacity (28 bytes)   never executed
                              @ 20   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                  @ 20   java.util.Arrays::copyOf (19 bytes)
                                      @ 7   java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)   inline (hot)
                                @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   inline (hot)
                                  @ 31   java.lang.AbstractStringBuilder::hugeCapacity (28 bytes)   never executed
                                @ 20   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                  @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                  @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                            @ 11   java.lang.Math::min (11 bytes)
                                    @ 14   java.lang.System::arraycopy (0 bytes)   intrinsic
    143   20       3       java.lang.StringBuilder::<init> (7 bytes)
                              @ 3   java.lang.AbstractStringBuilder::<init> (12 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
    143   26       1       sun.instrument.TransformerManager::getSnapshotTransformerList (5 bytes)
    145   27 %     3       book_jvm.P10.T3::doubleValue @ 2 (18 bytes)
    145   28       3       book_jvm.P10.T3::doubleValue (18 bytes)
    145   29 %     4       book_jvm.P10.T3::doubleValue @ 2 (18 bytes)
    146   27 %     3       book_jvm.P10.T3::doubleValue @ -2 (18 bytes)   made not entrant
    146   30       4       book_jvm.P10.T3::doubleValue (18 bytes)
    146   28       3       book_jvm.P10.T3::doubleValue (18 bytes)   made not entrant
    146   31       3       java.util.Arrays::copyOfRange (63 bytes)
                              @ 16   java.lang.StringBuilder::<init> (7 bytes)
                                @ 3   java.lang.AbstractStringBuilder::<init> (12 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
                              @ 20   java.lang.StringBuilder::append (8 bytes)
                                @ 2   java.lang.AbstractStringBuilder::append (62 bytes)   callee is too large
                              @ 25   java.lang.StringBuilder::append (8 bytes)
                                @ 2   java.lang.AbstractStringBuilder::append (50 bytes)   callee is too large
                              @ 29   java.lang.StringBuilder::append (8 bytes)
                                @ 2   java.lang.AbstractStringBuilder::append (62 bytes)   callee is too large
                              @ 32   java.lang.StringBuilder::toString (17 bytes)
                                @ 13   java.lang.String::<init> (82 bytes)   callee is too large
                              @ 35   java.lang.IllegalArgumentException::<init> (6 bytes)   don't inline Throwable constructors
                              @ 54   java.lang.Math::min (11 bytes)
                              @ 57   java.lang.System::arraycopy (0 bytes)   intrinsic
    148   32       3       book_jvm.P10.T3::calcSum (26 bytes)
                              @ 12   book_jvm.P10.T3::doubleValue (18 bytes)   inlining prohibited by policy
    148   34       3       java.lang.CharacterData::of (120 bytes)
    148   36 %     4       book_jvm.P10.T3::calcSum @ 4 (26 bytes)
    148   35       3       java.lang.CharacterDataLatin1::getProperties (11 bytes)
    148   37       3       java.lang.StringBuilder::append (8 bytes)
                              @ 2   java.lang.AbstractStringBuilder::append (50 bytes)   callee is too large
    148   33       3       java.lang.String::indexOf (7 bytes)
                              @ 3   java.lang.String::indexOf (70 bytes)   callee is too large
                              @ 12   book_jvm.P10.T3::doubleValue (18 bytes)   inline (hot)
    149   38       3       java.util.HashMap::hash (20 bytes)
                              @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
    149   39       4       book_jvm.P10.T3::calcSum (26 bytes)
                              @ 12   book_jvm.P10.T3::doubleValue (18 bytes)   inline (hot)
    150   32       3       book_jvm.P10.T3::calcSum (26 bytes)   made not entrant
 */