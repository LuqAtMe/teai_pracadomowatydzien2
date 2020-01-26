package home.application.week2taskshop.controller;

import home.application.week2taskshop.model.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShopController {

    private Basket basket;

    @Autowired
    public ShopController(Basket basket) {
        this.basket = basket;
    }

    @Value("${shop-info.vatValue}")
    private double vatValue; // VAT Value

    @Value("${shop-info.discountValue}")
    private double discountValue; //discount Value

// == method for console display

    public void getStartInfo() {
        System.out.println(basket.getShoppingList());
    }

    public void getPlusInfo() {
        System.out.printf("Gross amount: %.2f \n", grossCalculation());
        System.out.printf("VAT (%.2f%%) amount: %.2f \n", vatValue * 100, vatCalculation());
        System.out.printf("Net amount: %.2f \n", netCalculation());
    }

    public void getProInfo() {
        System.out.printf("=== DISCOUNT %s%% ===\n", discountValue * 100);
        System.out.printf("Discount(%.2f%%) amount: %.2f \n", discountValue * 100, discountCalculation());
        System.out.printf("Gross amount after discount: %.2f \n", (grossCalculation() - discountCalculation()));
        System.out.printf("Net amount: %.2f \n", ((grossCalculation() - discountCalculation()) * (1 - vatValue)));
    }


    private double grossCalculation() {
        double grossPrice = 0;
        for (int i = 0; i < basket.getShoppingList().size(); i++) {
            grossPrice += basket.getShoppingList().get(i).getPrice();
        }
        return grossPrice;
    }

    private double vatCalculation() {
        return grossCalculation() * vatValue;
    }

    private double netCalculation() {
        return grossCalculation() - vatCalculation();
    }

    private double discountCalculation() {
        return grossCalculation() * discountValue;
    }


}
