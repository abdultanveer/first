package threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
