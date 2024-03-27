package ManejoArchivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Archivos {
    public static void main(String[] arg){
        File f = new File("D:\\DB\\Archivo.txt");
        Scanner s = null;
        try{
            s=new Scanner(f);
            if(!f.exists()){
                f.createNewFile();
                JOptionPane.showMessageDialog(null, "El archivo no existe y sera creado");
            }
            else{
                JOptionPane.showMessageDialog(null, "El archivo existe");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        s.close();
    }
    
    public static void ManejoArchivo(){
        
    }
    
    public static void BorrarArchivo(){
        
    }
    
    public static void Modificar(){
        
    }
}
