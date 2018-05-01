package zeus.playground.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: KG
 * @description:
 * @date: Created in 下午1:45 2018/5/1
 * @modified by:
 */

public class CallableDemo {
    public static void main(String[] args) {
        // 创建Callable对象
        CallableDemo rt = new CallableDemo();
        // 先使用Lambda表达式创建Callable<Integer>对象
        // 使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " 的循环变量i的值：" + i);
            }
            // call()方法可以有返回值
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " 的循环变量i的值：" + i);
            if (i == 20) {
                // 实质还是以Callable对象来创建、并启动线程
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            // 获取线程返回值
            System.out.println("子线程的返回值：" + task.get());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
