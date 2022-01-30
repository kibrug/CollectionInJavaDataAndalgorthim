package com.kibru;

import java.util.LinkedList;

public class LinkedListJava {

    public void linkedListJ(){
        LinkedList<String> addto=new LinkedList<String>();
        addto.add("kibru");
        addto.add("samul");
        addto.add("meratu");
        System.out.println(addto);
        addto.addFirst("Jimma");
        System.out.println(addto);
        //addto.removeLast();
        //System.out.println(addto);
        //addto.remove();
       // System.out.println(addto);
        //addto.removeLast();
       // System.out.println(addto);
        addto.listIterator();
        System.out.println(addto);
        addto.getLast();
        System.out.println(addto);
        addto.getFirst();
        System.out.println(addto);


    }
}
