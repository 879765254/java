package unit3;
//6、编写程序， 判断一个变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是 10，输出x=10，除了以上几个值，都输出x=none。（知识点：条件语句） [必做题]

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		if(x==1){
			System.out.println("x=1");
		}else if(x==5){
			System.out.println("x=5");
		}else if(x==10){
			System.out.println("x=10");
		}else{
			System.out.println("x=none");
		}
	}

}
