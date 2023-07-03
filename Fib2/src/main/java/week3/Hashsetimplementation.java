package main.java.week3;
import java.util.HashSet;
import java.util.stream.Collectors;
public class Hashsetimplementation {

        public static void main(String[] args)
        {
            String name="Divyaie";
            HashSet<Character> set = name.chars().mapToObj(e->(char) e).collect(Collectors.toCollection(HashSet::new));
            System.out.println(set);
        }
}
