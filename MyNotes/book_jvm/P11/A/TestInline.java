package book_jvm.P11.A;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/16
 * \* Time: 20:13
 * \* Description:
 * \
 */
public class TestInline {

    private static final int COUNT = 200000;

    public static void main(String[] args) {
        System.out.println(arrayCompute() + " " + virtualCompute() + " " + interfaceCompute());
    }


    /*

    测试方法说明：

arrayCompute，创建一个接口类型Host的数组Host[4]，分别指向4个不同接口实现类实例；多次调用这些接口方法
virtualCompute，分别创建4个不同的接口实现类引用，并分别指向对应的实现类实例；多次调用这些方法
interfaceCompute，与arrayCompute类似，不同的是将在arrayCompute中的loop调用做展开；多次调用这些方法



     */
    static long arrayCompute() {
        Container.Host[] hosts = new Container.Host[4];

        hosts[0] = new Container.HostA();
        hosts[1] = new Container.HostB();
        hosts[2] = new Container.HostC();
        hosts[3] = new Container.HostD();

        long start = System.currentTimeMillis();
        Random r = new Random(start);

        int x = r.nextInt(10);
        int y = r.nextInt(10);

        for (int i = 0; i < COUNT; i++) {
            for (Container.Host host : hosts) {
                x = host.compute(x, y);
            }
        }

        return System.currentTimeMillis() - start;
    }

    static long virtualCompute() {
        Container.HostA hostA = new Container.HostA();
        Container.HostB hostB = new Container.HostB();
        Container.HostC hostC = new Container.HostC();
        Container.HostD hostD = new Container.HostD();

        long start = System.currentTimeMillis();
        Random r = new Random(start);

        int x = r.nextInt(10);
        int y = r.nextInt(10);

        for (int i = 0; i < COUNT; i++) {
            x = hostA.compute(x, y);
            x = hostB.compute(x, y);
            x = hostC.compute(x, y);
            x = hostD.compute(x, y);
        }

        return System.currentTimeMillis() - start;
    }

    static long interfaceCompute() {
        Container.Host[] hosts = new Container.Host[4];

        hosts[0] = new Container.HostA();
        hosts[1] = new Container.HostB();
        hosts[2] = new Container.HostC();
        hosts[3] = new Container.HostD();

        long start = System.currentTimeMillis();
        Random r = new Random(start);

        int x = r.nextInt(10);
        int y = r.nextInt(10);

        for (int i = 0; i < COUNT; i++) {
            x = hosts[0].compute(x, y);
            x = hosts[1].compute(x, y);
            x = hosts[2].compute(x, y);
            x = hosts[3].compute(x, y);
        }

        return System.currentTimeMillis() - start;
    }


}


