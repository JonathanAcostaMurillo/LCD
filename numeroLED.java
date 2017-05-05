/*
Subclase que genera matrices String con los caracteres correspondientes a cáda dígito
 */
package LED;

/**
 *
 * @author acost
 */
public class numeroLED {
    private int id;
    private String[][] numero;
    
    //Método para crear el objeto "Matríz de caracteres" número LED
    
    public numeroLED(int numero, int tamano) {
        this.id=numero;                                //Identificador de dígito
        this.numero=new String[2*tamano+3][tamano+2];  //Matriz de caracteres
                                //Filas     //Columnas
        caracteresDeMatriz();
    }
    
    
    //Método para crear la matriz en función del dígito ingresado
    private void caracteresDeMatriz(){
        switch(id){
                case 0: cero();break;
                case 1: uno();break;    
                case 2: dos();break;
                case 3: tres();break;
                case 4: cuatro();break;
                case 5: cinco();break;
                case 6: seis();break;
                case 7: siete();break;
                case 8: ocho();break;
                case 9: nueve();break;
                        
            }     
    }
    //Métodos de organización de caracteres en las matrices por número:
    private void cero(){
  
            for(int i=1; i<numero.length-1;i++){           //Recorro columna
                numero[i][0]="|";                        //Primera columna 
                numero[i][numero[0].length-1]="|";       //Última columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void uno(){
  
            for(int i=1; i<numero.length-1;i++){           //Recorro columna
                numero[i][numero[0].length-1]="|";         //Última columna
            }
          
    }
    
    
     private void dos(){
            int media=(int)((numero.length-1)/2);  
            for(int i=1; i<media;i++){           //Recorro columnas
                numero[i+media][0]="|";                        //Primera columna
                numero[i][numero[0].length-1]="|";       //Última columna
            
            
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila
                numero[media][j]="-";                   //Fila media 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void tres(){
            int media=(int)((numero.length-1)/2);  
            for(int i=1; i<numero.length-1;i++){           //Recorro columnas
                numero[i][numero[0].length-1]="|";         //Última columna      
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila
                numero[media][j]="-";                   //Fila media 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void cuatro(){
            int media=(int)((numero.length-1)/2);  
            for(int i=1; i<numero.length-1;i++){           //Recorro columnas
                numero[i][numero[0].length-1]="|";       //Última columna
            }
            
            for(int i=1; i<media;i++){           //Recorro columnas
                numero[i][0]="|";                  //Primera columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[media][j]="-";                   //Fila media 
             
            }
          
    }
    
    private void cinco(){
            int media=(int)((numero.length-1)/2);  
            for(int i=1; i<media;i++){           //Recorro columnas
                numero[i][0]="|";                  //Primera columna
                numero[i+media][numero[0].length-1]="|";       //Última columna
            
            
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila
                numero[media][j]="-";                   //Fila media 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void seis(){
            int media=(int)((numero.length-1)/2);  
            for(int i=1; i<media;i++){                      //Recorro columnas
                numero[i+media][numero[0].length-1]="|";       //Última columna

            }
            
            for(int i=1; i<numero.length-1;i++){           //Recorro columnas
                numero[i][0]="|";                  //Primera columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila
                numero[media][j]="-";                   //Fila media 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void siete(){
  
            for(int i=1; i<numero.length-1;i++){           //Recorro columna
                numero[i][numero[0].length-1]="|";       //Última columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila 
            }
          
    }
    
    private void ocho(){
            int media=(int)((numero.length-1)/2);
            for(int i=1; i<numero.length-1;i++){           //Recorro columna
                numero[i][0]="|";                        //Primera columna 
                numero[i][numero[0].length-1]="|";       //Última columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila 
                numero[numero.length-1][j]="-";          //Última fila 
            }
            
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[media][j]="-";                   //Fila media 
            }
            
    }
    
    private void nueve(){
            int media=(int)((numero.length-1)/2); 
            
            for(int i=1; i<numero.length-1;i++){           //Recorro columnas
                numero[i][numero[0].length-1]="|";       //Última columna
            }
            
            for(int i=1; i<media;i++){           //Recorro columnas
                numero[i][0]="|";                  //Primera columna
            }
            
            for(int j=1; j<numero[0].length-1;j++){
                numero[0][j]="-";                        //Primera fila 
                numero[media][j]="-";                   //Fila media 
                numero[numero.length-1][j]="-";          //Última fila 
            }
          
    }
    
    private void imprimirMatriz(){
        System.out.println("Arreglo: ");
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
    
    //Método para retornar la matriz creada
    public String[][] matriz(){
        return numero;
    }
    //Método para retornar un caracter especifico de la matriz creada
    public String toString(int numeroFila, int numeroColumna){ //Retorna la fila "numeroFila"
        return numero[numeroFila][numeroColumna];
    }
    
    //Método para retornar el número de filas de la matriz creada
    public int numFilas (){
        return numero.length;
    }
    //Método para retornar el número de columnas de la matriz creada
    public int numColumnas (){
        return numero[0].length;
    }
}



