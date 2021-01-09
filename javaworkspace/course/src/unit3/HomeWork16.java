package unit3;


//16、编写一个程序，找出大于200的最小的质数[选做题]
public class HomeWork16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=201;;i++) {
			inner:for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					
					break inner;
				}
				if(j==i/2-1) {
					System.out.println(i);
					break outer;
				}
			}
		}

	}

}
