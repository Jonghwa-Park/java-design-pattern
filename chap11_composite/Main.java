package chap11_composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Making root entries");
			Directory root = new Directory("root");
			Directory bin = new Directory("bin");
			Directory tmp = new Directory("tmp");
			Directory usr = new Directory("usr");
			
			root.add(bin);
			root.add(tmp);
			root.add(usr);
			
			bin.add(new File("vi", 10000));
			bin.add(new File("latex", 20000));
			root.printList();
			System.out.println();
			
			System.out.println("Making usr entries");
			Directory kim = new Directory("kim");
			Directory lee = new Directory("lee");
			Directory park = new Directory("Park");
			usr.add(kim);
			usr.add(lee);
			usr.add(park);
			
			kim.add(new File("diary.html",100));
			kim.add(new File("끝내주는거.avi", 1024));
			lee.add(new File("study.pptx", 800));
			park.add(new File("Test.java", 2));
			park.add(new File("SamsungSDSIR.pptx", 2345));
			root.printList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
