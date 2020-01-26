package home.application.week2taskshop.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Basket {
    // == fields, constants ==

    private ArrayList<Article> shoppingList;
    private Random random = new Random();

    // == constructor ==
    public Basket() {
        this.shoppingList = new ArrayList<Article>();
        for (int i = 1; i<=5; i++){
            ArticleNames articleNames = new ArticleNames();
            int index = random.nextInt(articleNames.getArticlesNames().size());
            Article article = new Article(articleNames.getArticlesNames().get(index), randomPrice());
            shoppingList.add(article);
        }
    }

    // == private methods ==

    private int randomPrice() {
        int lowestPrice = 50;
        int highestPrice = 300;
        return random.nextInt(highestPrice - lowestPrice) + lowestPrice;
    }

    public List<Article> getBasket() {
        return this.shoppingList;
    }

}
