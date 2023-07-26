package LABpack;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class producer {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared BlockingQueue with a capacity of 2
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

        // Create producer thread
        Thread producerThread = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    System.out.println("Producer produced-" + value);
                    queue.put(value++); // Add to the queue
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int val = queue.take(); // Remove from the queue
                    System.out.println("Consumer consumed-" + val);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();

        // Let the program run for some time (10 seconds in this case)
        Thread.sleep(10000);

        // Interrupt both threads to stop them after the desired duration
        producerThread.interrupt();
        consumerThread.interrupt();
    }
}

