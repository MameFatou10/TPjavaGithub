
public class UtilTab {
     public void Tableau(float tab[]) {
         int i ;
         float s=0 ;
         for(i=0;i<tab.length;i++){
             s=s+tab[i];  
         }
         System.out.println("La somme est "+s);
     }
     public static void main(String[] args) {
          UtilTab s = new UtilTab();     
          float tab[] = {12,6,7,13,11,13};
          s.Tableau(tab);
     }
}