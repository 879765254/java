package unit5;
//1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 [必做题]
public class HomeWork1 {
	public int factorial(int n) {
		int factorral=1;
		for(int i=1;i<=n;i++) {
			factorral*=i;
		}
		return factorral;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		HomeWork1 homeWork1=new HomeWork1();
		int factorial=homeWork1.factorial(n);
		System.out.println(factorial);

	}

}
