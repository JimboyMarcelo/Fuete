import java.util.Scanner;
public class CC2_MARCELO_LABCHAL7 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String input;
        boolean terminate = true;
        

        while(terminate){
        System.out.println("=====================================================");
        System.out.print("Input Password: ");
        input = read.next();
            if(input.equalsIgnoreCase("Exit")){
                System.out.println("\t\tProgram Terminated!");
                System.out.println("=====================================================");
                break;
            }
        boolean valid = true;

        if(input.length() < 8){
            System.out.println("*Password must be at least 8 character long!");
            valid = false;
        }
        if(!input.matches(".*[A-Z].*")){
            System.out.println("*Password must contain at least one UpperCase Letter!");
            valid = false;
        }
        if(!input.matches(".*[a-z].*")){
            System.out.println("*Password must contain at least one LowerCase Letter!");
            valid = false;
        }
        if(!input.matches(".*[0-9].*")){
            System.out.println("*Password must have at least one digit!");
            valid = false;
        }
        if(valid){
            System.out.println("\t\t**Valid Password!**");
        }else{
            System.out.println("\t\t**Invalid Password!**");
            }
        }    
    }
}