package week3;

import java.util.*;
public class Vowelstream
{
    public static void main(String[] args)
    {
        String[] strArray = {"divya", "hello", "hi ", "dbc", "njk"};

        Arrays.stream(strArray)
                .filter(s -> s.matches(".[aeiouAEIOU]."))
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println(s + " (Number of vowels: " + vowelCount + ")");
                });

    }
}
