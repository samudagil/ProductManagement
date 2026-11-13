package labs.pm.data;

import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
/**
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

public sealed abstract class Product implements Rateable <Product> permits Food, Drink {

	protected int id;
	private String name;
	private BigDecimal price;
	private Rating rating;
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	public Product(int id, String name, BigDecimal price, Rating rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	public Product(int id, String name, BigDecimal price) {
		this (id, name, price, Rating.NOT_RATED);
	}
	
	public abstract Product applayRating (Rating newRating);
		
	public Product() {
		this (0,"no name",BigDecimal.ZERO);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Product product) {
			return id == product.id && Objects.equals(name, product.name);			
		}
		return false;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * A constant that defines a
	 * {@link java.math.BigDecimal BigDecimal} value of the discount rate
	 * <br>
	 * Discount rate is 10%
	 */
	
	public BigDecimal getDiscount() {
		// Calculamos el descuento
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
	public Rating getRating() {
		return rating;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return id + ", "  + 
			name + ", " + 
			price + ", " +
			getDiscount() + ", " +
			rating.getStars() + ", " +
			getBestBefore();
	}
	public Product applyRating(Rating newRating) {
		return null;
	}
	
	/**
	 * Assumes that the best before date is today
	 * @return the current date
	 */
	public LocalDate getBestBefore() {
		return LocalDate.now();
	}

}
