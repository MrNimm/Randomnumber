package com.maxwell;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Generate with math.random
        int number1 = (int)(Math.random() * 5) + 5;
    // Utilize timeMillis
        int number2 = (int)(System.currentTimeMillis());
    // Output info
        System.out.println(2 * number1 + number2);

    }
}
