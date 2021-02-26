package pak.test;

public class InterfaceTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
	}
}

interface FoodMenu {
	void salad();
	void chips();
	void dumplings();
}

class Customer {
	// Customer���õ���Menu�ӿ�
	// ��ֱ�ӵ���EasternCook��WesternCook ����������֮�����϶�
	// EasternCook ec;
	// WesternCook wc;
	FoodMenu menu;
	
	
	public void order(FoodMenu menu) {
		System.out.println();
		
	}
}

class EasternCook implements FoodMenu {
	@Override
	public void salad() {
		System.out.println("Salad prepared by eastern cook.");
	}

	@Override
	public void chips() {
		System.out.println("Chips prepared by eastern cook.");
	}

	@Override
	public void dumplings() {
		System.out.println("Dumplings prepared by eastern cook.");
	}
}

class WesternCook implements FoodMenu {
	@Override
	public void salad() {
		System.out.println("Salad prepared by western cook.");
	}

	@Override
	public void chips() {
		System.out.println("Chips prepared by western cook.");
	}

	@Override
	public void dumplings() {
		System.out.println("Dumplings prepared by western cook.");
	}
}