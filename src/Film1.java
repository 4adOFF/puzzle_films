public class Film1 {
    static class Person {

        private Person respectTo;

        boolean ask(Person person){
            return person.equals(respectTo);
        }
    }

    public static void main(String args[]){
        Person oldPerson = new Person();
        Person youngPerson = new Person();

        youngPerson.ask(oldPerson);
    }
}
