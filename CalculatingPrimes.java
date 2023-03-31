import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatingPrimes {
  public static void main(String[] args) {

    List<Thread> threads = new ArrayList<>();
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("I can tell you nth prime. Enter n");
      int n = sc.nextInt();
      if (n == 0)
        break;

      Runnable r = new Runnable() {
        @Override
        public void run() {
          int number = PrimeNumberUtil.calculatePrime(n);
          System.out.println("\n Value of " + n + "th prime :" + number);
        }
      };
      Thread t = new Thread(r);
      threads.add(t);
      t.start();

      Runnable statusReporter = () -> {
        while (true) {
          try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          printThreads(threads);
        }
      };
      Thread reporterThread = new Thread(statusReporter);
      reporterThread.start();

    }
  }

  public static void printThreads(List<Thread> threads) {
    System.out.println("Thread status");
    threads.forEach((thread) -> System.out.println(thread.getState()));
    System.out.println();
  }
}

class PrimeNumberUtil {
  public static int calculatePrime(int n) {
    int number;
    int numberOfPrimeFound;
    int i;
    number = 1;
    numberOfPrimeFound = 0;

    while (numberOfPrimeFound < n) {
      number++;
      for (i = 2; i <= number && number % i != 0; i++) {
      }
      if (i == number) {
        numberOfPrimeFound++;
      }

    }
    return number;

  }
}
