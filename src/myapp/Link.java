package myapp;

public class Link {
    
    // Accept any object that implements the Damageable interface
    public void hit(Damageable d){
        d.damage(5);
    }

    //public void hit(Monster m){
    //    m.damage(5);
    //}

    //public void hit(Box b){
    //    b.setIntegrity(b.getIntegrity() - 5);
    //}

}
