package unit4;
//8. 将一个数组中的重复元素保留一个其他的清零。（知识点：数组遍历、数组元素访问） [选作题]
public class HomeWork8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,2,2,3,2,3,1,2,3};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==arr[i]) {
						arr[j]=0;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
