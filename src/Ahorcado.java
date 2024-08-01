import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //arreglo
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        // Estructura de control: iteractiva(bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: iteractiva(bucle)
        while (!palabraAdivinada && intentos < intentosMaximos){
            
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ( " + palabraSecreta.length() + "  letras).");

            System.out.println("Introduzca una letra, por favor");

            //usamos la clase scanner para pedir una letra
            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;

            //Estructura de control: iteractiva(bucle)
            for (int i = 0; i < palabraSecreta.length(); i++){
                
                // Estructura de control: condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
            }
          
        }

        if (!palabraAdivinada) {
            System.out.println("¡Qué pena te has quedado sin intentos! GAME OVER");
        }
       
        scanner.close();
    }
}
