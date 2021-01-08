package unit2;

import java.util.Scanner;
//3、华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。[选做题]

public class Homework3 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("输入华氏度");
		Double h=scan.nextDouble();
		Double h_change_s=(h-32)*5/9;
		System.out.println(h_change_s);
		System.out.println("输如摄氏度");
		Double s=scan.nextDouble();
		Double s_change_h=s*9/5+32;
		System.out.println(s_change_h);
	}
	
	
}
