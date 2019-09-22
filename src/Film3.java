import java.util.LinkedList;
import java.util.Random;

public class Film3 {

    private static String namePrisoner() {
        Random rand = new Random();
        return Long.toString(Math.abs(rand.nextLong() % 3656158440062976L), 36);
    }

    static class Person {

        private LinkedList<String> list = new LinkedList<>();

        void safePrisoner() {
            list.add(namePrisoner());
        }
    }

    public static void main(String args[]){
        Person oscar = new Person();

        for (int i = 0; i<1200; i++){
            oscar.safePrisoner();
        }
    }
}
