package chap18_memento;

import chap18_memento.game.Gamer;
import chap18_memento.game.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(100);
		Memento m = gamer.createMemento();
		for (int i = 0; i < 100; i++) {
			System.out.println("====" + i);
			System.out.println("현상:" + gamer);
			
			gamer.bet();
			
			System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");
			
			//증가했으므로 Save
			if(gamer.getMoney() > m.getMoney()) {
				System.out.println("Save Memento snapshot");
				m = gamer.createMemento();
			}else if(gamer.getMoney() < m.getMoney()) {
				System.out.println("Restore before snapshot");
				gamer.restoreMemento(m);
			}
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println();
		}
	}

}
