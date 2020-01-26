package home.application.week2taskshop.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ArticleNames {

    private ArrayList<String> articlesNames = new ArrayList<String>();
    private String[] names = new String[]{"BUTTER", "COCA_COLA", "SPRITE", "ORANGES", "KIWI", "WATER", "CHEESE", "HAM", "POTATO", "TOMATO"};


    public ArrayList<String> getArticlesNames() {
        articlesNames.addAll(Arrays.asList(names));
        return articlesNames;
    }

}
