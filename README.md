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

## Daemon Thread

---
- The main thread end when all the thread stops.

to set a Daemon Thread

```java
Thread t = new Thread();
t.setDaemon(true);
```

## Thread lifecycle

- New
- Runnable
- Blocked
- Waiting
- Timed Waiting
- Terminated
- Running


## Thread goes to sleep with:

```java
Thread.sleep();
```