import java.util.*;
import java.util.stream.Collectors;

class op {

    public static int compare(Integer a, Integer b) { // example of static method reference
        return Integer.compare(a, b);
    }
}

class op1 {
    public void show(String n) { ///instance method reference
        System.out.println(n + " Mugiwara crew");
    }
}

public class Onepiece2 {
    public static void main(String[] args) {

        // ------------------------------Static method
        // referenece------------------------------------

        // List<Integer> b = Arrays.asList(320, 150, 900);
        // List<Integer> a = b.stream()
        // .sorted(op::compare) ////Static method referenece
        // .collect(Collectors.toList());

        // System.out.print(a);

        // -----------------------------Instance method
        // reference-------------------------------------
        // op1 o = new op1();
        // List<String> crew = Arrays.asList("Zoro", "Sanji", "Nami", "Usoppp");
        // List<String> c = crew.stream()
        //         .sorted((String::compareTo))
        //         .collect(Collectors.toList());

        // c.forEach(o::show);


    
    }

}
