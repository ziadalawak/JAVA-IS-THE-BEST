package filterK;

/**
 * @author Ziad Alawak
 **/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zre {

	public static void main(String[] args) {
		System.out.println("Welcome to Alawak Shop");
		List<produkt> list = new ArrayList<produkt>();
		list.add(new produkt(1, "IPhone 11 Pro Max", 1100.55));
		list.add(new produkt(2, "IPhone 13 ", 1199.99));
		list.add(new produkt(3, "IPhone 14 Plus ", 999.99));
		list.add(new produkt(4, "IPhone 14 Pro", 1600.99));
		list.add(new produkt(5, "IPhone 14 Pro Max", 2000.99));
		list.add(new produkt(6, "Samsung Galaxy A33 5G", 269.00));
		list.add(new produkt(7, "Samsung Galaxy A13 4 GB RAM", 171.53));
		list.add(new produkt(8, "Samsung Galaxy S23 256 GB", 1000.09));
		System.out.println("please select number: 1 to find IPhone Pro \n"
				+ "	      number 2 to get mobiles at a price less than 1000 €   \n" + "	      number 3 to get IPHONE \n"
				+ "              number 4 to get Samsung");

		while (true) {
			int enter = new Scanner(System.in).nextInt();
			switch (enter) {
			case 1: {
				list.stream().filter(t -> t.name.contains("Pro")).forEach(System.out::println);
				break;
			}
			case 2: {
				list.stream().filter(produkt -> produkt.preis > 1000).forEach(System.out::println);
				break;
			}
			case 3: {
				list.stream().filter(f -> f.name.startsWith("IPhone")).forEach(System.out::println);
				break;
			}
			case 4: {
				list.stream().filter(f -> f.name.contains("Samsung")).forEach(System.out::println);
				break;
			}
			default:
				System.err.println("Your entry is incorrect");
			}

		}
	}

}

class produkt {

	int number;
	String name;
	double preis;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public produkt(int number, String name, double preis) {
		this.number = number;
		this.name = name;
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "produkt :[{ID=" + number + "}" + ", {name=" + name + "}" + ", { preis=" + preis + "€" + "}" + "]";
	}

}
