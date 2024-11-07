public class HelloWorldWithMethod {
    String n ;
   public void Hello(String n){
    System.out.println(n);
    }
    public static void main(String[] args) {
        HelloWorldWithMethod s = new HelloWorldWithMethod();
        s.Hello("You're Welcome");
        
    }
}