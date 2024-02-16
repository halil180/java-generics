import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Printer<Dog> printer = new Printer<>(new Dog("lol",12));

        printer.print();

        Printer<Cat> printer2 = new Printer<>(new Cat("kitty",23));

        printer2.print();

        shout("Halil");
        shout(12);


        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

    }
    private static <T> void shout(T thingToShout){
        System.out.println(thingToShout);
    }
    private static void printList(List<?> myList){
        System.out.println(myList);

    }

}
