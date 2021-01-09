package unit5;
//2、编写一个方法，判断该年份是平年还是闰年。[必做题]
public class HomeWork2 {
	public void year(int year) {
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("闰年");
		}else {
			System.out.println("平年");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		HomeWork2 homeWork2=new HomeWork2();
		homeWork2.year(year);
	}

}
