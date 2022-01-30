package com.kibru;

import java.util.Stack;

public class StackJava {
    public void stackj(){
        Stack<Integer> st=new Stack<Integer>();
        st.push(5);
        st.push(89);
        st.push(45);
        st.push(4);
        st.push(2);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push(90);
        System.out.println(st);


    }
}
