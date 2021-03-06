
package desktop;

public class Memoria {
    public String marca, modelo, tipo;
    public double preco;
    public int capacidade;
  
    public Memoria(){ }

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
   
   public void setPreco(double addPreco){
       if(addPreco > 0){
           preco = addPreco;
       }
   }
   
   public double getPreco(){
       return preco;
   }
   
  public void setCapacidade(int addCapacidade){
      if(addCapacidade > 0){
          capacidade = addCapacidade;
      }
  }
  
  public int getCapacidade(){
      return capacidade;
  }
}

