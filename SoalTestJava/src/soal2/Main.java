package soal2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Gasoline gasoline = new Gasoline();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan jenis BBM yang ingin dibeli: ");
		String gases = scan.nextLine();
		
		System.out.print("Masukkan jumlah liter: ");
		int liters = scan.nextInt();
		
		gasoline.gasolinePrice(gases, liters);
	}
}
