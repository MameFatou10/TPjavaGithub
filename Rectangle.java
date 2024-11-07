public class Rectangle {
    public void Calcul(float l,float L){
        float P,S,multDimen ;
        P=(L+l)*2;
        S=l*L ;
        multDimen = l*3 + L*3 ;
        System.out.println("Le perimetre "+P);
        System.out.println("Le perimetre "+S);
        System.out.println("Le perimetre "+multDimen);

    }
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.Calcul(12,5);
    }
}