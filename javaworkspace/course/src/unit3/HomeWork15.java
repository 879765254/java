package unit3;
//15、编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5 [选做题]
public class HomeWork15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		int n=5;
		for(int i=1;i<n+1;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
