import java.util.Scanner;

public class Tablero {
    private int casillas = 25;
    private int turno = 1;
    private int posicion1 = 0;
    private int posicion2 = 0;
    private int posicion3 = 0;
    private int posicion4 = 0;
    Ficha jugador1; 
    Ficha jugador2; 
    Ficha jugador3; 
    Ficha jugador4; 
    Scanner entrada1 = new Scanner(System.in); //Entrada de colores de ficha por consola
    Scanner entrada2 = new Scanner(System.in);
    Scanner entrada3 = new Scanner(System.in);
    Scanner entrada4 = new Scanner(System.in);
    String color1, color2, color3, color4;


    public Tablero(){
        System.out.print("Digite el color de la primea ficha: ");
        color1 = entrada1.nextLine();
        System.out.print("Digite el color de la segunda ficha: ");
        color2 = entrada2.nextLine();
        System.out.print("Digite el color de la primea ficha: ");
        color3 = entrada3.nextLine();
        System.out.print("Digite el color de la segunda ficha: ");
        color4 = entrada4.nextLine();

        jugador1 = new Ficha(color1);
        jugador2 = new Ficha(color2);
        jugador3 = new Ficha(color3);
        jugador4 = new Ficha(color4);
    }

    public void iniciarJuego(){
        while(true){
            if(turno == 1){
                String ficha1 = jugador1.getColor();
                posicion1 += jugador1.avanzar();
                turno += 1;
                System.out.println("La ficha " +ficha1 +" esta en la casilla: " +posicion1);
                if(posicion1 >= casillas){
                    System.out.println("\nGano la ficha color " +ficha1);
                    break;
                }
            }
            if(turno == 2){
                String ficha2 = jugador2.getColor();
                posicion2 += jugador2.avanzar();
                turno += 1;
                System.out.println("La ficha " +ficha2 +" esta en la casilla: " +posicion2);
                if(posicion2 >= casillas){
                    System.out.println("\nGano la ficha color " +ficha2);
                    break;
                }
            }
            if(turno == 3){
                String ficha3 = jugador3.getColor();
                posicion3 += jugador3.avanzar();
                turno += 1;
                System.out.println("La ficha " +ficha3 +" esta en la casilla: " +posicion3);
                if(posicion3 >= casillas){
                    System.out.println("\nGano la ficha color " +ficha3);
                    break;
                }
            }
            if(turno == 4){
                String ficha4 = jugador4.getColor();
                posicion4 += jugador4.avanzar();
                turno = 1;
                System.out.println("La ficha " +ficha4 +" esta en la casilla: "+posicion4);
                if(posicion4 >= casillas){
                    System.out.println("Gano la ficha color " +ficha4);
                    break;
                }
            }
        }
    }
}