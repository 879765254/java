package unit5;

//3、编写一个方法，输出大于200的最小的质数。[选做题]
public class HomeWork3 {
	public int primeNumbers(int num) {
		int primeNumber = 0;

		outer: for (int i = num + 1;; i++) {
			inner: for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					break inner;
				}
				if (j == i - 1) {
					primeNumber = i;
					break outer;
				}
			}

		}
	
	return primeNumber;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 200;
		HomeWork3 homeWork3 = new HomeWork3();
		System.out.println(homeWork3.primeNumbers(num));
	}

}
