package sec03;

interface Portable {
	void inMyBag();
}

public class Notebook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("≥Î∆Æ∫œ¿∫ ∞°πÊø° ¿÷¥Ÿ.");
	}

	public void turnOn() {
		System.out.println("≥Î∆Æ∫œ¿ª ƒ“¥Ÿ.");
	}

	public void turnOff() {
		System.out.println("≥Î∆Æ∫œ¿ª ≤ˆ¥Ÿ.");
	}

	public static void main(String[] args) {
		Controllable.reset();

		Notebook n = new Notebook();
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();

		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}