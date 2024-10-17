package ch07.sec10;



import java.util.Timer;
import java.util.TimerTask;

@FunctionalInterface
interface Callback {
  void onTaskComplete();
}

public abstract class Animal {
  public TimerTask breath(Callback callback){
    System.out.println("BREATH, In...");
    System.out.println();
    Timer timer = new Timer();
    TimerTask t = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Out...");
        callback.onTaskComplete();
      }
    };
    timer.schedule(t, 2000);
    return t;
  }

  public abstract void sound();
}
