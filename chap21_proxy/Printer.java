package chap21_proxy;

public class Printer implements Printable {
	private String name;
	
	public Printer() {
		heavyJob("Printer�� �ν��Ͻ� ������");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer�� �ν��Ͻ� " + name + " �� ������");
	}
	

    private void heavyJob(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(".");
		}
		System.out.println("�Ϸ�");
	}


	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.println("====" + str + "====");
		System.out.println(str);
	}

}
