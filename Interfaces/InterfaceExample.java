
interface Animal {
    void noOfLegs();
}


class horse implements Animal{
    @Override
    public void noOfLegs() {
        System.out.println("Horse has four legs");
    }
}

class Kangaroo implements Animal{
    @Override
    public void noOfLegs() {
        System.out.println("Kangaroo has two legs");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        horse h = new horse();
        h.noOfLegs();

        Kangaroo k = new Kangaroo();
        k.noOfLegs();       
        
    }    
}
