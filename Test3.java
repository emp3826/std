public class Test3{
	public static void main(String[] args){
		int sum = 0;
		int sum2 = 0;
		int n = 1;
		while(n<=100){
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
		for(int i=1;i<=100;i++){
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}
}
