package pak.test;

public class InterfaceTest {
	public static void main(String[] args) {
		// create cook object
		FoodMenu cook1 = new EasternCook();  // �ӿ��޷�new,ֻ��new�ӿڵ�ʵ����(��̬)
		// create customer object
		Customer customer1 = new Customer(cook1); // customer�г�Ա����FoodMenu,��ʵ�ʵ�cook1����ȥ����
		// the customer taking order
		customer1.order();
	}
}

interface FoodMenu {
	void salad();
	void chips();
	void dumplings();
}

class Customer {
	// Customer���õ���FoodMenu�ӿ�
	// EasternCook��WesternCook��FoodMenu�ӿڵ�ʵ����
	// ��ֱ�ӵ���ʵ���࣬�Խ��ʹ�����϶�
	// EasternCook ec;
	// WesternCook wc;
	private FoodMenu menu; //���ɷ�װ��ϰ��,ͬʱҪ�ṩ���ʺ��޸ķ���
	
	// constructor
	public Customer() {
	}
	
	// �������Ҫ�д������Ĺ��췽��,Ŀ���Ǹ�menu��һ��ֵ
	public Customer(FoodMenu menu) {
		this.menu = menu;
	}
	
	// setter and visitor
	public void setFoodMenu(FoodMenu menu) {
		this.menu = menu;
	}
	
	public FoodMenu getFoodMenu() {
		return menu;
	}
	
	public void order() {
		FoodMenu menu = this.getFoodMenu(); //����ڲ�Ҳ����ֱ�ӷ���
		menu.dumplings();  // ���û�д��������췽���Ļ�,��Ա����menu�ǿյ�,�������ֿ�ָ���쳣����
		menu.chips();
		menu.salad();
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