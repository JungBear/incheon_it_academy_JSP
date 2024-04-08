package ex_0401;

import java.util.Arrays;

public class Ex2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2, 3};
		
		int[] arr2 = arr1;
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 2;
		System.out.println(Arrays.toString(arr2));
		
		
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		
		int[] arr4 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		
		
	}

}
