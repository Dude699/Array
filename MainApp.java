package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[10];
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <10; i++)  {
        	a[i] = sc.nextInt();
        	tong = tong + a[i];
        }
        System.out.println("Tong cua cac mang la :" + tong);
	}

}
