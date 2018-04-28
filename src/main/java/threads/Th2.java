package threads;

public class Th2 {

    public synchronized void sync(){
        for(int i =0; i < 5; i++){
            System.out.println("sync: " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Th2 t = new Th2();

        Thread t1 = new Thread(() -> {
            t.sync();
        });

        Thread t2 = new Thread(() -> {
            t.sync();
        });

        t1.start();
        t2.start();
    }




}
