
public class Main {

	public static void main(String[] args) {
		System.out.print("何分か入力してください：");
		//分を表現するために、minuteを使用
		int minute = new java.util.Scanner(System.in).nextInt();
		System.out.print(minute + "分は秒に直すと、");
		System.out.print(minute * 60);
		System.out.println("秒である。");

		System.out.print("何分か入力してください：");
		//分を表現するために、minute1を使用
		int minute1 = new java.util.Scanner(System.in).nextInt();
		System.out.println(minute1 + "分");
		System.out.print("何秒か入力してください：");
		//秒を表現するために、secondを使用
		int second = new java.util.Scanner(System.in).nextInt();
		System.out.println(second + "秒");
		System.out.print(minute1 + "分" + second + "秒は、");
		System.out.println(minute * 60 + second + "秒である。");

	}

}

