package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

import static multithreading.ProducerConsumerProblem.queue;

class Producer implements Runnable {

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                queue.put(value);
                System.out.println("produced : " + value);
                value++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Consumer implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                int value = queue.take();
                System.out.println("consumed : " + value);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ProducerConsumerProblem {
    // Shared queue with a capacity of 5 items
    private static final int CAPACITY = 5;
    static final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(CAPACITY);

    public static void main(String[] args) {

        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        consumerThread.start();

    }

}

/**
 * ArrayBlockingQueue is used here because it provides FIFO order.
 *
 * SynchronousQueue: A SynchronousQueue does not have any capacity, so each put() by the producer must wait until a take() by the consumer is ready to receive the item,
 * ensuring strict alternation.
 * The producer will block on queue.put(value) until the consumer has called queue.take().
 * The consumer will block on queue.take() until the producer has called queue.put(value).
 */
