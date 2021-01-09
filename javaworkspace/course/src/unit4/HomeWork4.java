package unit4;
//4、有2个多维数组分别是 2 3 4   和  1 5 2 8 
//					4 6 8      5 9 10 -3 
//							   2 7 -5 -18
//按照如下方式进行运算。生成一个2行4列的数组。此数组的第1行1列是2*1+3*5+4*2第1行2列是2*5+3*9+4*7  第2行1列是4*1+6*5+8*2 依次类推。（知识点：多维数组定义和创建、数组遍历、数组元素访问） [选作题]

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[2][4];
		int[][] arr1= {{2,3,4},{4,6,8}};
		int[][] arr2= {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				for(int k=0;k<arr1[0].length;k++) {
					
					arr[i][j]+=arr1[i][k]*arr2[k][j];
//					System.out.println(arr[i][j]);
					
				}
				
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
