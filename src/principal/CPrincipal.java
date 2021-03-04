
package principal;

import estructuraDatos.*;
import estructuraDatos.Enumerados.*;
import utilidades.*;

/**
 *  Clase principal para la aplicación Botica
 * @author Ana Muñiz
 * @version 1.0
 */
public class CPrincipal {
    
    private final static int NUMERO_CLIENTES = 50; //50
    private final static int NUMERO_PRODUCTOS = 40; //40
    
    private static int contadorClientes = 0;

    private static Cliente[] clientes;
    private static Producto[] productos;
    
    /**       CONSTRUCTOR       */
    
    /**
     * Constructor por defecto de la clase CPrincipal.
     */
    CPrincipal(){
        
    }
    
    /**        MÉTODOS DE MENÚ         */
    
    /**
     * Método que pide al usuario elegir entre gestionar clientes o gesionar productos
     */
    public static void menu() {
       
       byte option;
       
        do{    
            IO_ES.escribirLN(Color.AZUL + "\n\n -------------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "\n --       MENÚ PRINCIPAL      --" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "\n -------------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "0. Salir" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "1. GESTIONAR CLIENTES" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "2. GESTIONAR PRODUCTOS" + Color.RESET);

            option=IO_ES.leerByte(Color.AZUL + "Elija una opción: "+ Color.RESET, 0, 2);




                switch(option){
                    case 0:
                      /**OPCIÓN 0: SALIR*/

                        break;

                    case 1:
                      /**OPCIÓN 1: GESTIONAR CLIENTES*/

                        menuCliente();

                        break;

                    case 2:
                      /**OPCIÓN 2: GESTIONAR PRODUCTOS*/

                        menuProducto();

                        break;
                        
                }

           }while(option!=0);

   }//fin del método menu().
    
