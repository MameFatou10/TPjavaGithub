public class Point {
    private int x ;
    private int y ;
    public Point (int abs , int ord){
        x=abs;
        y=ord ;
    } 
    public void afficher(){
        System.out.println("Les coordonner du point sont x = "+x+" et y= "+y);
    }
        public static void main(String[] args){
            Point a = new Point(10,12);
         
            a.afficher();
        }
    

}