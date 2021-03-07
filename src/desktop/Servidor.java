package desktop;

import java.util.Scanner;


public class Servidor {
    public int numeroPlacasRede;
    
    public PlacaMae pm = new PlacaMae();
    public PlacaVideo pv = new PlacaVideo();
    public HardDisk hd = new HardDisk();
    public Memoria me = new Memoria();
    
    public Servidor() { }
    
    public Servidor(int numeroPlacasRede, PlacaMae pm){
        setNumeroPlacasRede(numeroPlacasRede);
        setPlacaMae(pm);
    }
    
    public Servidor(int numeroPlacasRede, PlacaMae pm, PlacaVideo pv){
        setNumeroPlacasRede(numeroPlacasRede);
        setPlacaMae(pm);
        setPlacaVideo(pv);
    }
    
     public Servidor(int numeroPlacasRede, PlacaMae pm, PlacaVideo pv, HardDisk hd){
        setNumeroPlacasRede(numeroPlacasRede);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
    }  
     
     public Servidor(int numeroPlacasRede, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria me){
        setNumeroPlacasRede(numeroPlacasRede);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setMemoria(me);
    }  
     
     public void setNumeroPlacasRede(int addNumeroPlacasRede){
         if(addNumeroPlacasRede > 0){
            numeroPlacasRede = addNumeroPlacasRede;
         }
     }
     
     public double getNumeroPlacasRede(){
         return numeroPlacasRede;
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
    
     public void cadastrar(int  numeroPlacasRede, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria me){
        setNumeroPlacasRede(numeroPlacasRede);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setMemoria(me);
    }    
     
     public void imprimir(){
         System.out.println("Servidor--------------------");
         System.out.println("Numero de Placas de Rede.: " + getNumeroPlacasRede());
         pm.imprimir();
         pv.imprimir();
         hd.imprimir();
         me.imprimir();
     }
     
     
     public void entradaDados(){
       Scanner entrada7 = new Scanner(System.in);
       System.out.println("Servidor--------------------");
       System.out.println("Numero de Placas de Rede.: " );
       setNumeroPlacasRede(Integer.parseInt(entrada7.nextLine()));
       pm.entradaDados();
       pv.entradaDados();
       hd.entradaDados();
       me.entradaDados();
     }
}
