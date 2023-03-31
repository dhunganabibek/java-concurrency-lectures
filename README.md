# Java concurrency Course from Javabrains

## Topics
---
- Threads
- Process
- Using Threads
- Daemon Threads
- Lifecycle and thread states
- Race Conditions
- Synchronization
- Monitor and structured locking
- volatile keywords
- Thread local
- unstructured lock
- executor lock
- Thread pool
- Callables and Future 
- Semaphores
- Fork Join framework

## Difference between thread and process
---
- thread -- unit of execution with in the process
- process -- running programs
- process have one main thread and can have many threads

## creating a new thread
```java
    MyRunnable myRunnable = new MyRunnable();
    Thread t1 = new Thread(myRunnable);
    t1.start();
```
## creating a thread with lambda
```java
new Thread(() -> System.out.println("running)).start();
```