package chap18_memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<>();
	
	private Random rand = new Random();
	private static String[] fruitsName = {
			"사과", "포도", "바나나", "귤"
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = rand.nextInt(6) + 1;
		if (dice == 1) {
			money += 100;
			System.out.println("소지금이 100 증가 하였습니다.");
		}else if(dice == 2) {
			money /= 2;
			System.out.println("소지금이 절반이 되었습니다.");
		}else if(dice == 6) {
			String f = getFruit();
			System.out.println("과일(" + f + ")를 받았습니다");
			fruits.add(f);
		}else {
			System.out.println("변한것은 없습니다.");
		}
	}
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String f = it.next();
			if(f.startsWith("맛있는 ")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	public void restoreMemento(Memento m) {
		this.money = m.money;
		this.fruits = m.getFruits();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Money = " + money + ", Fruits : " + fruits + "]";
	}

	private String getFruit() {
		// TODO Auto-generated method stub
		String prefix = "";
		if (rand.nextBoolean()) {
			prefix = "맛있는 ";
		}
		
		return prefix + fruitsName[rand.nextInt(fruitsName.length)];
	}
}
