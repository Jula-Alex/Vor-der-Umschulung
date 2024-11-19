package overloadedConstructors;

public class MainOverloadedConstructors {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("integrale", "pomodoro", "mozzarella", "prosciutto");
		Pizza pizza2 = new Pizza("5 cererali");
		Pizza pizza3 = new Pizza("normale", "pomodoro", "mozzarella");
	}

}
