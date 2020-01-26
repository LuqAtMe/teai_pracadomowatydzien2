package home.application.week2taskshop;

import home.application.week2taskshop.service.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopMainApplication {

    private Shop shop;

    @Autowired
    public ShopMainApplication(Shop shop) {
        this.shop = shop;
        shop.getInfo();
    }
}
