package home.application.week2taskshop.service;

import home.application.week2taskshop.controller.ShopController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Plus")
@Component
public class ShopPlus implements Shop{

    ShopController shopController;

    @Autowired
    public ShopPlus(ShopController shopController) {
        this.shopController = shopController;
    }

    @Override
    public void getInfo() {
        shopController.getStartInfo();
        shopController.getPlusInfo();
    }
}
