package com.kibru;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {
    public void iteratorJ(){

        ArrayList<Integer> intD=new ArrayList<Integer>();
        intD.add(4);
        intD.add(6);
        intD.add(45);
        intD.add(9);
        Iterator<Integer> ito=intD.iterator();
       // System.out.println(ito.next());
        //System.out.println(ito.hasNext());
       /* while(ito.hasNext()){
            System.out.println(ito.next());

        */
        while(ito.hasNext()){
            Integer i =ito.next();
            if(i<10){
             ito.remove();
            }

        }
        System.out.println(ito);
    }
}
