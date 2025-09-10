package completableFutures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest1 {
    public static void main(String[] args) throws InterruptedException {
        //1. 通过Thread创建线程
        Thread thread1=new Thread(()->{
            System.out.println("Thread1 is running...");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread1 is done.");
        });
        thread1.start();
        thread1.interrupt();
        // 2.通过runnables创建线程
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable is running...");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Runnable is done.");
            }
        };
        Thread thread2=new Thread(runnable);
        thread2.start();
        thread2.interrupt();
        //ps: Thread实现runnable接口，使用runnable可以通过一个runnable实例共享变量到多个线程
        SharedResource sharedResource=new SharedResource();
        Thread thread3=new Thread(sharedResource);
        Thread thread4=new Thread(sharedResource);
        thread3.start();
        thread4.start();
        thread3.interrupt();
        thread4.interrupt();
        //3.通过callable+runnable+线程池创建线程
        Callable<String> callable=()->{
            System.out.println("Callable is running");
            return "Callable is done";
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future=executorService.submit(callable);
        executorService.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException exception) {
            exception.printStackTrace();
        }
        executorService.close();
        List<String> a=new ArrayList<>();
        //CompletableFuture
    }
}
