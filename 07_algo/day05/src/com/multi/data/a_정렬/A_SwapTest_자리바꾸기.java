package com.multi.data.a_정렬;

import java.util.Arrays;

public class A_SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		System.out.println(Arrays.toString(num));
		
		//num[0] --> 6, num[5] --> 9
		int temp = num[5]; //temp <-- 9
		num[5] = num[0]; //num[5] <-- 6
		num[0] = temp; //num[0] <-- 9
		System.out.println(Arrays.toString(num));
	


	}
}
