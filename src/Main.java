import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        User user = new User();

        
        System.out.println("Bienvenido, estudiante, es hora de que el sombrero digital seleccione tu casa de Hogwarts");

        System.out.println("Menciona tu nombre");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        user.setName(name);
       

        System.out.println("Dichoso " + user.getName() + " el sombrero a elegido tu casa es...");

    }
    
}
