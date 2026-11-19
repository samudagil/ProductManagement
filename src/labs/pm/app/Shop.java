/*
 * Copyright (c) 2026.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 */

package labs.pm.app;

import labs.pm.data.*;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * {@code Shop} class represents am aplication that ,anages Products
 * @version 4.0
 * @author oracle
 **/
public class Shop {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager("es-ES");

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);


        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Meh");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "No esta tan bueno");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Is the best hot cup of tea i drink in all my life");
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Not bad");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Really good");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee",
                BigDecimal.valueOf(1.79), Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is the milk?!");
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR,
                "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Cake",
                BigDecimal.valueOf(3.99), Rating.NOT_RATED,
                LocalDate.now().plusDays(2));
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "Very nice cake");
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR,
                "Good, but I've expected more chocolate");
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "This cake is perfect!");
        pm.printProductReport(p3);

        Product p4 = pm.createProduct(104, "Cookie",
                BigDecimal.valueOf(2.99), Rating.NOT_RATED,
                LocalDate.now());
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "Just another cookie");
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "Ok");
        pm.printProductReport(p4);

        Product p5 = pm.createProduct(105, "Hot Chocolate",
                BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "Tasty!");
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "No bad at all");
        pm.printProductReport(p5);

        Product p6 = pm.createProduct(106, "Chocolate",
                BigDecimal.valueOf(2.50), Rating.NOT_RATED,
                LocalDate.now().plusDays(3));
        p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too sweet");
        p6 = pm.reviewProduct(p6, Rating.THREE_STAR, "Better then cookie");
        p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too bitter");
        p6 = pm.reviewProduct(p6, Rating.ONE_STAR, "I don't get it!");
        pm.printProductReport(p6);

//        for (Product p: pm.products.keySet()){
//            System.out.println("Reseñas de " + p);
//            for (Review r : pm.products.get(p)){
//                System.out.println("\t" + r);
//            }
//
//        }
//        pm.printProducts((pr1,pr2)->
//                        pr1.getRating().ordinal() -
//                        pr2.getRating().ordinal());

        Comparator<Product> priceSorter = (pr1, pr2)->
                                            pr2.getPrice().compareTo(pr1.getPrice());
        Comparator<Product> ratingSorter = (pr1,pr2)->
                        pr2.getRating().ordinal() -
                        pr1.getRating().ordinal();
        pm.printProducts(p -> p.getPrice().floatValue() < 3,
                priceSorter);
        pm.printProducts(p -> p.getPrice().floatValue() < 2,
                ratingSorter.thenComparing(priceSorter).reversed());
    }

}