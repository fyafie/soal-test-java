package soal1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SecondToMinute convert = new SecondToMinute();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jumlah detik = ");
		int x = scan.nextInt();
		convert.secondToMinute(x);
	}
}
