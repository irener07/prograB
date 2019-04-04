/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ronaldo
 */
public class Password {

    private static final String numbers = "1234567890";
    private static final String capitalLetters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private static final String lowersLetters = "abcdefghijklmnñopqrstuvwxxyz";
    private static final String specialLetters = "!#$?@^~";
    private static int size = ThreadLocalRandom.current().nextInt(8, 13);

    public static String getPassword() {
        size = ThreadLocalRandom.current().nextInt(8, 13);
        String password = "";
        String key = numbers + capitalLetters + lowersLetters + specialLetters;
        for (int i = 0; i < size; i++) {
            password += (key.charAt((int) (Math.random() * key.length())));
        }
        return password;
    }

}

