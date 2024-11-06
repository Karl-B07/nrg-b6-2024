package taskCalculatingShape;
// lather, rinse, repeat
// pet at your own risk
// put gorilla food into cage
public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        System.out.println("put gorilla food into cage");
        return true;
    }

    @Override
    public void groom() {
            System.out.println("Lather");
            System.out.println("Rinse");
        System.out.println("*repeat*");
    }

    @Override
    public void pet() {
        System.out.println("pet at your own risk");
    }
    
}
