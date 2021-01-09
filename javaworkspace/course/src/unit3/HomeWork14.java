package unit3;
//14、输出0-9之间的数，但是不包括5。 [选做题]
public class HomeWork14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ran=(int) (Math.random()*10);
		while(ran==5) {
			ran=(int) (Math.random()*10);
		}
		System.out.println(ran);
	}

}
