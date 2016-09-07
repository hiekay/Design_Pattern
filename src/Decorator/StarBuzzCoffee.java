package Decorator;

import java.util.HashSet;
import java.util.Set;

/**
 * ²âÊÔÀà
 * @author LIn
 *
 */
public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());
		
		/*Ë«±¶Ä¦¿¨ÄÌÅİ×ÛºÏ¿§·È*/
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());
		
		/*¶¹½¬Ä¦¿¨ÄÌÅİ×ÛºÏ¿§·È*/
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());

	}

}
