import java.util.Scanner;
public class TEST{

	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);

		while(scan.hasNextInt()){

			int num =scan.nextInt();
			System.out.println(num);
		}
		


	}


	public static void main5(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			int ret = 1;
			for(int j=1;j<=i;j++)
			{
				ret*=j;
				
			}
			sum+=ret;
		}

		System.out.println(sum);

		scan.close();
	}

	// public static void main4(String[] args){

	// 	Scanner sc = new Scanner(System.in);
	// 	int num =sc.nextInt();

	// 	while(num<=100){
	// 		if(num%5==0) {

	// 			System.out.println(num);
	// 			break;
	// 		}
	// 		System.out.println("hhh");
	// 		num++;

	// 	}

	// }

	public static void main3(String[] args){
		Scanner scan  = new Scanner(System.in);
		// int a =scan.nextInt();
		// System.out.println(a);

		// String s=scan.nextLine();
		// System.out.println(s);
		while(scan.hasNext()){
		int year = scan.nextInt();
		if((year%4==0 && year%100!=0 )|| (year%400==0)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		}

	}
	public static void main2(String[] args){
	
		// System.out.println("hello");
		// System.out.println(5/2);
		// System.out.println(5.0/2);
		// System.out.println((float)5/2);
		// System.out.println((float)(5/2));

		// int a=10;
		// int a = 10;
		// int b = ++a;
		// System.out.println(b);
		// int c = a++;
		
		boolean c=false;
		System.out.println(!c);

	}

	public static void main1(String[] args){
	
		// System.out.println("hello");
		// System.out.println(5/2);
		// System.out.println(5.0/2);
		// System.out.println((float)5/2);
		// System.out.println((float)(5/2));

	}
		// }
		// }
}