package training1;

public class PalindromNumber {
	public static boolean palinNum(int num) {
		int num1 = num;//121
		int sum=0;
		while(num>0) {
			int lastNum =num%10;//1    2
			sum = (sum*10)+lastNum;//0+1=1   +2
			num =num/10;//12
		}
		return num1 == sum;
	}

}
