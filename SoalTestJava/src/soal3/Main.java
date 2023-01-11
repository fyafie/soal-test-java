package soal3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Loan hutang = new Loan();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jumlah pinjaman: ");
		double pinjaman = scan.nextDouble();
		System.out.print("Masukkan jangka waktu peminjaman (dalam bulan): ");
		int durasi = scan.nextInt();
		hutang.loanShark(pinjaman, durasi);
	}
}
