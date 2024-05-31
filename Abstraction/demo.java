abstract class bike{

    bike(){
        System.out.println("Bike is Started");
    }
    abstract void run();

    void gearChange(){
        System.out.println("gear changed");
    }
}

class kawasaki extends bike{
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class demo {

    public static void main(String[] args) {
        bike h2r = new kawasaki();
        h2r.run();
        h2r.gearChange();
    }
}
