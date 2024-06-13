public class PeriorityThread extends Thread{
    public void run() {
        System.out.println("child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }
   

   public static void main(String[] args) {
       System.out.println(Thread.currentThread().getPriority());
       
       PeriorityThread p=new PeriorityThread();
       p.setPriority(7);
       p.start();

   }
}
