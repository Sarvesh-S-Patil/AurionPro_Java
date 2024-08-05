package com.apro.test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30); // Adding elements
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("Priority Queue: " + priorityQueue);

        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}
