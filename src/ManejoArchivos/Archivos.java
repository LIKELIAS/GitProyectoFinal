package ManejoArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Archivos {
    public void Guardar(String cadena, File archivo){
        try{            
            if(!archivo.exists()){
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "El archivo no existe y sera creado");
            }
            BufferedWriter w = new BufferedWriter(new FileWriter(archivo, true));
            w.write(cadena + "\r\n");
            w.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void ModificarArchivo(){
        
    }
    
    public static void BorrarArchivo(File f){
        try{
            if(f.exists()){
                f.delete();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
}