/*


"C:\Program Files\Java\jdk1.8.0_212\bin\java.exe" -XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining "-javaagent:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=7896:E:\IDEA Develop\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_212\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_212\jre\lib\rt.jar;E:\learn-java\Learning-Java\output\production\Learning-Java" book_jvm.P11.A.TestInline
    134    1       3       java.lang.Math::min (11 bytes)
    134    2       3       java.lang.String::indexOf (166 bytes)
    135    5     n 0       java.lang.System::arraycopy (native)   (static)
    135    6       3       java.lang.String::hashCode (55 bytes)
    135    7       3       sun.nio.cs.ext.DoubleByte$Encoder::encodeChar (21 bytes)
    135    8       3       java.lang.System::getSecurityManager (4 bytes)
    136    9       3       java.lang.String::equals (81 bytes)
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
    137   13       3       java.lang.CharacterDataLatin1::toLowerCase (39 bytes)
    137    3       4       java.lang.String::charAt (29 bytes)
                              @ 4   java.lang.CharacterDataLatin1::getProperties (11 bytes)
    138   15       3       java.util.Arrays::copyOf (19 bytes)
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
    140   18       3       java.lang.String::startsWith (7 bytes)
                              @ 3   java.lang.String::startsWith (72 bytes)   callee is too large
    140   19       3       java.lang.String::indexOf (70 bytes)
                              @ 66   java.lang.String::indexOfSupplementary (71 bytes)   callee is too large
    141   20       4       java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
    141   23       4       java.lang.AbstractStringBuilder::append (29 bytes)
    141   21       3       java.io.WinNTFileSystem::isSlash (18 bytes)
    141   22  s    3       java.lang.StringBuffer::append (13 bytes)
                              @ 7   java.lang.AbstractStringBuilder::append (29 bytes)
                                @ 7   java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
                                  @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   callee is too large
                                  @ 20   java.util.Arrays::copyOf (19 bytes)
                                    @ 11   java.lang.Math::min (11 bytes)
                                    @ 14   java.lang.System::arraycopy (0 bytes)   intrinsic
                              @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   inline (hot)
                                @ 31   java.lang.AbstractStringBuilder::hugeCapacity (28 bytes)   never executed
                              @ 20   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
    142   24       3       java.lang.String::<init> (82 bytes)
                              @ 1   java.lang.Object::<init> (1 bytes)
                              @ 13  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 7   java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)   inline (hot)
                                @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   inline (hot)
                                  @ 31   java.lang.AbstractStringBuilder::hugeCapacity (28 bytes)   never executed
                                @ 20   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                  @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                  @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                              @ 30  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 65  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                              @ 75   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
    143   25       1       sun.instrument.TransformerManager::getSnapshotTransformerList (5 bytes)
    143   27     n 0       sun.misc.Unsafe::getObjectVolatile (native)
    143   26       3       java.util.concurrent.ConcurrentHashMap::tabAt (21 bytes)
                              @ 14   sun.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
    143   28       1       java.util.ArrayList::size (5 bytes)
    143   29       3       java.lang.String::toCharArray (25 bytes)
                              @ 20   java.lang.System::arraycopy (0 bytes)   intrinsic
    144   31       3       java.util.HashMap::getNode (148 bytes)
                              @ 59   java.lang.Object::equals (11 bytes)   no static binding
                              @ 94   java.util.HashMap$TreeNode::getTreeNode (22 bytes)   not inlineable
                              @ 126   java.lang.Object::equals (11 bytes)   no static binding
    145   33       1       java.lang.Object::<init> (1 bytes)
    145   11       3       java.lang.Object::<init> (1 bytes)   made not entrant
    145   32       3       java.lang.CharacterData::of (120 bytes)
    145   34       3       java.util.Arrays::copyOfRange (63 bytes)
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
    146   36       3       java.lang.AbstractStringBuilder::append (50 bytes)
                              @ 5   java.lang.AbstractStringBuilder::appendNull (56 bytes)   callee is too large
                              @ 10   java.lang.String::length (6 bytes)
                              @ 21   java.lang.AbstractStringBuilder::ensureCapacityInternal (27 bytes)
                                @ 17   java.lang.AbstractStringBuilder::newCapacity (39 bytes)   callee is too large
                                @ 20   java.util.Arrays::copyOf (19 bytes)
                                  @ 11   java.lang.Math::min (11 bytes)
                                  @ 14   java.lang.System::arraycopy (0 bytes)   intrinsic
                              @ 35   java.lang.String::getChars (62 bytes)   callee is too large
    147   35       3       java.lang.StringBuilder::append (8 bytes)
                              @ 2   java.lang.AbstractStringBuilder::append (50 bytes)   callee is too large
    147   40       3       book_jvm.P11.A.Container$HostB::compute (6 bytes)
    147   41       3       book_jvm.P11.A.Container$HostC::compute (6 bytes)
    147   42       3       book_jvm.P11.A.Container$HostD::compute (4 bytes)
    147   39       3       book_jvm.P11.A.Container$HostA::compute (4 bytes)
    147   37       3       java.lang.String::indexOf (7 bytes)
                              @ 3   java.lang.String::indexOf (70 bytes)   callee is too large
    147   44       1       book_jvm.P11.A.Container$HostB::compute (6 bytes)
    148   40       3       book_jvm.P11.A.Container$HostB::compute (6 bytes)   made not entrant
    148   45       1       book_jvm.P11.A.Container$HostC::compute (6 bytes)
    148   41       3       book_jvm.P11.A.Container$HostC::compute (6 bytes)   made not entrant
    148   46       1       book_jvm.P11.A.Container$HostD::compute (4 bytes)
    148   42       3       book_jvm.P11.A.Container$HostD::compute (4 bytes)   made not entrant
    148   43       1       book_jvm.P11.A.Container$HostA::compute (4 bytes)
    148   39       3       book_jvm.P11.A.Container$HostA::compute (4 bytes)   made not entrant
    148   30       3       java.util.HashMap::hash (20 bytes)
                              @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
    148   38       1       java.net.URL::getHost (5 bytes)
    149   47 %     3       book_jvm.P11.A.TestInline::arrayCompute @ 95 (140 bytes)
                              @ 11   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 21   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 31   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 41   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 45   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 54   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 69   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 115   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 134   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    150   48       3       java.lang.Character::toLowerCase (6 bytes)
                              @ 1   java.lang.Character::toLowerCase (9 bytes)
                                @ 1   java.lang.CharacterData::of (120 bytes)   callee is too large
                                @ 5   java.lang.CharacterData::toLowerCase (0 bytes)   no static binding
    150   49 %     3       book_jvm.P11.A.TestInline::arrayCompute @ 77 (140 bytes)
                              @ 11   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 21   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 31   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 41   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 45   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 54   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 69   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 115   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 134   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    152   50 %     4       book_jvm.P11.A.TestInline::arrayCompute @ 77 (140 bytes)
    154   49 %     3       book_jvm.P11.A.TestInline::arrayCompute @ -2 (140 bytes)   made not entrant
    154   51 %     4       book_jvm.P11.A.TestInline::arrayCompute @ 95 (140 bytes)
    155   47 %     3       book_jvm.P11.A.TestInline::arrayCompute @ -2 (140 bytes)   made not entrant
    156   52       4       book_jvm.P11.A.TestInline::arrayCompute (140 bytes)
                              @ 11   book_jvm.P11.A.Container$HostA::<init> (5 bytes)   inline (hot)
                                @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                              @ 21   book_jvm.P11.A.Container$HostB::<init> (5 bytes)   inline (hot)
                                @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                              @ 31   book_jvm.P11.A.Container$HostC::<init> (5 bytes)   inline (hot)
                                @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                              @ 41   book_jvm.P11.A.Container$HostD::<init> (5 bytes)   inline (hot)
                                @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                              @ 45   java.lang.System::currentTimeMillis (0 bytes)   (intrinsic)
                              @ 54   java.util.Random::<init> (53 bytes)   call site not reached
                              @ 61   java.util.Random::nextInt (74 bytes)   too big
                              @ 69   java.util.Random::nextInt (74 bytes)   too big
    160   51 %     4       book_jvm.P11.A.TestInline::arrayCompute @ -2 (140 bytes)   made not entrant
    175   53 %     3       book_jvm.P11.A.TestInline::virtualCompute @ 69 (129 bytes)
                              @ 4   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 12   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 20   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 28   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 32   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 43   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 52   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 81   book_jvm.P11.A.Container$HostA::compute (4 bytes)
                              @ 91   book_jvm.P11.A.Container$HostB::compute (6 bytes)
                              @ 101   book_jvm.P11.A.Container$HostC::compute (6 bytes)
                              @ 111   book_jvm.P11.A.Container$HostD::compute (4 bytes)
                              @ 122   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    176   54       3       book_jvm.P11.A.TestInline::virtualCompute (129 bytes)
                              @ 4   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 12   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 20   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 28   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 32   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 43   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 52   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 81   book_jvm.P11.A.Container$HostA::compute (4 bytes)
                              @ 91   book_jvm.P11.A.Container$HostB::compute (6 bytes)
                              @ 101   book_jvm.P11.A.Container$HostC::compute (6 bytes)
                              @ 111   book_jvm.P11.A.Container$HostD::compute (4 bytes)
                              @ 122   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    177   55 %     4       book_jvm.P11.A.TestInline::virtualCompute @ 69 (129 bytes)
                              @ 81   book_jvm.P11.A.Container$HostA::compute (4 bytes)   inline (hot)
                              @ 91   book_jvm.P11.A.Container$HostB::compute (6 bytes)   inline (hot)
                              @ 101   book_jvm.P11.A.Container$HostC::compute (6 bytes)   inline (hot)
                              @ 111   book_jvm.P11.A.Container$HostD::compute (4 bytes)   inline (hot)
    179   53 %     3       book_jvm.P11.A.TestInline::virtualCompute @ -2 (129 bytes)   made not entrant
    182   56 %     3       book_jvm.P11.A.TestInline::interfaceCompute @ 77 (152 bytes)
                              @ 11   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 21   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 31   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 41   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 45   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 54   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 69   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 91   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 105   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 119   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 133   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 146   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    183   57       3       book_jvm.P11.A.TestInline::interfaceCompute (152 bytes)
                              @ 11   book_jvm.P11.A.Container$HostA::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 21   book_jvm.P11.A.Container$HostB::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 31   book_jvm.P11.A.Container$HostC::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 41   book_jvm.P11.A.Container$HostD::<init> (5 bytes)
                                @ 1   java.lang.Object::<init> (1 bytes)
                              @ 45   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
                              @ 54   java.util.Random::<init> (53 bytes)   callee is too large
                              @ 61   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 69   java.util.Random::nextInt (74 bytes)   callee is too large
                              @ 91   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 105   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 119   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 133   book_jvm.P11.A.Container$Host::compute (0 bytes)   not inlineable
                              @ 146   java.lang.System::currentTimeMillis (0 bytes)   intrinsic
    184   58 %     4       book_jvm.P11.A.TestInline::interfaceCompute @ 77 (152 bytes)
                              @ 91   book_jvm.P11.A.Container$HostA::compute (4 bytes)   inline (hot)
                               \-> TypeProfile (43617/43617 counts) = book_jvm/P11/A/Container$HostA
                              @ 105   book_jvm.P11.A.Container$HostB::compute (6 bytes)   inline (hot)
                               \-> TypeProfile (43616/43616 counts) = book_jvm/P11/A/Container$HostB
                              @ 119   book_jvm.P11.A.Container$HostC::compute (6 bytes)   inline (hot)
                               \-> TypeProfile (43616/43616 counts) = book_jvm/P11/A/Container$HostC
                              @ 133   book_jvm.P11.A.Container$HostD::compute (4 bytes)   inline (hot)
                               \-> TypeProfile (43616/43616 counts) = book_jvm/P11/A/Container$HostD
16 16 0


以上日志信息说明，arrayCompute方法中对Host::compute的调用，JIT认为“not inlineable”，未对其进行内联优化；另一方面
，对virtualCompute和interfaceCompute中的Host::compute调用，JIT唯一确定了每个调用的具体实现方法，并进行了内联优化
（注：inline (hot)表示当前调用已被内联）。结合运行时间结果，可以看到方法内联带来的性能提升是巨大的。在本例中，方法内联带来的性能提升约为20多倍。

比较有意思的一点是，interfaceCompute相对于arrayCompute，仅仅是将foreach loop做了展开，但结果却是让JIT唯一确定了interface方法的具体实现实例，
从而可以正确的完成内联优化。这里面的JIT逻辑我也还没有进一步的了解，暂作留存，待后面再做研究吧。

 */