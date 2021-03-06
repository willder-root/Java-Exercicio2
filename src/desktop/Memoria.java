package desktop;
import java.util.Scanner;

public class Memoria {

    public String marca, modelo, tipo;
    public double preco;
    public int capacidade;

    public Memoria() {
    }

    public Memoria(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public Memoria(String marca, String modelo, String tipo) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
    }

    public Memoria(String marca, String modelo, String Tipo, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(Tipo);
        setPreco(preco);
    }

    public Memoria(String marca, String modelo, String tipo, double preco, int capacidade) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setPreco(preco);
        setCapacidade(capacidade);
    }

    public void setMarca(String addMarca) {
        if (!addMarca.isEmpty()) {
            marca = addMarca;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String addModelo) {
        if (!addModelo.isEmpty()) {
            modelo = addModelo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String addTipo) {
        if (!addTipo.isEmpty()) {
            tipo = addTipo;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setPreco(double addPreco) {
        if (addPreco > 0) {
            preco = addPreco;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setCapacidade(int addCapacidade) {
        if (addCapacidade > 0) {
            capacidade = addCapacidade;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void cadastrar(String marca, String modelo, String tipo, double preco, int capacidade) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setPreco(preco);
        setCapacidade(capacidade);
    }
    
    public void entradaDados(){
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("Marca.: ");
        setMarca(entrada4.nextLine());
        System.out.println("Modelo.: ");
        setModelo(entrada4.nextLine());
        System.out.println("Tipo.: ");
        setTipo(entrada4.nextLine());
        System.out.println("Preço.: ");
        setPreco(Double.parseDouble(entrada4.nextLine()));
        System.out.println("Capacidade.: ");
        setCapacidade(Integer.parseInt(entrada4.nextLine()));
        entrada4.close();
    }
    
    public void imprimir(){
        System.out.println("Marca.: " + getMarca());
        System.out.println("Modelo.: " + getModelo());
        System.out.println("Tipo.: "+ getTipo());
        System.out.println("Preço.: "+ getPreco());
        System.out.println("Capacidade.: " + getCapacidade());
    }
}
