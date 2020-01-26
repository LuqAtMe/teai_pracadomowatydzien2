package home.application.week2taskshop.service;

import home.application.week2taskshop.controller.ShopController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Pro")
@Component
public class ShopPro implements Shop{

    ShopController shopController;

    @Autowired
    public ShopPro(ShopController shopController) {
        this.shopController = shopController;
    }


    @Override
    public void getInfo() {
        shopController.getStartInfo();
        shopController.getPlusInfo();
        shopController.getProInfo();
    }
}
