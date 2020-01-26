package home.application.week2taskshop.service;

import home.application.week2taskshop.controller.ShopController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Start")
@Component
public class ShopStart implements Shop{

    ShopController shopController;

    @Autowired
    public ShopStart(ShopController shopController) {
        this.shopController = shopController;
    }

    @Override
    public void getInfo() {
        shopController.getStartInfo();

    }
}
