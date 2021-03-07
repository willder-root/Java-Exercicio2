
package desktop;
import java.util.Scanner;

public class HardDisk {
    public String marca, modelo, tipo;
    public int capacidade;
    public double preco;
    
    public HardDisk(){ }
    
    public HardDisk(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
    
    public HardDisk(String marca, String modelo, String tipo){
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
    }
    
    public HardDisk(String marca, String modelo, String tipo, int capacidade){
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setCapacidade(capacidade);
    }
    
     public HardDisk(String marca, String modelo, String tipo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
     
     public void setMarca(String addMarca){
         if(!addMarca.isEmpty()){
             marca = addMarca;
         }
     }
     
     public String getMarca(){
         return marca;
     }
     
     public void setModelo(String addModelo){
         if(!addModelo.isEmpty()){
             modelo = addModelo;
         }
     }
     
     public String getModelo(){
         return modelo;
     }
     
     public void setTipo(String addTipo){
         if(!addTipo.isEmpty()){
             tipo = addTipo;
         }
     }
     
     public String getTipo(){
         return tipo;
     }
     
     public void setCapacidade(int addCapacidade){
         if(addCapacidade > 0){
             capacidade = addCapacidade;
         }
     }
     
     public int getCapacidade(){
         return capacidade;
     }
     
     public void setPreco(double addPreco){
         if(addPreco > 0){
             preco = addPreco;
         }
     }
     
     public double getPreco(){
         return preco;
     }
     public void cadastrar(String marca, String modelo, String tipo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
     
     public void entradaDados(){
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("-------------------Hard Disk---------------------");
        System.out.print("Marca.: ");
        setMarca(entrada2.nextLine());
        System.out.print("Modelo.: ");
        setModelo(entrada2.nextLine());
        System.out.print("Tipo.: ");
        setTipo(entrada2.nextLine());
        System.out.print("Capacidade.: ");
        setCapacidade(Integer.parseInt(entrada2.nextLine()));
        System.out.print("Preco.: ");
        setPreco(Double.parseDouble(entrada2.nextLine()));
        //entrada2.close();
     }
     
     public void imprimir(){
         System.out.println("-------------------Hard Disk---------------------");
         System.out.println("Marca.: " +getMarca());
         System.out.println("Modelo.: " +getModelo());
         System.out.println("Tipo.: " +getTipo());
         System.out.println("Capacidde.: " +getCapacidade());
         System.out.println("Preco.: " +getPreco());
     }
}
