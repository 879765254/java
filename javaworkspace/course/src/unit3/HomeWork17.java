package unit3;
//17、由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321 [选做题]
public class HomeWork17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1023;
		int thousand=num/1000;
		int hundred=num%1000/100;
		int ten=num%100/10;
		int bits=num%10;
		System.out.println(bits*1000+ten*100+hundred*10+thousand);
	}

}
