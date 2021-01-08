package unit3;
//9、输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E（知识点：条件语句if elseif） [必做题]
public class HomeWork9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		if(num<0||num>100){
			System.out.println("打印分数无效");
		}else if(num>=80&&num<=100){
			System.out.println("A");
		}else if(num>=60&&num<80){
			System.out.println("B");
		}else if(num>=40&&num<60){
			System.out.println("C");
		}else if(num>=20&&num<40){
			System.out.println("D");
		}else if(num>=0&&num<20){
			System.out.println("A");
		}
	}

}
