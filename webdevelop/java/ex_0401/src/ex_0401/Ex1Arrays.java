package ex_0401;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 1, 2, 5, 4};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {3, 1, 2, 5, 4};
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
	}

}
