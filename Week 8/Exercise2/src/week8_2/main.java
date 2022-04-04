package week8_2;

public class main {
    public static void main(String[] args) {
        Shape obj = new Shape("blue", false);
        System.out.println(obj);
       
        Circle obj2 = new Circle();
        System.out.println(obj2);
        
        Rectangle obj3 = new Rectangle(20,30);
        System.out.println(obj3);
        
        Square obj4 = new Square(10,"red", false);
        System.out.println(obj4);
        obj4.setSide(20);
        System.out.println(obj4);
    }
}
