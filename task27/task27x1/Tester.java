package task27x1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet();
        s.add(50);
        s.add(11);
        s.add(25);
        s.add(3);
        s.add(79);
        Set<String> treeSet = new TreeSet(s);
        System.out.println(treeSet);
    }
}
