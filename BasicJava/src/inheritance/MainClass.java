package inheritance;

import abstractImplement.Collarable;

public class MainClass {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.speak();

		Dog d = new Dog();
		d.speak();
		d.fetch();

		Pet pd = new Dog();
		((Dog) pd).fetch();

		Pet[] pArr = new Pet[10];

		for (int i = 0; i < 5; i++) {
			Cat catTemp = new Cat("" + i);
			pArr[i] = catTemp;
		}

		for (int i = 5; i < 10; i++) {
			Dog dogTemp = new Dog("" + i);
			pArr[i] = dogTemp;
		}

		for (Pet p : pArr) {
			System.out.print(p + ", ");

			if (p instanceof Cat) {
				System.out.println("Cat");
			} else if(p instanceof Collarable){
				System.out.println(((Collarable) p).getCollarType());
			}
		}
	}
}
