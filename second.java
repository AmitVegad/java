import java.util.*;
public class second
{
	public static void main(String[] args, Scanner scanner2) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
		scanner.close();
	}
}