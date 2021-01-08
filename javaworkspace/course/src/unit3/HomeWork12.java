package unit3;
//12、编写一个程序，计算邮局汇款的汇费。如果汇款金额小于100元，汇费为一元，如果金额在100元与5000元之间，按1%收取汇费，如果金额大于5000元，汇费为50元。汇款金额由命令行输入。（知识点：条件语句） [选做题]
public class HomeWork12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double remittance=2222;
		double remittanceFee=0;
		if(remittance<100){
			remittanceFee=1;
		}else if(remittance>=100&&remittance<=5000){
			remittanceFee=remittance*0.01;
		}else{
			remittanceFee=50;
		}
		
		System.out.println(remittanceFee);
		
	}

}
