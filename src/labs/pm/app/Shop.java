/**
 * @author ${USER}
 * {@code Shop} class represents an application that manages Products
 * {@code Product} class represents properties and behaviors of
 * product objects in the Product Management System.
 * <br>
 * Each product has an id, name, and price
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link DISCOUNT_RATE discount rate}
 * @version 4.0
 * @author oracle
 * */

package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rateable;
import labs.pm.data.Rating;

public class Shop {
	
	public static void main (String [] arg) {
		ProductManager pm = new ProductManager();
		Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
//		Product p2 = pm.createProduct(102, "Coffe", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//		Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//		Product p4 = pm.createProduct(104, "Cookie", BigDecimal.valueOf(1.99), Rating.TWO_STAR);
		
		pm.printProductReport();
		p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Ta bueno");
		pm.printProductReport();
		
		
		
//		Product p1 = new Drink(101,"Tea",BigDecimal.valueOf(1.99), Rating.FIVE_STAR);
//		Product p2 = new Drink(102,"Coffee",BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//		Product p3 = new Food(103,"Cake",BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//		Product p4 = new Food(105, "Cookie", BigDecimal.valueOf(3.99),Rating.FOUR_STAR, LocalDate.now());
//		Product p6 = new Drink(104,"Chocolate",BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//		Product p7 = new Food(104,"Chocolate",BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//		Product p8 = p4.applayRating(Rating.FIVE_STAR);
//		Product p9 = p4.applayRating(Rating.FIVE_STAR);

//		
//	System.out.println(p6.equals(p7));
//	System.out.println("p8 " + p8);
//	System.out.println("p9 " + p9);
//	
//	if (p3 instanceof Food f) {
//		System.out.println(f.getBestBefore());
//	}
//
//	if (p3 instanceof Food ) {
//		System.out.println(((Food)p3).getBestBefore());
//	}
//
//	System.out.println(p1.getBestBefore());
//	System.out.println(p3.getBestBefore());
//		p3 = null;
//		p4 = null;
	
//		p1.setId(101);
//		p1.setName("Tea");
//		p1.setPrice(BigDecimal.valueOf(1.99));
		
		
//		System.out.println(p1.getId() + " " + p1.getName()
//					+ " " + p1.getPrice() + " " + p1.getDiscount()
//					+ " " + p1.getRating().getStars());
//		
//		System.out.println(p2.getId() + " " + p2.getName()
//		+ " " + p2.getPrice() + " " + p2.getDiscount()
//		+ " " + p2.getRating().getStars());
//
//		System.out.println(p3.getId() + " " + p3.getName()
//		+ " " + p3.getPrice() + " " + p3.getDiscount()
//		+ " " + p3.getRating().getStars());
//		
//		System.out.println(p4.getId() + " " + p4.getName()
//		+ " " + p4.getPrice() + " " + p4.getDiscount()
//		+ " " + p4.getRating().getStars());
//		
//		System.out.println(p5);
		
		System.out.println("-------------");
//		List<Product> listProducts = List.of(p1, p2, p3, p4, p5);
//		System.out.println(Product.DISCOUNT_RATE);
	//	System.out.println(p3.getBestBifore());
	
//		for (Product p:listProducts) {
//			System.out.println(p);
//			//System.out.println(e.ordinal() + " " + e.toString() + " " + e.getStars());
//		}
		var numbers = new Product[6];
		int [][][] numbers3d = new int [][][]
			{
				{
					{1,2,3},
					{10,20,50,80},
					{1000,2000}
				},{
					{11,22,33},
					{0}
				},{
					{777,888}
				}
		};
		System.out.println(numbers3d[2][0][1]);
		System.out.println(Arrays.toString(numbers));
		
	}
	
}
