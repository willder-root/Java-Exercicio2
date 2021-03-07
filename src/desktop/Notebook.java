package desktop;
import java.util.Scanner;

public class Notebook {
    public double peso;
    public PlacaMae pm = new PlacaMae();
    public PlacaVideo pv = new PlacaVideo();
    public HardDisk hd = new HardDisk();
    public Memoria me = new Memoria();
    
    public Notebook() { }
    
    public Notebook(double peso, PlacaMae pm){
        setPeso(peso);
        setPlacaMae(pm);
    }
    
    public Notebook(double peso, PlacaMae pm, PlacaVideo pv){
        setPeso(peso);
        setPlacaMae(pm);
        setPlacaVideo(pv);
    }
    
     public Notebook(double peso, PlacaMae pm, PlacaVideo pv, HardDisk hd){
        setPeso(peso);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
    }  
     
     public Notebook(double peso, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria me){
        setPeso(peso);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setMemoria(me);
    }  
     
     public void setPeso(double addPeso){
         if(addPeso > 0){
             peso = addPeso;
         }
     }
     
     public double getPeso(){
         return peso;
     }
     
    public void setPlacaMae(PlacaMae addPlacaMae) {
        pm = addPlacaMae;
    }

    public PlacaMae getPlacaMae() {
        return pm;
    }

    public void setPlacaVideo(PlacaVideo addPlacaVideo) {
        pv = addPlacaVideo;
    }

    public PlacaVideo getPlacaVideo() {
        return pv;
    }

    public void setHardDisk(HardDisk addHardDisk) {
        hd = addHardDisk;
    }

    public HardDisk getHardDisk() {
        return hd;
    }
    
    public void setMemoria(Memoria addMemoria){
        me = addMemoria;
    }
    
    public Memoria getMemoria(){
        return me;
    }
    
     public void cadastrar(double peso, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria me){
        setPeso(peso);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setMemoria(me);
    }    
     
     public void imprimir(){
         System.out.println("Notbook--------------------");
         System.out.println("Peso.: " + getPeso());
         pm.imprimir();
         pv.imprimir();
         hd.imprimir();
         me.imprimir();
     }
     
     
     public void entradaDados(){
       Scanner entrada6 = new Scanner(System.in);
       System.out.println("Notbook--------------------");
       System.out.println("Peso.: " );
       setPeso(Double.parseDouble(entrada6.nextLine()));
       pm.entradaDados();
       pv.entradaDados();
       hd.entradaDados();
       me.entradaDados();
     }
}
