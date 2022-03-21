package association;

public class Basket {
    // state //
    private String name;
    
    // constructor //
    public Basket (String name){
        this.name = name;
    }
    
    // getter //
    public String getBasketName(){
        return this.name;
    }
}