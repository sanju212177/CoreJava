package com.capgemini.febr18;

import java.util.stream.IntStream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //traditional approach of imperative programming
        int sum = 0;
        for (int i : arr) { 
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println("The Sum1 of Evens: " + sum);
        //functional or declarative programming
        
        int sum2 = IntStream.of(arr).filter(num -> num %2 ==0).sum();
        System.out.println("The Sum2 of Evens: " + sum2);
	}

}
