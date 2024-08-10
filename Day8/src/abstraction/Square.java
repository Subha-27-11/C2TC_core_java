package abstraction;

public class Square extends Shape {
	private float side;

	public Square()
	{
		float side = 2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	void calArea() {
		super.area=side*side;		
	}
}
