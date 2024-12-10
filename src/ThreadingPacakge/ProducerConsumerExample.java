package ThreadingPacakge;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE = 5;

    // Produce an item and add to the queue
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            // Wait if the queue is full
            wait();
        }
        queue.offer(item);
        System.out.println("Produced: " + item);
        // Notify the consumer that there is an item to consume
        notify();
    }

    // Consume an item from the queue
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            // Wait if the queue is empty
            wait();
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        // Notify the producer that there is space in the queue
        notify();
        return item;
    }
}

class Producer extends Thread {
    private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.produce(i);
                Thread.sleep(1000);  // Simulate time to produce an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.consume();
                Thread.sleep(1500);  // Simulate time to consume an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
