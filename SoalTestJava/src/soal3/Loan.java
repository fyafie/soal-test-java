package soal3;

public class Loan {
	public void loanShark(double loan,int installment) {
		for (int i = 0; i < installment; i++) {
			loan = loan + (loan*0.1);
		}
		System.out.println("Pinjaman yang harus dibayar setelah jatuh tempo: "+Math.round(loan));
		
	}
}
