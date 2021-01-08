package unit2;
//1、已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。（知识点：变量和运算符综合应用） [必做题]
public class Homework1 {


	public static void main(String[] args) {
		int a=1;
		int b=2;
		int temp=b;
		b=a;
		a=temp;
		System.out.println(a+","+b);

	}

}
