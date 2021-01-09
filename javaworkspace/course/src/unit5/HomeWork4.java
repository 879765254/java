package unit5;
//4、写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）（知识点：方法的定义和访问）。[选做题]
public class HomeWork4 {
	public void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,1,9,3,4,5,6,7};
		HomeWork4 homeWork4=new HomeWork4();
		homeWork4.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
