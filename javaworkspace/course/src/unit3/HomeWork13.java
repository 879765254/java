package unit3;
//13、分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。（知识点：循环语句） [选做题]
public class HomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do{
			if(i%3==0){
				sum+=i;
			}
			i++;
		}while(i<101);
//		while(i<101){
//			if(i%3==0){
//				sum+=i;
//			}
//			i++;
//		}
//		for(int i=1;i<101;i++){
//			if(i%3==0){
//				sum+=i;
//			}
//		}
		System.out.println(sum);

	}

}
