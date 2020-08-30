package pl.camp.it.wielowatkowosc.notify;

public class Wysylacz implements Runnable {

    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Wysyłacz coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz wciąż coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz dalej coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz wysyła sygnał !!");
                Main.flag = false;
                Main.lock.notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
