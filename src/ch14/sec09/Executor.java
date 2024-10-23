package ch14.sec09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
  public static void main(String[] args) {
    String[][] mails = new String[1000][3];

    for(int i = 0; i < mails.length; i++){
      mails[i][0] = "admin@my.com";
      mails[i][1] = String.format("member%03d@my.com",i);
      mails[i][2] = "New Product";
    }
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    for(int i = 0; i < 1000; i++){

      final int idx = i;
      executorService.execute(()->{
        Thread thread = Thread.currentThread();
        System.out.printf("[%s]%s ==> %s: %s\n",
          thread.getName(), mails[idx][0], mails[idx][1], mails[idx][2]);
      });
    }

    executorService.shutdown();
  }
}
