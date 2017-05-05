/*
 * Código de solución del ejercicio práctico de selección PSL
Objetivo: Crear un programa que imprime números en estilo de una pantalla LCD

Entrada: La entrada contiene varias líneas. Cada línea contiene 2 números separados por coma. El primer número representa el tamaño de la impresión (entre 1 y 10, esta variable se llama “size”). El segundo número es el número a mostrar en la pantalla. Para terminar, se debe digitar 0,0. Esto terminará la aplicación.

Salida: Imprimir los números especificados usando el caracter “-“ para los caracteres horizontales, y “|” para los verticales. Cada dígito debe ocupar exactamente size+2 columnas y 2*size + 3 filas.

Entre cada impresión debe haber una línea blanca.

Ejemplo: Entrada: 2,12345 3,67890 0,0
 */
package LED;

import java.util.Scanner;

/**
 *
 * @author acost
 */
public class PSL_LED {

    private static Scanner leerDatos = new Scanner(System.in);  //Lector de datos
    private int LED;                                            //Identificador del objeto PSL_LED
    private int digitos=0;                                      //Cantidad de dígitos del número
    private String dato;                                        //Variable de entrada
    private numeroLED[] numeroMatriz;                           //Matriz que almacena las matrices de Strings de cada dígito
    
    //Método para crear el objeto (TEST)
    public PSL_LED(int LED) {                   
        this.LED = LED;
    }
    /**
     * @param args the command line arguments
     */
    
    
    //Método principal
    public void iniciar() {
        // TODO code application logic here
        int a=1;
        System.out.print("Ingresar numero: ");
        do{
            setDato();
        
            String[] valores = dato.split(",");          //Organiza los números separados por ","
            int tamano = Integer.parseInt(valores[0]);   //Tamaño de los números
            int numero = Integer.parseInt(valores[1]);   //Número a imprimir
            
            //Condiciones de funcionamiento y salida del programa
            if(tamano==0 && numero==0){
                a=0;
                System.exit(0);
            }else if(tamano==0){
               System.out.print("Porfavor ingresar un tamaño distinto a 0. ");
            }else{

            digitos=contadorCifras(numero);                 //Contador de dígitos
            ordenarMatrices(tamano, numero, digitos);       //Crea el arreglo de matrices String del número
            
            }
            
        }while (a!=0);
       
    }
    
    //Método para leer los datos
    private void setDato(){
        dato=leerDatos.next();   //Lee el dato de entrada       
    } 
    
    //Método para crear el arreglo de matrices String para los digitos ingresados
    private void ordenarMatrices(int tamano, int numero, int digitos){
        //numeroLED numerosMatriz=new numeroLED(numero, tamano);
        int residuo=0;
        numeroMatriz =new numeroLED[digitos];                 //Crea el arreglo de matrices
        for(int i=0; i<digitos;i++){                          //LLena el arreglo de matrices con las matrices String de cada digito
            residuo=numero%10;
            numero=(int)numero/10;
            numeroMatriz[digitos-1-i]=new numeroLED(residuo,tamano);
            //imprimirPantalla(numeroMatriz);
           
        }
        
        superMatriz(tamano,numeroMatriz);                    //Crea una super matriz con todos los valores String de todos los digitos
         
        //Esto permite imprimir los digitos uno seguido del otro
       
        
    }
    
    //Método que une las matrices individuales de cada matriz de Strings en una sola matriz
    private void superMatriz(int tamano, numeroLED[] datos){
       int digitos=datos.length;
        
       String[][] matriz=new String [2*tamano+3][digitos*(tamano+2)];
        
       for(int cont=0; cont<digitos; cont++){
        
        for(int j=0; j<(tamano+2); j++){           //Recorro columnas
            
            for(int i=0; i<matriz.length; i++){      //Recorro filas
  
                matriz[i][j+cont*(tamano+2)]=datos[cont].toString(i,j) ;   //Ubico los datos de las matrices individuales en la super matriz
            }

          }
       }
       
       imprimirPantalla(matriz);
        
    }
    
    //Método que permite contar las cifras del número ingresado
    private int contadorCifras(int numero){
        int digitos=0;
        
        do{             
             numero = numero/10;        
             digitos++;         
         }while(numero!=0);
        return digitos;
    }
    
    //Método para imprimir datos en pantalla
    private void imprimirPantalla(String[][] numero){
      
        for(int i=0; i<numero.length;i++){
            for(int j=0; j<numero[0].length; j++){
                if(numero[i][j]==null){
                    System.out.print("  ");
                }else{
                System.out.print(numero[i][j]+" ");
                }
            }   
            System.out.println("");   
        }
        
    }
    
    /*private void imprimirDato(){
        System.out.println("\n"+dato);
    }
  */
    
}
