package CsApp;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/9
 * \* Time: 15:19
 * \* Description:
 * \
 */
public class ProducerConsumer {


    static final int N = 100; // 定义缓冲区大小的常量

    static producer p = new producer();

    static consumer c = new consumer();

    static our_monitor mon = new our_monitor();

    static class producer extends Thread {

        @Override
        public void run() {

            int item;

            while (true) {

                item = producer_inem();

                mon.insert(item);
            }

        }

        // 实际生产
        private int producer_inem() {
            return 1;
        }
    }



    static class consumer extends Thread {

        @Override
        public void run() {

            int item;

            while (true) {

                item = mon.remove();

                consumer_item(item);

            }
        }


        // 实际消费
        private void consumer_item(int item) {

        }
    }

    // 这是一个管程
    static class our_monitor {

        private int buffer[] = new int[N];

        private int count = 0,lo = 0,hi = 0;// 计数器和索引

        public synchronized void insert(int val) {

            // 如果缓冲区满了  进入休眠
            if (count == N) {
                go_to_sleep();
            }

            buffer[hi] = val;// 向缓冲区插入一个新的数据项

            hi = ( hi + 1) % N;// 设置下一个数据项的槽

            count = count + 1;// 缓冲区中的数据项又多了一项

            if (count == 1) { // 如果消费者在休眠，则将其唤醒
                notify();
            }
        }

        public synchronized int remove() {
            int val;

            // 缓冲区为空 进入休眠
            if (count == 0) {
                go_to_sleep();
            }

            val = buffer[lo];// 从缓冲区取出一个数据项

            lo = ( lo + 1) % N;// 设置待取数据项的槽

            count = count - 1;// 缓冲区中数据项数目减少1

            if (count == N - 1) {// 如果生产者休眠，则将其唤醒
                notify();
            }

            return val;
        }



        private void go_to_sleep(){

            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {

        p.start();

        c.start();


    }



}
