package com.sep;

import java.util.ArrayList;

public class Model {

    private static Model instance;

    private ArrayList<String> saidPhrases = new ArrayList<>();


    private Model() {
    }


    public static Model getInstance() {
        if (Model.instance == null)
            Model.instance = new Model();
        return Model.instance;
    }


    public boolean wasEverSaid(String message) {
        for (String phrase : saidPhrases) {
            if (phrase.toLowerCase().equals(message.toLowerCase())) {
                saidPhrases.add(message);
                return true;
            }
        }
        saidPhrases.add(message);
        return false;
    }
}