package answer20261020;

import java.util.ArrayList;

public class Answer02 {

	public static void main(String[] args) {
		
		//　配列はミュータブル
		
		int[] array1 = {0, 1, 2};
		
		int[] array2 = array1;
		
		array1[0] = 5;
		
		System.out.println("array2[0] : " + array2[0]);
		
		
		//ArrayListもミュータブル
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		ArrayList<Integer> list2 = list1;
		
		list1.add(1);
		list1.add(2);
		
		System.out.println("list2 : " + list2);
		
		
	}

}
