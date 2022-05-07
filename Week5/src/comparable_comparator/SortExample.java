package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {

        ArrayList<Emp> emp = new ArrayList<>();
        emp.add(new Emp("Karan", "34", 85));
        emp.add(new Emp("Kanishk", "2452153", 65));
        emp.add(new Emp("Kunal", "14521621", 56));
        System.out.println(emp);
        Collections.sort(emp, new NameComparator());
        System.out.println(emp);
    }
}
