package book_jvm.P11.A;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/16
 * \* Time: 20:13
 * \* Description:
 * \
 */
public class Container {

    interface Host {
        int compute(int x, int y);
    }

    static class HostA implements Host {
        @Override
        public int compute(int x, int y) {
            return x + y;
        }
    }

    static class HostB implements Host {
        @Override
        public int compute(int x, int y) {
            return x + x + y;
        }
    }

    static class HostC implements Host {
        @Override
        public int compute(int x, int y) {
            return x + y + y;
        }
    }

    static class HostD implements Host {
        @Override
        public int compute(int x, int y) {
            return x - y;
        }
    }
}
