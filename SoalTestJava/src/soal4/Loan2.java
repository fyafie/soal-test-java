package soal4;

import java.util.Scanner;

public class Loan2 {
	public void loanShark(double loan, int installment) {
		int counter = 1;
		Scanner scan = new Scanner(System.in);
		boolean condition;
		do {
			if (installment<=0) {
				break;
			}else {
				installment--;
			}
			System.out.print("Bulan ke "+counter+", apakah peminjam masih hidup? ");
			condition = scan.nextBoolean();
			loan = loan + (loan*0.1);
			counter++;
		} while (condition);
		if (installment<=0) {
			System.out.println("Pinjaman yang harus dibayar setelah jatuh tempo: "+Math.round(loan));
		}else {
			System.out.println("Pinjaman yang harus dibayar oleh ahli waris: "+Math.round(loan));
		}
		
		
	}
}
