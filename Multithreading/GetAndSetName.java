public class GetAndSetName extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("thread Task1");
    }
    public void runs() {
        System.out.println(Thread.currentThread().getName());
        
    }
    public static void main(String[] args) {        
        GetAndSetName t1=new GetAndSetName();
        t1.start();
        t1.runs();
        System.out.println(Thread.currentThread().getName());
    }
}
