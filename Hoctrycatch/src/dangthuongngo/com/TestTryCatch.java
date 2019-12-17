package dangthuongngo.com;

import java.util.Scanner;



public class TestTryCatch {
/*
 * Đây là hàm kiểm tra sô nguyên tố
 * 
 * 
 */
	
	public static void main(String[] args) 
	{
		try {
			int x;
			System.out.println("nhạp x");
			x=new Scanner(System.in).nextInt();
			if (isPrime(x)) 
				System.out.println(x+"là số nguyên tố");					
			else 
				System.out.println(x+" không là số nguyên tố");
		} catch (Exception ex) {
			// TODO: handle exception
			//ex.printStackTrace();
			System.err.println("Nhập bậy quá");
		}
		
				
	}
	
	public static boolean isPrime(int x)
	{
		int dem=0;
		for (int i = 1; i <= x; i++) 
		{
			if (x%i==0) 
				dem++;								
		}
		return dem==2;
	}
}
