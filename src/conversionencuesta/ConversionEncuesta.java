/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionencuesta;
import java.util.Scanner;

/**
 *
 * @author Sergio Gómez
 */
public class ConversionEncuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creación del Scanner para recolectar datos
        Scanner C_Input = new Scanner(System.in);
        
        //Solicitud de datos al usuario.
        
        System.out.println("""
        Bienvenido usuario. A continuacion se realizara una encuesta, en donde 
        los datos digilenciados seran usados para demostrar la capacidad de 
        conversion de datos en Java, usando variables primitivas y objetos.
        Los datos solicitados son:
        1. Nombre Completo. (String)
        2. Edad. (Integer)
        3. Esta en 4 semestre o mas? Responder con True o False. (Boolean)
        4. Entre el numero Pi y el numero Euler, cual prefiere? Digitelo con 1 y 2 respectivamente (Float)
                           
        Insertelos en ese orden.
        """);
        
        // Creación de las variables.
        
        String Name = C_Input.nextLine();
        int Age = C_Input.nextInt();
        boolean NumSemestre = C_Input.nextBoolean();
        C_Input.nextLine();
        float NumFav = C_Input.nextInt();
        
        // Variable String
        
        System.out.println("\nA partir de tu nombre vamos a convertir cada caracter"
                + "\n en su respectivo codigo ASCII\n");
        
        //Metodos del objeto String
        
        int NameLenght = Name.length();
        char [] NameCharArray = Name.toCharArray();
 
        //Ciclo For
        
        for(int i = 0; i < NameLenght; i = i+1){
            char x = NameCharArray[i];
            System.out.println("La letra "+x+" de tu nombre tiene "
                    + "\ncomo codigo ASCII el respectivo numero: "+ (int)x+"\n");
        }
            
        //Variable Int
        
        System.out.println("\nCon tu edad la vamos a convertir en binario creando\n"
                + "una variable de tipo objeto entero y con el metodo.toBinaryString()");
        
        System.out.println("Tu edad en binario es: "+Integer.toBinaryString(Age)+"\n\n");
        
        //Variable Boolean
        
        System.out.println("Las variables de tipo bool se pueden convertir a "
                + "strings ya que a int o float no es tan util.\n"
                + "Esto a traves de la variable tipo objeto");
        
        Boolean ObjNumSemestre = NumSemestre;
        
        System.out.println("Este es un string: "+ObjNumSemestre.toString());
        
        //Variable Float
        
        if(NumFav == 1){
            System.out.println("\n\nEscogiste el numero de Euler, es una variable double\n");
            double NumEuler = Math.E;
            System.out.println("Variable Double: "+NumEuler+
                    "\nVariable Float: "+ (float)NumEuler+
                    "\nVariable Int: "+ (int)NumEuler);
        }
        if(NumFav == 2){
            System.out.println("\n\nEscogiste el numero pi, es una variable double\n");
            double NumPi = Math.PI;
            System.out.println("Variable Double: "+NumPi+
                    "\nVariable Float: "+ (float)NumPi+
                    "\nVariable Int: "+ (int)NumPi);
            
        }
    }
    
}
