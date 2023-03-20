package Test;


public class Spectrum extends SpectrumTicketCreation {
	public static void main(String args[]) throws InterruptedException {
		SpectrumTicketCreation sc = new SpectrumTicketCreation();
		sc.login();
		sc.TicketCreation();
	}
}
