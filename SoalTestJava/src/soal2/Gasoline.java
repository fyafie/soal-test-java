package soal2;

public class Gasoline {
	private int price;
	private int finalPrice;
	public void gasolinePrice(String gas, int liter) {
		switch (gas) {
		case "Premium":
			this.price = 6450;
			if (liter>10) {
				this.finalPrice = 10 * price;
				System.out.println("Maaf, jumlah pembelian maksimal BBM Premium adalah 10 liter");
				System.out.println("Jumlah yang harus dibayar Rp. "+finalPrice);
			}else {
				this.finalPrice = liter * price;
				System.out.println("Jumlah yang harus dibayar Rp. "+finalPrice);
			}
			break;

		case "Pertalite":
			this.price = 7650;
			this.finalPrice = liter * price;
			System.out.println("Jumlah yang harus dibayar Rp. "+finalPrice);
			break;
		
		case "Pertamax":
			this.price = 9000;
			this.finalPrice = liter * price;
			System.out.println("Jumlah yang harus dibayar Rp. "+finalPrice);
			break;
			
		default:
			System.out.println("PILIHAN SALAH");
			System.out.println("pilihan bahan bakar:");
			System.out.println();
			System.out.println("Pertamax");
			System.out.println("Pertalite");
			System.out.println("Premium");
			break;
		}
	}
}
