package unit2;

import java.util.Scanner;

//2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除（知识点：变量和运算符综合应用） [必做题]
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int hundred=a/100;
		int ten=a%100/10;
		int one=a%10;
		System.out.println(hundred+ten+one);
	}

}
