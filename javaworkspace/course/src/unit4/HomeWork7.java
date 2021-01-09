package unit4;
//7、将一个数组中的元素逆序存放（知识点：数组遍历、数组元素访问） [选作题]
public class HomeWork7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
//			System.out.println("ss");
			if(i<=arr.length-i-1) {
				int temp=arr[i];
				arr[i]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;
				System.out.println(arr[i]+" "+arr[arr.length-i-1]);
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
