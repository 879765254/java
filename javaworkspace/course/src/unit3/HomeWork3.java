package unit3;
//3、假设某员工今年的年薪是30000元，年薪的年增长率6%。编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。（知识点：循环语句for）[选做题]
public class HomeWork3 {

	public static void main(String[] args) {
		double salary=10000;
		double sum=10000;
		for(int i=0;i<10;i++){
			salary=salary*(1+0.06);
			sum+=salary;
		}
		System.out.println(salary+","+sum);
	}

}
