package desktop;
import java.util.Scanner;

public class PlacaMae {
    public String marca, modelo, tipoProcessador;
    public double preco;
    
    public PlacaMae(){ }
    public PlacaMae(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
    
    public PlacaMae(String marca, String modelo, String tipoProcessador){
        setMarca(marca);
        setModelo(modelo);
        setTipoProcessador(tipoProcessador);
    }
    
    public PlacaMae(String marca, String modelo, String tipoProcessador,
            double preco){
        setMarca(marca);
        setModelo(modelo);
        setTipoProcessador(tipoProcessador);
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
    
    public void setTipoProcessador(String addTiProcessador){
        if(!addTiProcessador.isEmpty()){
            tipoProcessador = addTiProcessador;
        }
    }
    
    public String getTiPoProcessador(){
        return tipoProcessador;
    }
    
    public void setPreco(double addPreco){
        if(addPreco > 0){
            preco = addPreco;
        }
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------Placa Mãe---------------------");
        System.out.println("Marca.: ");
        setMarca(sc.nextLine());
        System.out.println("Modelo.: ");
        setModelo(sc.nextLine());
        System.out.println("Tipo do Processador.: ");
        setTipoProcessador(sc.nextLine());
        System.out.println("Preço.: ");
        setPreco(Integer.parseInt(sc.nextLine()));
        //sc.close();
    }
    
    public void cadastrar(String marca, String modelo, String tipoProcessador,
            double preco){
        setMarca(marca);
        setModelo(modelo);
        setTipoProcessador(tipoProcessador);
        setPreco(preco);
    }
    
    public void imprimir(){
        System.out.println("-------------------Placa Mãe---------------------");
        System.out.println("Marca.: " + getMarca());
        System.out.println("Modelo.: " + getModelo()); 
        System.out.println("Tipo de Processador.: " + getTiPoProcessador());
        System.out.println("Preço.: " + getPreco());
    }
}
