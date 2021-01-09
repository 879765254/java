package unit4;
//6、 在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。（知识点：数组遍历、数组元素访问） [必做题]
public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {18,25,7,36,13,2,89,63};
		int max=0;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println(max+" "+index);
	}

}
