package myapp;

public class Main {
    
    public static void main(String[] args){

    Monster m= new Monster();
    m.setName("Kaiju no 8");
    m.setHitPoints(100);

    System.out.println(m);

    Link link = new Link();
    link.hit(m);

    System.out.println(m);

    System.out.println("-------------\n");

    Godzilla g = new Godzilla();

    System.out.println(g);
    link.hit(g);
    System.out.println(g);

    System.out.println("-------------\n");

    Box b = new Box();
    link.hit(b);
    System.out.println(b);

    Damageable d = b;

    }

}
