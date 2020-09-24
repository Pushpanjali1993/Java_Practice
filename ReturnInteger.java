
public class ReturnInteger {

//	public int Rectangle(int width , int height){
//		return width*height;
//	}
	
	public static int Rectangle(int width , int height){
		return width*height;   // Static methods can be directly called without creating an object
	}
	
	public static void main(String[] args) {
		ReturnInteger returnInteger = new ReturnInteger();
		//System.out.println(returnInteger.Rectangle(3, 5));
		System.out.println(Rectangle(3,5));   // Static methods can be directly called without creating an object

	}

}
