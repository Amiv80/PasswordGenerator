import java.util.*; 

 public class PasswordGenerator  
{ 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Password length = ");   // password length 
            int length = scanner.nextInt(); 
        System.out.println(generatePswd(length)); 
    } 
    
    static char[] generatePswd(int len) 
    { 
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String chars = "abcdefghijklmnopqrstuvwxyz"; 
        String nums = "0123456789"; 
        String symbols = "!@#$%^&*_=+-/€.?<>)"; 
 
        String passSymbols = charsCaps + chars + nums + symbols; 
        Random rnd = new Random(); 
         
        char[] password = new char[len]; 
        int index = 0; 
        for (int i = 0; i < len; i++)  
        { 
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length())); 
            
        } 
        return password; 
    } 
}
