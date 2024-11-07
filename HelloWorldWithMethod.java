public class HelloWorldWithMethod {
    private String x ;
    public void Hello(String n){
         x=n ;
    }
    public void afficher() {
              System.out.println(x);
    }
    public static void main(String[] args) {
        HelloWorldWithMethod a = new HelloWorldWithMethod();
        a.Hello("You're Welcome");
        a.afficher();
    }
}