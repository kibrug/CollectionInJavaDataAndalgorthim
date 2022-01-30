package com.kibru;

import java.util.PriorityQueue;

public class Que {
    public void PriorityQue(){

        PriorityQueue<Integer> prQ=new PriorityQueue<Integer>();
        prQ.add(5);
        prQ.add(6);
        prQ.add(67);
        prQ.add(56);
        prQ.add(2);
        //System.out.println(prQ.peek());
        System.out.println(prQ.poll());
        System.out.println(prQ.peek());
    }
}
