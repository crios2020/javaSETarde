package clase01;

import javax.swing.JOptionPane;


/**
 * Clase principal del proyecto
 * @author carlos
 */
public class Clase01 {

    /**
     * Punto de entrada del proyecto
     * @param args parametros ingresados por consola
     */
    public static void main(String[] args) {
        /*
        Curso: Java Standard Web Programming 11.X
        Duración: 40 hs
        Días: Martes y Jueves 15:00 a 18:00 hs.
        Profe: Carlos Ríos      carlos.rios@educacionit.com
        
        Materiales: alumni.educacionit.com  
                    user: email
                    pass: dni
        
        github: https://github.com/crios2020/javaSETarde
        
        Software:   JDK(Java Development Kit)
              
        IDE: Eclipse, Netbeans, Spring tools Suite
        
        LTS: Long Term Support          (8 años)
        
        JDK 8 LTS   hasta Marzo 2022
        JDK 11 LTS  hasta Septiembre 2026
        JDK 17 LTS  hasta Septiembre 2029
        
        */
        
        System.out.println(System.getProperty("java.version"));
        
        /*
            Bloque de comentarios
        */
        
        // comentarios de una sola linea
        
        /**
         * Comentario JavaDOC
         * Es un comentario que es visible por fuera de los binarios.
         * Se debe colocar este comentario, delante de la declaración de métodos o clases.
         */
        
        //Tipo de datos primitivos
        
        //Tipo de datos enteros
        
        //Tipo de datos boolean         1 byte
        boolean bo=true;
        bo=false;
        System.out.println(bo);
        
        
        //Tipo de datos byte            1 byte
        byte by=100;
        System.out.println(by);
        
        
        //Tipo de datos short           2 bytes
        short sh=20000;
        System.out.println(sh);
        
        //Tipo de datos int             4 bytes
        int in=2000000000;
        System.out.println(in);
        
        //Tipo de datos long            8 bytes
        long lo=3000000000L;
        System.out.println(lo);
        
        
        //Tipo datos float              32 bits
        float fl=8.75f;
        System.out.println(fl);
        
        //Tipo de datos double          64 bits
        double dl=8.75;
        System.out.println(dl);
                
        
        fl=10;
        dl=10;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        
        fl=100;
        dl=100;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        
        // Tipo de datos char unicode  2 bytes
        char car=65;
        System.out.println(car);
        car+=32;
        System.out.println(car);
        car='h';
        System.out.println(car);
        
        // clase String
        String st="hola";
        System.out.println(st);
        
        /*
        
        JDK 9:          String st="hola";           private final char[] value;     8 bytes    
            
        JDK 10 o sup:   String st="hola";           private final byte[] value;     4 bytes
        
        */
       
        String texto="Esto es una cadena de texto!";
        System.out.println(texto);
        
        //recorrer la cadena texto
        for(int a=0;a<texto.length();a++) System.out.print(texto.charAt(a));
        System.out.println();
        
        //imprimir cadena de texto en mayusculas
        for(int a=0;a<texto.length();a++){
            char c=texto.charAt(a);
            if(c>=97 && c<=122) c-=32;
            System.out.print(c);
        }
        System.out.println();
        
        
        //Operador ternario ?
        for(int a=0;a<texto.length();a++){
            char c=texto.charAt(a);
            System.out.print((c>=97 && c<=122)?c-=32:c);
        }
        System.out.println();
        
        //imprimir cadena de texto en minusculas
        for(int a=0;a<texto.length();a++){
            char c=texto.charAt(a);
            System.out.print((c>=65 && c<=90)?c+=32:c);
        }
        System.out.println();
        
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        
        
        JOptionPane.showMessageDialog(null, "Hola Mundo!");
        
        
        
        
    }
    
}
