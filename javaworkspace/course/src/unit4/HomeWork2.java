package unit4;
//2、将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中。（知识点：数组复制） [必做题]
public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="neusofteducation";
		char[] srcArray = new char[20];
		char[] destArray=new char[20];
		for(int i=0;i<str.length();i++) {
			srcArray[i]=str.charAt(i);
		}
		System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
		for(int i=0;i<destArray.length;i++) {
			System.out.println(destArray[i]);
		}
	}

}
