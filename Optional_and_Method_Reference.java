import java.util.Optional;

public class onepiece {

    public static void main(String[] args) {

        String b = null;
        Optional<String> o = Optional.ofNullable(b); // it will check whether our
        data has value or null to avoid
        // nummpointerexception

        if (o.isPresent()) {
        System.out.println("Bounty present");
        } else {
        System.out.println("Bounty not present");
        }

        -------------------------notes----------------------
        Optional.of(value) → Only use when you're sure value is not null.

        Optional.ofNullable(value) → Safer way, allows null values too.

        Optional.empty() → Creates an empty Optional.

        Optional<String> devilFruit = Optional.ofNullable("Lazy");

        System.out.println(devilFruit.orElse("No Devil Fruit"));
        System.out.println(devilFruit.orElseGet(() -> "Fetch from fridge"));
        System.out.println(devilFruit.orElseThrow(() -> new RuntimeException("Fruit
        not found")));

        ------------------Notes-----------------------------
        orElse Always returns default even if value is present
        orElseGet Only calls supplier if value is absent (lazy)
        orElseThrow Throws exception if value is absent

        -----------------MAP AND FILTER IN OPTIONAL --------------------------

        Optional<String> a = Optional.ofNullable("Cook");
        String h = a.map(n -> n.toUpperCase()).orElse("Not there"); // its short form of if clause lambd
        boolean y = a.filter(n -> n.equals("Cook")).isPresent();
        System.out.println(h);
        System.out.println(y);
    }

}
____________________________________________________________________________________________________________________________________________________________________________________
    
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

        ------------------------------Static method referenece------------------------------------

        List<Integer> b = Arrays.asList(320, 150, 900);
        List<Integer> a = b.stream()
        .sorted(op::compare) ////Static method referenece
        .collect(Collectors.toList());

        System.out.print(a);

        -----------------------------Instance method reference-------------------------------------
        op1 o = new op1();
        List<String> crew = Arrays.asList("Zoro", "Sanji", "Nami", "Usoppp");
        List<String> c = crew.stream()
                .sorted((String::compareTo))
                .collect(Collectors.toList());

        c.forEach(o::show);


    
    }

}
