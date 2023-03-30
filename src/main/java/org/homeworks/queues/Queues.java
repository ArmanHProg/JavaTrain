package org.homeworks.queues;

import java.util.*;

public class Queues {

    /**
     * making queue
     */
        public void queue(){

            Queue queue = new LinkedList();

            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add("A");

        }

        public void deque(){

            Deque deque = new LinkedList();


            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add("A");

        }

        public void priorityIntQueue(){

            Queue<Integer> queue = new  PriorityQueue<Integer>();

            queue.add(1);
            queue.add(-1);
            queue.add(0);
            queue.add(10);

        }

        public void priorityStringQueue(){

            Queue<String> queue = new  PriorityQueue<String>();

            queue.add("aaaa");
            queue.add("aaba");
            queue.add("abaa");
            queue.add("baab");

        }

        public void arrDeque(){

            Deque deque = new ArrayDeque();

            deque.add("a");
            deque.add("abs");
            deque.add(1);


        }

        public void removeQueue(){

            Queue<Integer> queue = new LinkedList<>();

            queue.add(1);
            queue.add(-1);
            queue.add(0);
            queue.add(10);

            while(!queue.isEmpty()) {
                queue.poll();
            }
            System.out.println(queue);
        }

     public void removeElementsDeque() {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        while(!deque.isEmpty()) {
            deque.poll();
        }
        System.out.println(deque);

    }

    boolean checkQueue(Integer element) {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        if(queue.contains(element)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkDeque(Integer element) {
        Deque deque = new ArrayDeque();

        deque.add(1);
        deque.add(4);
        deque.add(3);
        deque.add(2);


        if(deque.contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    public void colorsPriorityQueue(){

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Orange");
        queue.add("Black");


        System.out.println(queue);
    }

    public void clonePQueues(){
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        PriorityQueue<String> queue2 = new PriorityQueue<String>();

        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Blue");
        queue1.add("Orange");
        queue1.add("Black");

        queue2.addAll(queue1);

        System.out.println(queue2);
    }



    public void PriorityQueueExample() {

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            pq.add(10);
            pq.add(20);
            pq.add(30);

            int firstElement = pq.poll();

            System.out.println("First element: " + firstElement);

        }


        public void pqMax(){

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            pq.add(10);
            pq.add(20);
            pq.add(30);
            pq.add(15);

            System.out.println("Elements of the PriorityQueue: " + pq);
        }
    }




