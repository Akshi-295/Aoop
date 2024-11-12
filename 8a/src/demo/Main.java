package demo;
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana", "pear");

        // Sort in descending order using lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println(strings);
    }
}
