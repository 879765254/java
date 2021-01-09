package unit4;

//5、 输出一个double型二维数组（长度分别为5、4，值自己设定）的值。（知识点：数组定义和创建、多维数组初始化、数组遍历） [必做题]
public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4}, { 1, 2, 3, 4}, { 1, 2, 3, 4}, { 1, 2, 3, 4}, { 1, 2, 3, 4} };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
