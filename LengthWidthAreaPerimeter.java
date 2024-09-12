package lengthwidthareaperimeter;
public class LengthWidthAreaPerimeter {
    public static void main(String[] args) {
        int length = 10; //indicate variables 
        int width = 5;
        
        int area = length * width; //input expression for area and perimeter
        int perimeter = 2 * (area);
        System.out.println("Hello there!\nThese are your specifications: "); 
        System.out.println("=============================================");
        System.out.println("Length:\t"+length+" meters");
        System.out.println("Width:\t"+width+" meters");
        System.out.println("Area:\t"+area+" square meters");
        System.out.println("Perimeter: "+perimeter+" meters");
        System.out.println("=============================================");
        System.out.println("Thank you for trusting us!");
    }
    
}
