
package utilidades;

import estructuraDatos.Enumerados;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Metodos para pedir por teclado y presentar por pantalla.
 * @author Ana Muñiz
 * @version 2.0
 */
public class IO_ES {
    
    /**
     * Método constructor de la clase IO_ES
     */
    IO_ES(){
        
    }

   /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * un número entero.
    *
    * @return entero
    */
   public static int leerInteger() {
       
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

       do {

                
            try {
                  
                System.out.print("Introduzca un numero entero: ");
                  
                d = Integer.valueOf(s.nextLine());
                  
                correcto = true;
                  
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El numero introducido no es un entero" + Color.RESET);
           }
            
       } while (!correcto);

       return d;
   }//cierre del método leerInteger()

   /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * un número entero.
    *
    * @param msg  mensaje que muestra para la petición del dato.
    * @return entero
    */
   static public int leerInteger(String msg) {
       
      //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

       do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Integer.valueOf(s.nextLine());
                  
                correcto = true;
                  
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un entero" + Color.RESET);
           }
            
       } while (!correcto);

       return d;
       
   }//cierre método leerInteger(Strin msg) 
   
   /**
    * Método que pide al usuario que introduzca un número. 
    * El número esperado es un número entero mayor que el parametro de entrada min. 
    * @param msg mensaje que muestra para la petición del dato.
    * @param min valor mínimo
    * @return d valor introducido.
    */
   static public int leerInteger(String msg, int min) {
       
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

       do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Integer.valueOf(s.nextLine());
                  
                correcto = true;
                
                if (d < min){  

                    System.out.println(Color.ROJO + "Introduzca un número mayor o igual que " + min + "." + Color.RESET);
                    
                    correcto = false;
                }
                  
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un entero" + Color.RESET);
           }
            
       } while (!correcto);

       return d;

   }//cierre método leerInteger(Strin msg, int min) 
   
   /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * El número esperado es un número entero comprendido entre el valor de los parametros de entrada min y max.
    * @param msg mensaje que muestra para la petición del dato
    * @param min valor mínimo
    * @param max valor máximo
    * @return d valor introducido.
    */
   public static int leerInteger(String msg, int min, int max) {
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Integer.valueOf(s.nextLine());
                  
                correcto = true;
     
               
               if (d < min || d > max){  

                    System.out.println(Color.ROJO + "Introduzca un número del " + min + " al " + max + "." + Color.RESET);
                    
                    correcto = false;
                }//cierre del condicional if
               
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un entero" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d;
           
   }//cierre método leerInteger(Strin msg, int min, int max) 
   
   /**
     * Pide por teclado y devuelve un número entero en formato largo
     * @return número entero introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número entero en formato largo.
     */
    public static long leerEnteroLargo(){
       
        //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       long d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print("Introduzca un número entero largo: ");
                  
                d = Long.valueOf(s.nextLine());
                  
                correcto = true;
  
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un entero" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d;
        
    }//cierre método LeerEnteroLargo() 
    
    /**
     * Pide por teclado y devuelve un número entero en formato largo
     * @param msg mensaje que muestra para la petición del dato.
     * @return número entero introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número entero en formato largo.
     */
    public static long leerEnteroLargo(String msg){
       
        //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       long d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Long.valueOf(s.nextLine());
                  
                correcto = true;
               
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un entero" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
        
    }//cierre método leerEnteroLargo(String msg) 
   
    /**
     * Pide por teclado y devuelve un número real
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (){
        //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       float d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print("Introduzca un número real: ");
                  
                d = Float.valueOf(s.nextLine());
                  
                correcto = true;
               
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un real" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
       
    }//cierre método leerReal()
    
    /**
     * Pide por teclado y devuelve un número real
     * @param msg mensaje que muestra para la petición del dato.
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (String msg){
       
        //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       float d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Float.valueOf(s.nextLine());
                  
                correcto = true;
               
            } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un real" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
       
    }//cierre método leerReal (String msg)
       
    /**
     * Pide por teclado y devuelve un número real.
     * @param msg mensaje que muestra para la petición del dato.
     * @param min dato de entrada.
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (String msg, int min){
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       float d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Float.valueOf(s.nextLine());
                  
                correcto = true;

            
            if (d < min){  

                    System.out.println(Color.ROJO + "Introduzca un número mayor o igual que " + min + "." + Color.RESET);
                    
                    correcto = false;
            }
           
          } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un real" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
    }//cierre método leerReal (String msg, int min)
    
    /**
     * Pide por teclado y devuleve un número real en formato largo
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real en formato largo.
     */
    public static double leerRealLargo(){
       
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       double d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print("Introduzca un número real largo: ");
                  
                d = Double.valueOf(s.nextLine());
                  
                correcto = true;
           
          } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un real" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
        
    }//cierre método leerRealLargo()

    /**
     * Pide por teclado y devuleve un número real en formato largo
     * @param msg número real introducido
     * @return 
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real en formato largo.
     */
    public static double leerRealLargo(String msg){
       
        //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       double d = 0;
               
       /** Variables auxiliares */
 
       boolean correcto = false;
       
       /** Clase Scanner para petición de datos de entrada */
        
       Scanner s = new Scanner(System.in);
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        do {

                
            try {
                  
                System.out.print(msg);
                  
                d = Double.valueOf(s.nextLine());
                  
                correcto = true;
           
          } catch (NumberFormatException e) {
                   
                System.out.println(Color.ROJO + "ERROR:  El dato introducido no es un real" + Color.RESET);
           }//cierre del catch
            
       } while (!correcto);

       return d; //Variable de salida
        
    }//cierre método leerRealLargo(String msg) 
    
    /**
     * Pide por teclado y devuelve un entero de una cifra
     * @param mensaje, max, min
     * @return  entero introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un entero de una cifra.
     */
    public static byte leerByte(String mensaje){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        byte a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(mensaje); 
            
            a = s.nextByte(); //ENTRADA DE DATOS 
            
            
            flag = true;     //salir del while
            
           
          } catch(InputMismatchException e){
              
            System.out.println("Error: No ha introducido un entero de una cifra.");
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve un entero de una cifra
     * @param mensaje mensaje saliente
     * @param min mínimo valor
     * @param max mayor valor.
     * @return  a
     * Excepcion.
     *           Ocurre cuando no introducimos un entero de una cifra.
     */
    public static byte leerByte(String mensaje, int min, int max){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        byte a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(mensaje); 
            
            a = s.nextByte(); //ENTRADA DE DATOS 
            
            
            flag = true;     //salir del while
            
            
            if (a < min || a > max){  

                    System.out.println(Color.ROJO + "Introduzca un número del " + min + " al " + max + "." + Color.RESET);
                    
                    flag = false;
                }
            
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido un entero de una cifra." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve una palabra o texto
     * @return letra introducida.
     * Exception.
     *           Ocurre cuando no introducimos una cadena de texto.
     */
    public static String leerCadena(){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
        
        /** Clase Scanner para petición de datos de entrada */
        
        Scanner s = new Scanner(System.in);
            
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        System.out.print("Escriba un texto:"); 
            
        a = s.nextLine(); //ENTRADA DE DATOS.
        
        return a; //variable de salida.
        
    }//cierre método leerCadena()
    
    /**
     * Pide por teclado y devuelve una palabra o texto, mediante un mesaje dado.
     * @param msg mensaje porporcionado para pedir la cadena de texto
     * @return cadena de texto
     */
    public static String leerCadena(String msg){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
   
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

        Scanner s = new Scanner(System.in);
                        
        System.out.print(msg); 
            
        a = s.nextLine(); //ENTRADA DE DATOS 

        return a; //variable de salida.
        
    }//cierre método leerCadena(String msg)
    

    /**
     * Pide por teclado y devuelve una cadena de texto de 10 caractwres, medante un mensaje dado.
     * @param msg mensaje porporcionado para pedir la cadena de texto
     * @param longitud longitud de la cadena de texto.
     * @param msgError mesnaje cuando no se introduce un dato correcto.
     * @return a dato indicado por teclado.
     */
    public static String leerCadena(String msg, int longitud, String msgError){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
               
        /** Variables auxiliares */
       
        boolean flag;
        
        /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
        
        //---------------------------------------------- 
        /**          POCESAMIENTO DE DATOS            */
        //----------------------------------------------

        do{
             
            System.out.print(msg); 

            a = s.nextLine(); //ENTRADA DE DATOS 

            flag = true;     //salir del while  

           if(a.length() != longitud){

                System.out.println(Color.ROJO + msgError + Color.RESET);

                flag = false; //seguir en el while.

            }
          
        }while(!flag);
        
        return a; //variable de salida.
        
    }//cierre método leerCadena(String msg, int longitud)
    
   /**
     * Pide por teclado y devuelve un caracter
     * @return a valor introducido.
     *
     */
    public static char leerCaracter(){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        char a = 'a';
               
        /** Variables auxiliares */
       
        String teclado;
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
                        
            System.out.print("Introduzca un carácter: "); 
            
            teclado = s.next(); //ENTRADA DE DATOS 
            
            a = teclado.charAt(0);

            flag = true;     //salir del while  
            
            if (teclado.length() != 1){
                
                System.out.println(Color.ROJO + "Error. No ha introduccido un carácter." + Color.RESET);
                
                flag = false;
                
            }
     
        }while(flag == false);
        
        return a; //variable de salida.
        
    }//cierre método LeerCaracter() 
    
    /**
     * Pide por teclado y devuelve un caracter
     * @param msg mensaje saliente.
     * @return letra introducida.
     *
     */
    public static char leerCaracter(String msg){  
     //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        char a = 'a';
               
        /** Variables auxiliares */
       
        String teclado;
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
                        
            System.out.print(msg); 
            
            teclado = s.next(); //ENTRADA DE DATOS 
            
            a = teclado.charAt(0);

            flag = true;     //salir del while  
            
            if (teclado.length() != 1){
                
                System.out.println(Color.ROJO + "No ha introduccido un carácter." + Color.RESET);
                
                flag = false;
                
            }
     
        }while(flag == false);
        
        return a; //variable de salida.
    }//cierre método LeerCaracter(String msg)
    
    /**
     * Pide por teclaro una confirmación y devuelve un booleano.
     * @return  a booleano introduccido.
     * 
     */
    public static boolean leerBooleano(){  
     
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        boolean booleano = false;
               
        /** Variables auxiliares */
       
        String a = "";
        
        boolean flag = false;
       
        /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          
             
            System.out.print("¿Está de acuerdo? [s/n] "); 
            
            a = s.nextLine().toUpperCase();//ENTRADA DE DATOS 
       
            flag = true;
            
            switch (a){
                case "N":
                    
                    booleano = false;
                    
                    break;
                    
                case "S":
                    
                    booleano = true;
                    
                    break;
                    
                default:
                    
                    System.out.println(Color.ROJO + "La opción elegida no es válida." + Color.RESET);
                    
                    flag = false;
                    
                    break;
            }
                     
        }while(!flag);
        
        return booleano; //variable de salida.
        
        
    }//cierre método LeerBooleano()

    /**
     * Es un método de confirmación, el usuario introduce si o no.
     * @param msg mensaje a mostrar al pedir por pantalla.
     * @return  a booleano.
     * 
     */
    public static boolean leerBooleano(String msg){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        boolean booleano = false;
               
        /** Variables auxiliares */
       
        String a = "";
        
        boolean flag = false;
       
        /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          
             
            System.out.print(msg + "[s/n] "); 
            
            a = s.nextLine().toUpperCase(); //ENTRADA DE DATOS 
            
            flag = true;
            
            switch (a){
                case "N":
                    
                    booleano = false;
                    
                    break;
                    
                case "S":
                    
                    booleano = true;
                    
                    break;
                    
                default:
                    
                    System.out.println(Color.ROJO + "La opción elegida no es válida." + Color.RESET);
                    
                    flag = false;
                    
                    break;
            }
            
             
        }while(!flag);
        
        return booleano; //variable de salida.
        
    }//cierre método LeerBooleano(String msg)
    
    /**
    * Método que muestra un String por pantalla con salto de línea
    *
    * @param msg mensaje que muestra en pantalla
    */
   public static void escribirLN(String msg) {
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------
        
      //Imprimir por pantalla:
      System.out.println(msg);
      
   }//cierre del método escribirLN(String msg)
   
    /**
    * Método que muestra un String por pantalla sin salto de línea
    *
    * @param msg mensaje que muestra en pantalla
    */
   public static void escribir(String msg) {
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------
        
      //Imprimir por pantalla:       
      System.out.print(msg);
   }//cierre del método escribir(String msg)

    /**
     * Pide por teclado y devuelve una letra
     * @param mensaje mensaje saliente.
     * @return letra introducida.
     * Excepcion
     *           Ocurre cuando no introducimos una letra.
     */
    public static String leerString(String mensaje){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(mensaje); 
            
            a = s.next(); //ENTRADA DE DATOS 
            
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido una cadena." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
   
    /**
    * Método que muestra un String por pantalla
    *
    */
   public static void leerlinea() {
        /** Clase Scanner para petición de datos de entrada */
        
        Scanner s = new Scanner(System.in);
        
        String option = s.nextLine();
   }

   
   public static String leerArchivo(String ruta){
       String result= "";
       try{
          FileReader fichero =new FileReader(ruta); //ENTRADA
         
          int l=fichero.read();
          
          while(l != -1){
              l=fichero.read();
              
              result += (char)l;
          }
          
          fichero.close();
        }catch(IOException e){
            System.out.println("Archivo no encontrado" + e.getMessage());
        }
       return result;
       
   }
}
