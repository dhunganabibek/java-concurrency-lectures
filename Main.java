import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // java concurrency Thread
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    MyRunnable myRunnable = new MyRunnable();
    Thread t1 = new Thread(myRunnable);
    t1.start();

  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int i = 100; i < 110; i++) {
      System.out.println(i);
    }

  }

}