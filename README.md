# multithreading
<!--ts-->
   * [multithreading](#multithreading)
      * [demo01](#demo01)
         * [1、Thread方式创建多线程](#1thread\xE6\x96\xB9\xE5\xBC\x8F\xE5\x88\x9B\xE5\xBB\xBA\xE5\xA4\x9A\xE7\xBA\xBF\xE7\xA8\x8B)
         * [2、Thread方式多线程下载图片](#2thread\xE6\x96\xB9\xE5\xBC\x8F\xE5\xA4\x9A\xE7\xBA\xBF\xE7\xA8\x8B\xE4\xB8\x8B\xE8\xBD\xBD\xE5\x9B\xBE\xE7\x89\x87)
      * [demo02](#demo02)
         * [1、Runnable方式创建多线程](#1runnable\xE6\x96\xB9\xE5\xBC\x8F\xE5\x88\x9B\xE5\xBB\xBA\xE5\xA4\x9A\xE7\xBA\xBF\xE7\xA8\x8B)
            * [2、Runnable方式多线程下载图片](#2runnable\xE6\x96\xB9\xE5\xBC\x8F\xE5\xA4\x9A\xE7\xBA\xBF\xE7\xA8\x8B\xE4\xB8\x8B\xE8\xBD\xBD\xE5\x9B\xBE\xE7\x89\x87)

<!-- Added by: jbkj, at: 2020年11月25日 星期三 16时25分04秒 CST -->

<!--te-->
## demo01
### 1、Thread方式创建多线程
 + 继承Thread类 
 + 重写run()方法 
 + 调用start()方法
### 2、Thread方式多线程下载图片

## demo02
### 1、Runnable方式创建多线程
+ 实现Runnable接口 
+ 重写run方法 
+ 创建Runnable实现类 丢入Thread 执行start方法
#### 2、Runnable方式多线程下载图片
## demo03
#### 模拟购票(发现多线程的问题)
#### 龟兔赛跑
## demo04
### 1、实现Callable创建多线程
+ 实现callable接口
+ 重写call方法 需要抛出异常
+ 创建目标对象
+ 创建执行服务：ExecutorService ser = Executor.newFixedThreadPool(1);
+ 提交执行：Future<Boolean> result = ser.submit(t1);
+ 获取结果：boolean b1 = result.get();
+ 关闭服务：service.shutdownNow();
