package week8_2;

public class Square extends Rectangle {
    public Square(){
         super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getside(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
	return "A Square with side="+this.getLength()+", which is a subclass of "+super.toString();
    }
    public int perimeter() {
	System.out.println("Square Perimeter");
	return (int) (2 * (this.getLength() + this.getWidth()));
    }
    @Override
	public void setLength(double side) {
		super.setLength(side);
	}
    @Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
}
