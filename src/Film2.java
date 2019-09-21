public class Film2 {

    static class Trick {
        void process(Object object){
            object = null;
            System.gc();
        }
    }

    public static void main(String args[]){
        Object pencil = new Object();
        new Trick().process(pencil);
    }
}
