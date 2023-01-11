package soal1;

public class SecondToMinute {
	public void secondToMinute(int second) {
		int minute = (second-(second%60))/60;
		int minuteSecond = second-(minute*60);
		System.out.println(second +" detik sama dengan "+minute+" menit "+minuteSecond+" detik ");
	}
}
