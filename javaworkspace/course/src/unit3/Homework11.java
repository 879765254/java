package unit3;
//11、有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。（知识点：条件语句）[必做题]
public class Homework11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-4;
		if(num<0){
			System.out.println("不是正数");
		}else if(num/100000>0){
			System.out.println("大于五位数");
		}else if(num/10000>0){
			System.out.println("五位数");
			System.out.println(num/10000+":"+num%10000/1000+":"+num%1000/100+":"+num%100/10+":"+num%10);
		}else if(num/1000>0){
			System.out.println("四位数");
			System.out.println(num/1000+":"+num%1000/100+":"+num%100/10+":"+num%10);
		}else if(num/100>0){
			System.out.println("三位数");
			System.out.println(num/100+":"+num%100/10+":"+num%10);
		}else if(num/10>0){
			System.out.println("二位数");
			System.out.println(num/10+":"+num%10);
		}else if(num>0){
			System.out.println("个位数");
			System.out.println(num);
		}
		
	}

}
