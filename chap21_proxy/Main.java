package chap21_proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = new PrinterProxy("Alice");
		System.out.println("Current : " + p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println("Current : " + p.getPrinterName());
		p.print("Hello, World");
		p.setPrinterName("Charlie");
		System.out.println("Current : " + p.getPrinterName());
		p.print("Welcome");
	}

}
