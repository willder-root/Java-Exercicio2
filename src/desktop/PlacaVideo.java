package desktop;

import java.util.Scanner;

public class PlacaVideo {
    public String marca, modelo, padrao;
    public double preco;
    
    public PlacaVideo(){ }
    
    public PlacaVideo(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
    
    public PlacaVideo(String marca, String modelo, String padrao){
        setMarca(marca);
        setModelo(modelo);
        setPadrao(padrao);
    }
    
    public PlacaVideo(String marca, String modelo, String padrao, double preco){
        setMarca(marca);
        setModelo(modelo);
        setPadrao(padrao);
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
    
    public void setPadrao(String addPadrao){
        if(!addPadrao.isEmpty()){
            padrao = addPadrao;
        }
    }
    
    public String getPadrao(){
        return padrao;
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
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Marca.: ");
        setMarca(entrada3.nextLine());
        System.out.println("Modelo.: ");
        setModelo(entrada3.nextLine());
        System.out.println("Padrao.: ");
        setPadrao(entrada3.nextLine());
        System.out.println("Preço.: ");
        setPreco(Integer.parseInt(entrada3.nextLine()));
        entrada3.close();
    }
    
    public void cadastrar(String marca, String modelo, String padrao,
            double preco){
        setMarca(marca);
        setModelo(modelo);
        setPadrao(padrao);
        setPreco(preco);
    }
    
    public void imprimir(){
        System.out.println("Marca.: " + getMarca());
        System.out.println("Modelo.: " + getModelo()); 
        System.out.println("Padrão.: " + getPadrao());
        System.out.println("Preço.: " + getPreco());
    }
}
