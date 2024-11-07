public class Utilitaire{
    public void Tableau(float t1[] ,float t2[]){
        int i ;
        float s1=0,s2=0 ;
         for(i=0;i<t1.length;i++){
           System.out.print("["+t1[i]+"],");
           s1=s1+t1[i];
    }
       System.out.println(" ");
        
         for(i=0;i<t2.length;i++){
           System.out.print("["+t2[i]+"],");
           s2=s2+t2[i];
       }
       System.out.println(" ");
       
       if(t1.length==t2.length)
          System.out.println("true");
       else
          System.out.println("false");
        System.out.println("somme de la ligne1 : "+s1);
        System.out.println("somme de la ligne2 : "+s2);

    }
    public static void main(String[] args) {
        Utilitaire s = new Utilitaire();
        float t [] [] = {{12,6,16,9,11},{16,14,8,7,10}};
        float t1[] = {12,6,16,9,11};
        float t2[] = {16,14,8,7,10};
        s.Tableau(t1,t2);
    }
}