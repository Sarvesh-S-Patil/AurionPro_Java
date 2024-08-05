package com.apro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");

        System.out.println("Deque: " + deque);

        while (!deque.isEmpty()) {
            String first = deque.removeFirst();
            System.out.println("Removed from front: " + first);
        }
    }
}

