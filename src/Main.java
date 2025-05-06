import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String>nume = new ArrayList<String>();
        nume.add("Nenea");
        nume.add("Ion");
        nume.add("Dumniezo");
        nume.add("Bahoi");
        for(String num : nume){
            System.out.println(num);
        }//1

        nume.stream().filter(num -> num.length()>3).forEach(num -> System.out.println(num));//2


        int sum = nume.stream().mapToInt(num -> num.length()).sum();
        System.out.println("suma" + sum);

        String concatenated = nume.stream().map(num -> num.concat(num)).collect(Collectors.joining(", "));
        System.out.println(concatenated);

//        nume.stream().filter(num -> num.length()<5).forEach(num -> System.out.println(num)));
//        nume.stream().mapToInt(num -> num.length()).sum();
    }
}