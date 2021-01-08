package unit3;

//2、给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch）

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 59;
		char level = 0;
		switch (a / 10) {
		case 10:
			level = 'A';
			break;
		case 9:
			level = 'A';
			break;
		case 8:
			level = 'B';
			break;
		case 7:
			level = 'C';
			break;
		case 6:
			level = 'D';
			break;
		case 5:
			level = 'E';
			break;
		default:
			System.out.println("无评级");
			break;
		}
		System.out.println(level);
	}

}
