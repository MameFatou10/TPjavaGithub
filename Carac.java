public class Carac {

     char n ;
    public void estVoyelle(char n){

        if(n=='e' || n=='o' || n=='i' || n=='u' || n=='j') 
           System.out.println("true");
        else
           System.out.println("faut");

    }
    public static void main(String[] args) {
        Carac s = new Carac();
        s.estVoyelle('e');

        
    }
}