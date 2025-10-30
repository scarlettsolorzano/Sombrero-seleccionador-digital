import java.util.Scanner;


public class Main {
    static void showQuestion(String question, String answerA, String answerB){
        System.out.print(
            "\n¿" + question + "? \n" +
            " (A)-" + answerA + "\n" +
            " (B)-" + answerB + "\n" +
            "\nSelecciona A o B: " 
            
        );
    }
    public static void main(String[] args) {


        String name, answers;
        boolean isAnswerInvalid;
        
        User player = new User();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Bienvenido, estudiante, es hora de que el sombrero digital seleccione tu casa de Hogwarts");

        System.out.println("Menciona tu nombre");
        
        name = sc.nextLine(); //obtener o que ponga en la siguiente linea el usario y lo convierte en un string

        player.setName(name);
       
        do {
            showQuestion("Qué es lo más importante para ti", "Ser inteligente", "Ser valiente");

            answers = sc.nextLine();
            answers = answers.toUpperCase();

            if (answers.equals("A" )) { 
                showQuestion("Qué animal te gustaría ser"," León","Serpiente");
                isAnswerInvalid = false;
            }else if (answers.equals("B")) {
                showQuestion("Qué te llama más la atención aprender","Transformaciones","Pociones");
                isAnswerInvalid = false;
            }else{ 
                isAnswerInvalid = true;
                System.out.println("\nError: la respuesta no es válida\n");
            }
        } while (isAnswerInvalid );
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close(); //función de recurso se termina la conexión
        
        




















        System.out.println("Dichoso " + player.getName() + " el sombrero a elegido tu casa es...");

        

    }
    
}
