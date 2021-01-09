package unit4;
//9、给定一维数组{ -10，2，3，246，-100，0，5} ，计算出数组中的平均值、最大值、最小值。（知识点：数组遍历、数组元素访问） [选作题]
public class HomeWork9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-10,2,3,246,-100,0,5};
		int sum=0;
		int max=0;
		int min=1000;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		System.out.println(max+" "+min+" "+sum/arr.length);
	}

}
