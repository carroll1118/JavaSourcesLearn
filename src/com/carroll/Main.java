package com.carroll;

public class Main {

    public static void main(String[] args) {
	// write your code here

        A:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==2){
                    System.out.println(j);
                    break A;
                }
            }
        }
    }
}
