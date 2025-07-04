package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        
        if (!firstQueue.isEmpty()) arrayDeque.addLast(firstQueue.poll());
        if (!firstQueue.isEmpty()) arrayDeque.addLast(firstQueue.poll());
        if (!secondQueue.isEmpty()) arrayDeque.addLast(secondQueue.poll());
        if (!secondQueue.isEmpty()) arrayDeque.addLast(secondQueue.poll());
        
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                if (!arrayDeque.isEmpty()) {
                    firstQueue.add(arrayDeque.pollLast());
                }
                if (!firstQueue.isEmpty()) {
                    arrayDeque.addLast(firstQueue.poll());
                }
                if (!firstQueue.isEmpty()) {
                    arrayDeque.addLast(firstQueue.poll());
                }
            }
            
            if (!secondQueue.isEmpty()) {
                if (!arrayDeque.isEmpty()) {
                    secondQueue.add(arrayDeque.pollLast());
                }
                if (!secondQueue.isEmpty()) {
                    arrayDeque.addLast(secondQueue.poll());
                }
                if (!secondQueue.isEmpty()) {
                    arrayDeque.addLast(secondQueue.poll());
                }
            }
        }
        
        return arrayDeque;
    }
}
