package thread.c3.c_3_1.c_3_1_7.A3;

import C_2.c_2_3.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 14:45
 * \* Description:
 * \
 */
public class NonReentrantLock implements Lock {

    private static class Sync extends AbstractQueuedSynchronizer{


        protected Sync() {
            super();
        }


//        如果state为0  则尝试获取锁
        @Override
        protected boolean tryAcquire(int arg) {
            assert arg == 1;
            if (compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }


//        尝试释放锁 设置state为0
        @Override
        protected boolean tryRelease(int arg) {
            assert arg == 1;
            if (getState() == 0){
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected int tryAcquireShared(int arg) {
            return super.tryAcquireShared(arg);
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            return super.tryReleaseShared(arg);
        }


//        是否锁已经被持有
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

//        提供条件变量接口
        Condition newCondition(){
            return new ConditionObject();
        }
    }


    private final Sync sync = new Sync();

    public void lock(){
        sync.acquire(1);
    }


    public boolean tryLock(){
        return sync.tryAcquire(1);
    }

    public void unlock(){
        sync.release(1);
    }

    public Condition newCondition(){
        return sync.newCondition();
    }

    public boolean isLocked(){
        return sync.isHeldExclusively();
    }

    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1,unit.toNanos(timeout));
    }
}
