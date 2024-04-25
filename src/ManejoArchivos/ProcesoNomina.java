package ManejoArchivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProcesoNomina {
    public ArrayList<String> BuscarDatosCoop(String id) {
        File f = new File("D:\\DB\\Cooperativa.txt");
        Scanner s;
        boolean encontrado = false;

        try {

            if (f.exists()) {
                s = new Scanner(f);
                ArrayList<String> Datos = new ArrayList<>();

                Datos.add(id);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    if (id.equals(s1.next())) {
                        encontrado = true;
                        while (s1.hasNext()) {
                            Datos.add(s1.next());
                        }
                    }
                }
                s.close();

                if (encontrado) {
                    return Datos;
                } else {
                    return null;
                }

            } else {
                JOptionPane.showMessageDialog(null, "No existe el archivo de Cooperativa");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

        return null;
    }
    
    public boolean BuscarFechaNómina(int MesIndex, int Año) {
        boolean encontrado = false;
        Scanner s;
        try {
            File f = new File("D:\\DB\\Nominas.txt");

            if (!f.exists()) {
                f.createNewFile();
                return false;
            } else {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");
                    ArrayList<String> DatosNómina = new ArrayList<>();
                    while (s1.hasNext()) {
                        DatosNómina.add(s1.next());
                    }

                    int MesActual = Integer.parseInt(DatosNómina.get(3));
                    int AñoActual = Integer.parseInt(DatosNómina.get(4));

                    if (MesActual == MesIndex && AñoActual == Año) {
                        encontrado = true;
                    }

                }
                s.close();
                return encontrado;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public String BuscarIDNómina(int MesIndex, int Año){
        String ID = "";
        boolean encontrado = false;
        Scanner s;
        try {
            File f = new File("D:\\DB\\Nominas.txt");

            if (!f.exists()) {
                f.createNewFile();
            } else {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");
                    ArrayList<String> DatosNómina = new ArrayList<>();
                    while (s1.hasNext()) {
                        DatosNómina.add(s1.next());
                    }

                    int MesActual = Integer.parseInt(DatosNómina.get(3));
                    int AñoActual = Integer.parseInt(DatosNómina.get(4));

                    if (MesActual == MesIndex && AñoActual == Año) {
                        ID = DatosNómina.get(0);
                        encontrado = true;
                    }
                }

                s.close();
                
                if(encontrado){
                    return ID;
                } else {
                    return "";
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        return " ";
    }

    public String BuscarDepartamento(String ID) {
        File f = new File("D:\\DB\\Departamentos.txt");

        Scanner s;
        boolean encontrado = false;
        String Departamento = "";
        
        try {
            if (f.exists()) {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    if (ID.equals(s1.next())) {
                        Departamento = s1.next();
                        encontrado = true;
                    }
                }
                s.close();
                
                if(encontrado){
                    return Departamento;
                } else {
                    return "";
                }

            } else {
                f.createNewFile();
                System.out.println("No se encontró el Departamento");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo de Nóminas");
        }
        return "";
    }

    public String BuscarPuesto(String ID) {
        File f = new File("D:\\DB\\Puestos.txt");

        Scanner s;
        boolean encontrado = false;
        String puesto = " ";

        try {
            if (f.exists()) {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    if (ID.equals(s1.next())) {
                        puesto = s1.next();
                        encontrado = true;
                    }
                }
                s.close();

                if(encontrado){
                    return puesto;
                } else {
                    return "";
                }
                
            } else {
                f.createNewFile();
                System.out.println("No se encontró el Puesto");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo de Nóminas");
        }
        return "";
    }
}