    /**
     * Método que pide al usuario elegir entre las diferentes opciones para gestionar clientes.
     */
    public static void menuCliente() {
        
       byte option;
       
       do{  
           
            IO_ES.escribirLN("");
            IO_ES.escribirLN(Color.CYAN + "\n        GESTIÓN DE CLIENTES    " + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "-----------------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "1. VER CLIENTE" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "2. AÑADIR CLIENTES" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "3. MODIFICAR CLIENTE" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "4. DAR CLIENTE DE BAJA" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN+ "0. Volver al menú principal" + Color.RESET);
            
            option=IO_ES.leerByte(Color.CYAN + "Elija una opción: " + Color.RESET, 0, 4);        

                        
                switch(option){
                            
                    case 0:
                        /**OPCIÓN 0: VOLVER*/

                            break;

                    case 1:
                        /**OPCIÓN 1: VER CLIENTES*/
                            
                            visualizarClientes();                                
                                
                            break;

                    case 2:
                        /**OPCIÓN 2: AÑADIR CLIENTE*/
                                
                            anadirCliente();
                
                            break;
                            
                    case 3:
                        /**OPCIÓN 3: MODIFICAR CLIENTE*/
                        
                            modificarCliente();
                                
                            break;
                             
                    case 4:
                        /**OPCIÓN 4: BORRAR CLIENTE*/
                        
                            bajaCliente();

                            break;

                }//fin del switch
                        
        }while(option != 0);
        
    }//fin del método menuCliente().
    
    /**
     * Método que pide al usuario elegir entre las diferentes opciones para gestionar productos.
     */
    public static void menuProducto() {
        
       byte option;
       
       do{
                
            IO_ES.escribirLN(Color.CYAN + "" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "     GESTIÓN DE PRODUCTOS   " + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "-----------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN+ "0. Volver al menú principal" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "1. VER PRODUCTOS" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "2. AÑADIR PRODUCTO" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "3. MODIFICAR PRODUCTO" + Color.RESET);
            IO_ES.escribirLN(Color.CYAN + "4. BORRAR PRODUCTO" + Color.RESET);

            option = IO_ES.leerByte(Color.CYAN + "Elija una opción: " + Color.RESET, 0, 4);        

            switch(option){

                  case 0:
                     /**OPCIÓN 0: VOLVER*/

                     break;

                 case 1:
                     /**OPCIÓN 1: VER PRODUCTOS*/

                        menuVisualizarProductos();                               

                         break;

                 case 2:
                     /**OPCIÓN 2: AÑADIR PRODUCTO*/
                         menuAnadirProducto();                

                          break;

                 case 3:
                     /**OPCIÓN 3: MODIFICAR PRODUCTO*/

                         modificarProducto();

                         break;

                 case 4:
                     /**OPCIÓN 4: BORRAR PRODUCTO*/

                         borrarProducto();

                          break;
            }


        }while(option != 0);
        
    }//fin del método menuProducto().
    
    /**
     * Método que pide al usuario elegir entre los diferentes tipos de productos.
     */
    public static void menuAnadirProducto(){
        byte option;
       
        do{
                
            IO_ES.escribirLN(Color.MAGENTA + "" + Color.RESET);
            IO_ES.escribirLN(Color.MAGENTA + "     AÑADIR PRODUCTOS   " + Color.RESET);
            IO_ES.escribirLN(Color.MAGENTA + "-----------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.MAGENTA + "0. Volver al menú Gestionar Productos" + Color.RESET);
            IO_ES.escribirLN(Color.MAGENTA + "1. AÑADIR MEDICAMENTO" + Color.RESET);
            IO_ES.escribirLN(Color.MAGENTA + "2. AÑADIR PRODUCTO DE PARAFARMACIA" + Color.RESET);

            option = IO_ES.leerByte(Color.MAGENTA + "Elija una opción: " + Color.RESET, 0, 2);        

            switch(option){

                case 0:
                    /**OPCIÓN 0: VOLVER*/

                    break;

                case 1:
                    /**OPCIÓN 1: AÑADIR MEDICAMENTO*/
                    anadirProducto(1);

                    break;

                case 2:
                    /**OPCIÓN 2: AÑADIR PARAFARMACIA*/
                    anadirProducto(2);                  

                    break;
            }

        }while(option != 0);
        
    }//fin del método menuAnadirProducto().

    /**
     * Menú para modificar los atributos del Cliente
     * @return opción elección
     */
    public static byte menuModificarCliente() {
        
       byte a;
             
       IO_ES.escribirLN(Color.MAGENTA + "\n\n -------------------------------" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "\n --     MODIFICAR CLIENTE    --" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "0. Volver" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "1. MODIFICAR NIF" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "2. MODIFICAR NOMBRE" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "3. MODIFICAR DIRECCION" + Color.RESET);
       IO_ES.escribirLN(Color.MAGENTA + "4. MODIFICAR TELÉFONO" + Color.RESET);

       a=IO_ES.leerByte(Color.MAGENTA + "Elija una opción: " + Color.RESET, 0, 4);        
       
       return a;
        
    }//fin del método menuModificarCliente().
    
    /** Menú para modificar los atributos del Producto
     * @param clase especifica si es medicamento o parafarmacia
     * @return opcion elegida.
     */
    public static byte menuModificarProducto(byte clase) {
 
       byte option;

        IO_ES.escribirLN("");
        IO_ES.escribirLN(Color.AZUL + "\n ------->   MODIFICAR PRODUCTO   " + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "0. Volver" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "1. MODIFICAR CÓDIGO" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "2. MODIFICAR NOMBRE" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "3. MODIFICAR DESCRIPCIÓN" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "4. MODIFICAR PRECIO" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "5. AÑADIR UNIDADES" + Color.RESET);
        IO_ES.escribirLN(Color.AZUL + "6. QUITAR UNIDADES" + Color.RESET);
        
        if(clase == 0){
            
            IO_ES.escribirLN(Color.AZUL + "7. MODIFICAR TIPO" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "8. MODIFICAR COMO TOMARLO" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "9. MODIFICAR EFECTOS ADVERSOS" + Color.RESET);
            
        }
        if(clase == 1){
            IO_ES.escribirLN(Color.AZUL + "7. MODIFICAR CATEGORÍA" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "8. MODIFICAR DOSIS POR UNIDAD" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "9. MODIFICAR DESCUENTO" + Color.RESET);
            
        }

        option = IO_ES.leerByte(Color.AZUL + "Elija una opción: " + Color.RESET, 0, 9);        

       return option;
 
    }//fin del método menuModificarProducto().
    
    /**
     * Menú para visualizar los atributos del Producto
     */
    public static void menuVisualizarProductos(){
        byte option;
       
       do{
                
            IO_ES.escribirLN(Color.AZUL + "" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "     VISUALIZAR PRODUCTOS   " + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "-----------------------------" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "0. Volver al menú Gestionar Productos" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "1. VER TODOS LOS PRODUCTOS" + Color.RESET);
            IO_ES.escribirLN(Color.AZUL + "2. VER DE UNO EN UNO" + Color.RESET);

            option = IO_ES.leerByte(Color.CYAN + "Elija una opción: " + Color.RESET, 0, 2);        

            switch(option){

                case 0:
                    /**OPCIÓN 0: VOLVER*/

                    break;

                case 1:
                    /**OPCIÓN 1: VER TODOS*/
                    visualizarProducto();

                    break;

                case 2:
                    /**OPCIÓN 2: VER DE UNO EN UNO*/
                    visualizarProductosIndividualmente();                 

                    break;
            }

        }while(option != 0);
    }

    /** MÉTODOS DE GESTION DE CLIENTES */ 
    
    /**
     * Método para añadir clientes en el array clientes
     */
    public static void anadirCliente(){
        String nif;
        
        String nombre;
        
        String direccion;
        
        String tlf;
        
        int posicion;
        
        int count = 0;
        
        boolean correcto = false;
        
        try{
            
            if(contadorClientes < clientes.length){
               
                posicion = contadorClientes;         
        
                nif = IO_ES.leerCadena("Inserte NIF: ");

                correcto = ValidarDatos.validarNif(nif); //Comprobación del NIF

                if (!correcto){

                    IO_ES.escribirLN(Color.ROJO + "NIF incorrecto." + Color.RESET);

                }else{
                    
                    if (!buscarCliente(nif)){
                    
                        nombre = IO_ES.leerCadena("Insertar nombre: ");

                        direccion = IO_ES.leerCadena("Inserte su dirección: ");
                        
                        do{
                            tlf = IO_ES.leerCadena("Insertar tlf: ", 9, "Teléfono incorrecto. [Introduzca el teléfono sin prefijo telefónico internacional]");

                            correcto = false;

                            correcto = ValidarDatos.validartlf(tlf);

                            if (!correcto){

                                IO_ES.escribirLN(Color.ROJO + "Teléfono incorrecto" + Color.RESET);

                                count ++;
                                
                                if(count == 2){
                                    IO_ES.escribirLN(Color.ROJO + "Ha agotado todas sus oportunidades" + Color.RESET);
                                    
                                    IO_ES.escribirLN(Color.ROJO + "--> CLIENTE NO CREADO " + Color.RESET);
                                }
                                
                            }else{

                                clientes[posicion] = new Cliente(nif, nombre, direccion, tlf);  //Creación del objeto cliente

                                contadorClientes++; 
                                
                                IO_ES.escribirLN(Color.VERDE + "--> CLIENTE CREADO " + Color.RESET);

                            }//fin segundo if-else.
                            
                        }while(!correcto && count < 2 ); //fin del bucle do-while
                        
                    }else{
                        
                        IO_ES.escribirLN(Color.ROJO + "El cliente ya existe" + Color.RESET);
                        
                        
                    
                    }//fin segundo if-else

                }//fin primer if-else 
  
           }else{
            
                IO_ES.escribirLN(Color.ROJO + "No se pueden registrar más clientes" + Color.RESET);
            }
            
//fin del primer condicional if
        
        }catch(ArrayIndexOutOfBoundsException e){
                                    
            IO_ES.escribirLN(Color.ROJO + "No se pueden registrar más clientes" + Color.RESET);
                                   
        }//fin del catch
        
    }//fin del método anadirCliente().
  
    /**
     * Método para modificar los diferentes atributos del objeto cliente indicado. 
     */
    public static void modificarCliente(){
        
        int posicion;
        
        byte option;
        
        boolean option2;
        
        boolean correcto = false;
        
        String valor;

        try{

            posicion = buscarPosicionCliente(); //Buscamos la posición del cliente en el array.
     
            if(posicion >= 0 && posicion < clientes.length){

                do{

                    option = menuModificarCliente();  //Impresión del menú por pantalla.

                    switch(option){
                        case 0:
                            //OPCIÓN 0: Volver
                            break;

                        case 1:
                            //OPCIÓN 1: MODIFICAR NIF
                            valor= IO_ES.leerCadena("Inserte NIF nuevo: ");

                            correcto = ValidarDatos.validarNif(valor); //Comprobación del NIF

                            if (!correcto){

                                IO_ES.escribirLN(Color.ROJO + "NIF incorrecto." + Color.RESET);

                            }else{
                                
                                
                                
                                if(buscarCliente(valor)){
                                    
                                    option2 = IO_ES.leerBooleano("El nombre es: " + valor + " ¿Es correcto?");
                                
                                    if(option2){

                                        clientes[posicion].setNombre(valor);

                                        IO_ES.escribirLN(Color.VERDE +"--->NOMBRE GUARDADO." + Color.RESET);

                                    }
                                    
                                }else{
                                    
                                    IO_ES.escribirLN(Color.ROJO + "El NIF ya existe." + Color.RESET);
                                    
                                }
                               
                            }// fin del condicional if-else
                            
                            break;

                        case 2:
                            //OPCIÓN 2: MODIFICAR NOMBRE
                            
                            valor= IO_ES.leerCadena("Introduzca nombre nuevo: ");

                                                            
                            option2 = IO_ES.leerBooleano("El nombre es: " + valor + " ¿Es correcto?");
                                
                            if(option2){
                            
                                clientes[posicion].setNombre(valor);
                                
                                IO_ES.escribirLN(Color.VERDE +"--->NOMBRE GUARDADO." + Color.RESET);
                                
                            }

                            break;

                        case 3:
                            //OPCIÓN 3: MODIFICAR DIRECCIÓN
                            
                            valor= IO_ES.leerCadena("Introduzca dirección nueva: ");

                                                            
                            option2 = IO_ES.leerBooleano("La dirección es: " + valor + " ¿Es correcta?");
                                
                            if(option2){
                            
                                clientes[posicion].setDireccion(valor);
                                
                                IO_ES.escribirLN(Color.VERDE + "--->DIRECCIÓN GUARDADA." + Color.RESET);
                                
                            }
                            
                            break;

                        case 4:
                            //OPCIÓN 4: MODIFICAR TELEFONO
                            valor= IO_ES.leerCadena("Inserte telefono nuevo: ");

                            correcto = ValidarDatos.validartlf(valor); //Comprobación del NIF

                            if (!correcto){

                                IO_ES.escribirLN(Color.ROJO + "Teléfono incorrecto." + Color.RESET);

                            }else{
                                
                                option2 = IO_ES.leerBooleano("Nuevo teléfono: " + valor + "¿Está de acuerdo?");
                                
                                if(option2){
                            
                                clientes[posicion].setTelefono(valor);
                                
                                IO_ES.escribirLN(Color.VERDE +"--->TELEFONO GUARDADO." + Color.RESET);
                                
                                }
                            }
                            
                            break;

                    }//fin del switch

                }while(option != 0); //fin del do-while
            }
        } catch (ArrayIndexOutOfBoundsException e){
                                    
            IO_ES.escribirLN(Color.ROJO + "El cliente no existe." + Color.RESET);
            
        }//fin del catch
        
    }//fin del método modificarCliente().
    
    /**
     * Método para dar de baja a un objeto cliente indicado.
     */
    public static void bajaCliente(){
        int posicion;
        
        boolean confirmacion;
 

            posicion = buscarPosicionCliente();

            if(posicion >= 0 && posicion < clientes.length){
                
                
                confirmacion = IO_ES.leerBooleano("¿Está seguro de dar de baja a " + clientes[posicion].getId() + " ?");
                
                if(confirmacion){
                    
                    clientes[posicion].setBaja(true);

                    IO_ES.escribirLN(Color.VERDE + "--> CLIENTE DADO DE BAJA." + Color.RESET);
                
                }//fin delif

            }else{
                
                IO_ES.escribirLN(Color.ROJO + "El cliente no existe" + Color.RESET);
                
            }//fin del if-else

        
    }//fin del método bajaCliente()
    
    /**
     * Método que busca un objeto Cliente dado en el array clientes y devuelve su posición
     * @return posicion posición del objeto dentro del array.
     */
    public static int buscarPosicionCliente(){
        
        int posicion = -1;
        String nif;

        try{
            nif = IO_ES.leerCadena("Indique NIF del cliente: ");
            
            for(int i=0; i<clientes.length; i++){
            
            if(clientes[i].getId().equalsIgnoreCase(nif)){
                
                posicion = i;
                i=clientes.length;
                
            }
            
        }
        }catch(NullPointerException e){
            
            IO_ES.escribirLN(Color.ROJO + "El cliente no existe." + Color.RESET);
        }//fin del catch
        
        return posicion;
    }//fin del método
    
    /**
     * Metodo para la visualizacion de arrays de objetos Cliente
     */
    public static void visualizarClientes(){
        
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        IO_ES.escribirLN(" LISTA DE CLIENTES"); 
        IO_ES.escribirLN("----------------------------------");
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        
        try{
            
        for(int i=0; i < clientes.length; i++){
            
            if(clientes[i].getBaja() == false){
                
                IO_ES.escribirLN(clientes[i] + "");  //Imprimir el método toString del objeto.
                IO_ES.escribirLN("");             //Generar un salto de línea para una mejor visualización
            
            }//fin del condicional if
                        
        }//fin del bucle for
        
        }catch(NullPointerException e){
            
        }
        
    }//fin del método
    
    /**     MÉTODOS DE GESTIÓN DE PRODUCTOS   .*/
    
    /**
     * Metodo para la visualizacion de arrays de productos
     */
    public static void visualizarProducto(){
        
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        IO_ES.escribirLN(" LISTA DE PRODUCTOS"); 
        IO_ES.escribirLN("----------------------------------");
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        
        for(int i=0; i < productos.length; i++){
            
            if(productos[i] != null){
                
                IO_ES.escribirLN(productos[i] + "");  //Imprimir el método toString del objeto.
                IO_ES.escribirLN("");             //Generar un salto de línea para una mejor visualización
            
            }//fin del condicional if
                        
        }//fin del bucle for
        
    }//fin del método
    
    public static void visualizarProductosIndividualmente(){
        /** Variable auxiliar */
        int i = 0;
        byte option;
        
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        IO_ES.escribirLN(" PRODUCTOS"); 
        IO_ES.escribirLN("----------------------------------");
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        
        while(i < productos.length){
            
            if(productos[i] != null){
                
                IO_ES.escribirLN(productos[i] + "");  //Imprimir el método toString del objeto.
                IO_ES.escribirLN("");             //Generar un salto de línea para una mejor visualización
                
                option = IO_ES.leerByte("0. Atrás | 1.Siguiente", 0,1);

                IO_ES.escribirLN("");

                if(option == 0) i = (int) productos.length;
                        
                
            
            }//fin del condicional if
            
            i++;
                        
        }//fin del bucle for
        
        
    }
    
    /**
     * Metodo para añadir productos en el array productos
     * @param tipo 1.Medicamento 2.Parafarmacia
     */
    public static void anadirProducto(int tipo){
        //ATRIBUTOS NO COMUNES
        
        TipoMedicamento tipoMedicamento;
        String comoTomar, efectosAdversos;
        
        Categoria categoria;
        
        int dosisUnidad;
        
        float descuento;
        
        //ATRIBUTOS COMUNES
        int posicion, unidades;
                
        String codigo, nombre, descripcion;
        
        float precio;
        
        //Variables auxiliares
        String cadena;
        
        //Busca posición vacía del array
        posicion = buscarElementeNull(productos);
        
        if(posicion != -1 && posicion < NUMERO_PRODUCTOS){

            codigo= IO_ES.leerCadena("Inserte código del producto: ");               

            nombre = IO_ES.leerCadena("Insertar nombre: ");
            
            descripcion = IO_ES.leerCadena("Insertar descripción: ");
                        
            precio = IO_ES.leerReal("Insertar precio: ");

            unidades = IO_ES.leerInteger("Insertar unidades: ");
            
            switch(tipo){
            
                case 1:
                    /* CASO 1: MEDICAMENTO */
                    
                    try{

                        tipoMedicamento = elegirEnumMedicamento();

                        comoTomar = IO_ES.leerCadena("¿Cómo tomar?: ");

                        descripcion = IO_ES.leerCadena("Efectos Adversos: ");

                        productos[posicion] = new Medicamento(codigo,nombre,descripcion,precio,unidades,tipoMedicamento, comoTomar, descripcion); // Creación del objeto producto
                    
                    } catch(IllegalArgumentException e){
                
                        System.out.println(Color.ROJO + "El tipo de medicamento elegido no existe." + Color.RESET);

                    }
                    break;

                case 2:
                    /* CASO 2: PARAFARMACIA*/
                    
                    categoria = elegirEnumCategoria();              

                    dosisUnidad = IO_ES.leerInteger("Dosis por unidad: ");

                    descuento = IO_ES.leerReal("descuento: ");
                    
                    productos[posicion] = new ParaFarmacia(codigo,nombre,descripcion,precio,unidades, categoria, dosisUnidad, descuento); // Creación del objeto producto

                    break;
            }
            
            if(productos[posicion] != null){
                  
                IO_ES.escribirLN(Color.VERDE + "--> PRODUCTO AÑADIDO." + Color.RESET);
            }
                                
        }else{
                
                IO_ES.escribirLN(Color.ROJO + "No puede añadir más productos." + Color.ROJO);
            
        }//fin del condiconal if
                                    
    }//fin del método anadirProducto().
    
    /**
     * Método para modificar los diferentes atributos del objeto Producto indicado.
     */
    public static void modificarProducto(){
        
        int posicion = 0;
        
        byte option;
        
        byte clase = 0;
        
        boolean option2 = false, correcto = false;
        
        String id, codigo;
        
        float cantidad;
        
        Medicamento medicamento = null;
        
        ParaFarmacia parafarmacia = null;
            
            codigo = IO_ES.leerCadena("Indique código del producto: ");
            
            posicion = buscarPosicionProducto(0,codigo);
            
            if(posicion == -1){
                
                IO_ES.escribirLN(Color.ROJO + "El producto no existe." + Color.RESET);
                
            }else{

                do{
                                        
                    IO_ES.escribirLN(productos[posicion] + ""); //Visualizar producto.

                    option2 = IO_ES.leerBooleano("¿Desea modificar el producto: " + codigo + "? ");

                    IO_ES.escribirLN("");

                    if(!option2) posicion = buscarPosicionProducto(posicion+1,codigo);

                    if(posicion == -1){
                        
                        posicion = NUMERO_PRODUCTOS;  //No se encuentra el producto --> salir del do-while;
                        
                    }
                        
                }while(codigo.equalsIgnoreCase("X") && !option2 && posicion < NUMERO_PRODUCTOS);

                
                if(option2){
                    
                    do{
                        if(productos[posicion].getClass() == Medicamento.class){
                            clase = 0;
                            medicamento = (Medicamento) productos[posicion];
                        } 

                        if(productos[posicion].getClass() == ParaFarmacia.class){
                            clase = 1;
                            parafarmacia = (ParaFarmacia) productos[posicion];
                        } 
                        
                        option = menuModificarProducto(clase);
                        
                        switch(option){
                            case 0:
                                //OPCIÓN 0: Volver
                                break;

                            case 1:
                                //OPCIÓN 1: MODIFICAR CÓDIGO
                                productos[posicion].setCodigo(IO_ES.leerCadena("Introduzca código nuevo: "));
                                break;

                            case 2:
                                //OPCIÓN 2: MODIFICAR NOMBRE
                                productos[posicion].setNombre(IO_ES.leerCadena("Introduzca nombre nuevo: "));
                                break;

                            case 3:
                                //OPCIÓN 3: MODIFICAR DESCRIPCIÓN
                                productos[posicion].setDescripcion(IO_ES.leerCadena("Introduzca descripción nueva: "));
                                break;

                            case 4:
                                //OPCIÓN 4: MODIFICAR PRECIO
                                
                                    cantidad = IO_ES.leerReal("Introduzca precio nuevo: ");

                                    productos[posicion].setPrecio(cantidad);

                                break;

                            case 5:
                                //OPCIÓN 5: AÑADIR UNIDADES

                                    cantidad = IO_ES.leerInteger("Introduzca cantidad a añadir: ");

                                    correcto = productos[posicion].anadirUnidades((int) cantidad);
                                    
                                    if(correcto) IO_ES.escribirLN(Color.VERDE + "-->CANTIDAD AÑADIDA" + Color.RESET); else IO_ES.escribirLN(Color.ROJO + "Cantidad no válida." + Color.RESET);

                                break;

                            case 6:
                                //OPCIÓN 5: QUITAR UNIDADES
                               
                                    cantidad = IO_ES.leerInteger("Introduzca cantidad a restar: ");

                                    correcto = productos[posicion].quitarUnidades((int) cantidad);
                                    
                                    if(correcto) IO_ES.escribirLN(Color.VERDE + "-->CANTIDAD QUITADA" + Color.RESET); else IO_ES.escribirLN(Color.ROJO + "Cantidad no válida." + Color.RESET);


                                break;
                            
                            case 7:
                                //OPCIÓN 7: MODIFICAR TIPO/CATEGORÍA
                                    if(clase == 0){
                                        medicamento.setMedicamento(elegirEnumMedicamento());
                                    }else{
                                        parafarmacia.setCategoria(elegirEnumCategoria());
                                    }

                                break;

                            case 8:
                                //OPCIÓN 8: MODIFICAR COMO TOMAR/DOSISUNIDAD

                                    if(clase == 0){
                                        
                                        medicamento.setComoTomar(IO_ES.leerCadena("Introduzca como tomar: "));
                                        
                                    }else{                                        
                                        parafarmacia.setDosisUnidades(IO_ES.leerInteger("Introduzca dosis por unidad: "));
                                    }

                                break;

                            case 9:
                                //OPCIÓN 9: MODIFICAR EFECTOS ADVERSOS/DESCUENTO
                               
                                    if(clase == 0){

                                        medicamento.setEfectosAdversos(IO_ES.leerCadena("Introduzca efectos adversos: "));
                                        
                                    }else{
                                        
                                        parafarmacia.setDescuento(IO_ES.leerInteger("Introduzca descuento: "));
                                    }

                                break;

                            }//fin del switch
                    
                        
                    }while(option != 0); //fin del primario do-while
            
                }else{
                        
                        IO_ES.escribirLN("-->NO HAY MÁS PRODUCTOS.");
                        
                }//fin del condiconal if-else
            }
    }//fin del método modificarProducto().
   
    /**
     * Método para eliminar un objeto Producto indicado.
     */
    public static void borrarProducto(){
         
        int posicion;
        
        String codigo;
        
        boolean confirmacion = false;
        
        codigo = IO_ES.leerCadena("Indique código del producto: ");

        posicion = buscarPosicionProducto(0,codigo);
            
        if(posicion == -1){
                
            IO_ES.escribirLN(Color.ROJO + "El producto no existe" + Color.RESET);
                
        }else{

                do{

                    IO_ES.escribirLN(productos[posicion] + ""); //Visualizar producto.
                    
                    confirmacion = IO_ES.leerBooleano("¿Está seguro de eliminar a " + productos[posicion].getCodigo() + " ?");

                    IO_ES.escribirLN("");

                    if(!confirmacion) posicion = buscarPosicionProducto(posicion+1,codigo);

                    if(posicion == -1){
                        
                        posicion = NUMERO_PRODUCTOS;  //No se encuentra el producto --> salir del do-while;
                        
                        IO_ES.escribirLN("No hay más productos");
                        
                    }
                        
                }while(codigo.equalsIgnoreCase("X") && !confirmacion && posicion < NUMERO_PRODUCTOS);

        } 
 
        if(confirmacion){
                    
                productos[posicion]= null;

                IO_ES.escribirLN(Color.VERDE + "--> PRODUCTO ELIMINADO." + Color.RESET);
                
        }//fin delif

        
    }//fin del método

    /**
     *  Método que busca un objeto Producto dado en el array clientes y devuelve su posición
     * @param pos posicion en la que iniciar la búsqueda
     * @param codigo codigo del producto a buscar
     * @return posicion del producto elegido (-1 si no lo encuentra)
     */
    public static int buscarPosicionProducto(int pos, String codigo){
        
        int posicion = -1;
       
        
        
        if(pos >= 0 && pos < productos.length) {    
                
            for(int i=pos; i<productos.length; i++){

                try{
                    
                    if(productos[i].getCodigo().equalsIgnoreCase(codigo)){

                        posicion = i;
                        
                        i=productos.length;

                    }//fin del condicional if
                    
                }catch(NullPointerException e){

                           //ELEMENTO NULL

                }//fin del try-catch
                
            } //fin del bucle for
                
        }//fin condiconal if
            
        
        
        return posicion;
        
    }//fin del método buscarPosicionProducto().
    

    /**
     * Método para comprobar si un cliente ya existe
     * @param dni dni del cliente a buscar
     * @return true | false
     */
    public static boolean buscarCliente(String dni){
        
        boolean correcto = false;
        
        for(int i=0; i < contadorClientes; i++){
        
            if(clientes[i].getId().equalsIgnoreCase(dni)){

                i = productos.length;

                correcto = true;

            }
            
        }
        
        return correcto;
    }
    
    /**
     * Método para elegir el tipo de Medicamento
     * @return opción elegida
     */
    public static TipoMedicamento elegirEnumMedicamento(){
        byte option;
        
        TipoMedicamento resultado = null;
        
        final String tipoMedicamento[] = {null, "ANALGESICOS", "LAXANTES", "ANTIINFRACCIOSOS", "ANTIDEPRESIVOS", "ANTITUSIVOS", "MUCOLITICOS", "ANTIACIDOS", "ANTIULCEROSOS", "ANTIALERGICOS", "ANTIFIARREICOS"}; 
            
        for(int i=1; i<tipoMedicamento.length; i++){
            IO_ES.escribir( i +". " + tipoMedicamento[i] + ", ");
                
            if(i==5) IO_ES.escribirLN("");
        }
        
        IO_ES.escribirLN("");   

        option = IO_ES.leerByte("Elija un tipo: ", 1, 10); 
            
        resultado = TipoMedicamento.valueOf(tipoMedicamento[option]);
 
        return resultado;

    }
    
     /**
     * Método para elegir la categoria.
     * @return opción elegida
     */
    public static Categoria elegirEnumCategoria(){
        
        byte option;
        
        Categoria resultado = null;
        
        final String categoria[] = {null, "DENTAL", "FACIAL", "GELES", "CORPORAL", "CABELLO", "ANTIMOSQUITOS", "INTIMA", "NASAL", "OCULAR", "BOTIQUIN", "OIDOS", "TOALLITAS", "LIMPIEZA", "HOGAR", "MASCARILLAS"}; 
 
        IO_ES.escribirLN(Color.CYAN + "" + Color.RESET);
        for(int i=1; i<categoria.length; i++){
            IO_ES.escribir(Color.CYAN + i +". " + categoria[i] + ", " + Color.RESET);
                
            if(i==5) IO_ES.escribirLN("");
        }
        IO_ES.escribirLN("");   

        option = IO_ES.leerByte(Color.CYAN + "Elija un tipo: " + Color.RESET, 1, 10); 
            
        resultado = Categoria.valueOf(categoria[option]);
 
        return resultado;

    }
    
    /**   OTROS MÉTODOS   */
    
    /**
     * Metodo para la visualizacion de arrays de objetos
     * @param array array de objetos a visualizar
     */
    public static void visualizar(Object[] array){
        
        IO_ES.escribirLN(""); //Generar un salto de línea para una mejor visualización
        
        for(int i=0; i < array.length; i++){
            
            if(array[i] != null){
                
                IO_ES.escribirLN(array[i] + "");  //Imprimir el método toString del objeto.
                IO_ES.escribirLN("");             //Generar un salto de línea para una mejor visualización
            
            }//fin del condicional if
                        
        }//fin del bucle for
        
    }//fin del método
    
    /**
     * Método para buscar un elemento nulo en un array dado
     * @param array array dado
     * @return posicion del elemento (-1 si no lo encuentra).
     */
    public static int buscarElementeNull(Object[] array){

        int posicion = -1;


        for(int i=0; i<array.length; i++){

            if(array[i] == null){
                    
                posicion = i;
                    
                i = array.length; 
                
            }

        }
            


        return posicion;
    } 
    
    /**
     * Método main de la clase CPrincipal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clientes = new Cliente[NUMERO_CLIENTES];
        productos = new Producto[NUMERO_PRODUCTOS];
        
        String archivo = IO_ES.leerArchivo("archivo.txt");
        System.out.println(archivo);
        menu();    
             
        IO_ES.escribirLN("");
	IO_ES.escribirLN("Fin del programa. Bye!");
        
    } //cierre del método main
    
} //cierre de la clase      