package unit4;

import java.util.Arrays;

//3、给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。（知识点：Arrays.sort排序、冒泡排序） [必做题]
public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,6,2,3,9,4,5,7,8};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
//		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
