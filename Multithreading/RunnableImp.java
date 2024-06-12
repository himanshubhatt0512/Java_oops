class demo_class implements Runnable {
    public void run() {
        System. out.println("Content in the run method");
    }
}
class RunnableImp{
    public static void main(String [] args) {
        demo_class d = new demo_class();
        Thread t = new Thread(d);
        t.start();
        System. out.println("Thread has started now");
    }
}