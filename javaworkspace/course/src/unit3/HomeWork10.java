package unit3;
//10、输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句） [必做题]

public class HomeWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		int y=6;
		int z=3;
		int temp=0;
		if(x>y){
			temp=x;
			x=y;
			y=temp;
			System.out.println("a");
		}
		if(y>z){
			temp=y;
			y=z;
			z=temp;
			System.out.println("b");
		}
		if(x>y){
			temp=x;
			x=y;
			y=temp;
			System.out.println("c");
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
