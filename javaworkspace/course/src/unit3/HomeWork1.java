package unit3;

//1、企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；高于20万，低于或等于40万时，高于20万元的部分，可提成5%；高于40万，低于或等于60万时，高于40万元的部分，可提成3%；高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，在程序中设定一个变量为当月利润，求应发放奖金总数？（知识点：条件语句） [必做题]
public class HomeWork1 {
	public static void main(String[] args) {
		double  profit=88;
		double bonus=0;
		if(profit<=10){
			bonus=profit*0.1;
		}else if(profit<=20){
			bonus=10*0.1+(profit-10)*0.075;
		}else if(profit<=40){
			bonus=10*0.1+10*0.075+(profit-20)*0.05;
		}else if(profit<=60){
			bonus=10*0.1+10*0.075+20*0.05+(profit-40)*0.03;
		}else if(profit<=100){
			bonus=10*0.1+10*0.075+20*0.05+20*0.03+(profit-60)*0.015;
		}else{
			bonus=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(profit-100)*0.01;
		}
		System.out.println(bonus);
	}
}
