/*
 * Función de prueba (Correr Test.java)
 */
package LED;

/**
 *
 * @author acost
 */
public class Test {
   
    private static PSL_LED LED1;
    
    public static void main(String[] arg){
        
        LED1=new PSL_LED(1);                //Crea una nueva variable de la clase
        
        LED1.iniciar();
        
        
    }
}
