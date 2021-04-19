package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimaryViewModel {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void idleForInput() throws IOException {

        while (true) {
            System.out.println("What do you want me to say?");
            String saidPhrase = reader.readLine();
            if (saidPhrase.equals("")) {
                System.out.println("Well... If you want me to say nothing, then that's the way it is.");
                return;
            }
            boolean wasEverSaid = Model.getInstance().wasEverSaid(saidPhrase);

            if (wasEverSaid) {
                System.out.println("Nah! I already said that!");
            } else {
                System.out.println("Ok.. here you go: " + saidPhrase);
            }
        }
    }

}
