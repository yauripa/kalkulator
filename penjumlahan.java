import java.io.*;
import java.util.Scanner;

public class penjumlahan{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print(" | Masukkan bilangan pertama	: ");
		a = in.nextInt();
		System.out.print(" | Masukkan bilangan kedua	: ");
		b = in.nextInt();
		int j=a+b;
		System.out.print(" | Jumlah	: "+j);
	}
}