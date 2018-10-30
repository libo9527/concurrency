package com.demo.interview.designpattern.task;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:53
 */
public class TransactionalRunnable implements Runnable {

    private final Runnable innerRunnable;

    public TransactionalRunnable(Runnable innerRunnable) {
        this.innerRunnable = innerRunnable;
    }

    @Override
    public void run() {
        boolean shouldRollback = false;
        try {
            beginTransaction();
            innerRunnable.run();
        }catch (Exception e){
            shouldRollback = true;
            throw e;
        }finally {
            if (shouldRollback){
                rollback();
            }else {
                commit();
            }
        }
    }

    private void commit() {
        System.out.println("Commit.");
    }

    private void rollback() {
        System.out.println("Rollback.");
    }

    private void beginTransaction() {
        System.out.println("Begin transaction.");
    }
}
