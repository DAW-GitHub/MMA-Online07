package utilidades;

import utilidades.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase para validar NIF.
 * @author Ana
 * @version 1.0
 */
public class ValidarDatos {
    
    final static String REGEX_DNI = "^[0-9]{8}[a-h,j-n,p-t,v-z,A-H,J-N,P-T,V-Z]{1}$";
    
    final static String REGEX_CIF = "^[A-H,a-h,J,j,N,n,P-S,p-s,U-W,u-w]{1}(\\d{7})([0-9,A-J.a-j])$";
    
    final static String  REGEX_NIE = "^[X-Z,x-z]{1}\\d{7,8}[A-Z,a-z]$";
    
    final static char[] LETRA_CIF = {'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
    
    final static char[] LETRA_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    final static String SOCIEDAD_CIF_LETRA = "PQRSNW";
    
    /**
     * Método constructor de la clase ValidarDatos
     */
    ValidarDatos(){
        
    }

    /**
     * Comprueba que el dato de entrada corresponde a un NIF válido.
     * @param nif código indentificatorio.
     * @return false | true 
     */
    public static boolean validarNif(String nif){
        
        boolean verif = false;
        
        String regex = REGEX_DNI + "|" + REGEX_CIF + "|" + REGEX_NIE;

	Pattern patron = Pattern.compile(regex);
        
        Matcher codigo = patron.matcher(nif);
        
        if(codigo.find()){
            
            if(validarCIF(nif)== true || validarDNI(nif)== true){
            
            verif = true;
            
            }
        }
             
        return verif; 
        
    }//fin método validarNif.
    
    /**
     * Metodo que sirve para validar el NIF que sea un CIF
     * @param cif CIF de la empresa
     * @return true | false según sea validado u no el dato de entrada.
     */
    public static boolean validarCIF(String cif){
            
        boolean verif = false;
        
        char sociedad = cif.toUpperCase().charAt(0); //Letra del tipo de sociedad al que pertenece.
        
        String numeros = cif.substring(1,8); //numeros del CIF
        
        char digito = cif.toUpperCase().charAt(8); //dígito de control
        
        if(digito == validarDC(sociedad, numeros)){
            
            verif = true;
            
        }

        return verif;
    }//fin método validarCIF
    
    /**
     * Método para validad el digito de control del CIF
     * @param sociedad parámetro de entra de la parte de la sociedad del CIF
     * @param numero parámetro de entrada de la parte numero del CIF
     * @return carácter correspondiente al CIF de entrada.
     */
    public static char validarDC(char sociedad, String numero){
        
        int numerosPares = 0;
        
        int numerosImpares = 0;
        
        int suma = 0;
        
        int aux;
        
        char dc = '0';
        
        for(int i=0; i<numero.length(); i++){
            
            if(i % 2 != 0){
                
                numerosPares += (int) numero.charAt(i) - 48;
                     
            }else{
                int num1, num2;
                
                aux = 2 * (int) numero.charAt(i) - 48;
                
                num1 = aux % 10;
                
                num2 = (int) aux / 10;
                
                numerosImpares += num1 + num2;
                
            }
        }
        
        suma = numerosPares + numerosImpares;
        if(suma % 10 != 0){
            
        aux = 10 - (suma % 10);
        
        }else{
            
            aux = 0;
        }
        
        for(int i=0; i<6; i++){
            
            if(sociedad == SOCIEDAD_CIF_LETRA.charAt(i)){
                
                dc = LETRA_CIF[aux - 1];
                
                i = 6;
                
            }else{
                
                dc = (char) (aux + 48);
            }
        }
        
        return dc;
    }//fin método validarDC
    
    /**
     * Método para validar el dni
     * @param dni dni de entrada
     * @return True | False según sea validado u no el dato de entrada.
     */
    public static boolean validarDNI(String dni){
        
        String nif = dni.toUpperCase();
        
        boolean verif = false;
    
        try{
            
            char ldni = nif.toUpperCase().charAt(8);
            
            if(nif.charAt(0) == 'X' || nif.charAt(0) == 'Y' || nif.charAt(0) == 'Z'){
                
                nif = nif.replace("X", "0").replace("Y", "1").replace("Z", "2");
                
            }
            
            int ndni = Integer.parseInt(nif.substring(0,8));
            
            

            if(ldni == validarLetra(ndni)){

                verif = true;

            }
        }catch(NumberFormatException e){
                
        }

        return verif; 

    }//fin método vaidarDNI
    
    /**
     * Método para calcular la letra del DNI.
     * @param numeroDNI numero DNI.
     * @return Letra que corresponde al numero de entrada.
     */
    public static char validarLetra(int numeroDNI){
           
        return LETRA_DNI[numeroDNI % 23];
    }//fin método validarLetra
 
     /**
     * Comprueba que el dato de entrada corresponde a un número de teléfono válido.
     * @param tlf código indentificatorio.
     * @return false | true según sea validado u no el dato de entrada.
     */
    public static boolean validartlf(String tlf){
        
        boolean verif = false;
        
        String regex = "^(6|7|9){1}[0-9]{8}";
        // comprobación de teléfono
        
	Pattern patron = Pattern.compile(regex);
        
        Matcher codigo = patron.matcher(tlf);
        
        if(codigo.find()){
            
            verif = true;
        }
             
        return verif; 
        
    }//fin método validartlf
     
}//fin de la clase ValidarDatos
