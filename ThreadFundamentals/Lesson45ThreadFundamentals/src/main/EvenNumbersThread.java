package main;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : ThreadFundamentals
 */
public class EvenNumbersThread extends Thread{

    @Override
    public void run() { // main method of a thread
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1_000);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();

        }
    }
}
