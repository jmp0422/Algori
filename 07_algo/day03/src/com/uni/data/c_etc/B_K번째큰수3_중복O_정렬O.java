package com.uni.data.c_etc;

import java.util.Scanner;
import java.util.TreeSet;

public class B_K번째큰수3_중복O_정렬O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt(); //입력할 개수, 5 
		int k = sc.nextInt(); //k번째 큰수, 2
		//TreeSet<- 3, 4, 5, 1, 2
		TreeSet<Integer> set = new TreeSet<>(); //오름차순 
		//TreeSet<Integer> name 
		// = new TreeSet<>(Collections.reverseOrder())); //내림차순 
		int[] num = {3, 4, 5, 1, 2};
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
//		for (int i = 0; i < size; i++) {
//			set.add(sc.nextInt());
//		}
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length - k]);
	}
}
