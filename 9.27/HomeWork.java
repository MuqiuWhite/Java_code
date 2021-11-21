import java.util.*;
public class HomeWork{
	pbulic static void main(String[] args){

		System.out.println(i+"*"+ j + "=" +i*j+" ");


	}
	public static void main2(String[] args){
		Scanner scan= new Scanner(System.in);

		int n=scan.nextInt();

		for(int i=2;i<=Math.sqrt(n);i++){

			if(n%i==0){
				System.out.println(n+"不是");
				break;
			}
		}
		if(i>n/2)
		
		
	}
	public static void main1(String[] args){
		Scanner scan =new Scaner(System.in);

		int n=scan.nextInt();
	}
	public static void main1(String[] args){
		Scanner scan =new Scanner(System.in);

		Random random=new Random();
		int randNum =random.nextInt(100);

		//System.out.println(randNum);

		while(true){
			System.out.println("数字：");
			int n=scan.nextInt();
			if(n<randNum){

				System.out.println("小");
			}else if(n>randNum){

				System.out.println("大");
			}else{
				System.out.println("对了");
				break;
			}

		}
		
	}	


}