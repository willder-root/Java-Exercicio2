package desktop;

import java.util.Scanner;

public class Desktop {

    public String tipoCooler;
    public PlacaMae pm = new PlacaMae();
    public PlacaVideo pv = new PlacaVideo();
    public HardDisk hd = new HardDisk();
    public Memoria slot0 = new Memoria();
    public Memoria slot1 = new Memoria();

    public Desktop() {
    }

    public Desktop(String tipoCooler, PlacaMae pm) {
        setTipoCooler(tipoCooler);
        setPlacaMae(pm);
    }

    public Desktop(String tipoCooler, PlacaMae pm, PlacaVideo pv) {
        setTipoCooler(tipoCooler);
        setPlacaMae(pm);
        setPlacaVideo(pv);
    }

    public Desktop(String tipoCooler, PlacaMae pm, PlacaVideo pv, HardDisk hd) {
        setTipoCooler(tipoCooler);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
    }

    public Desktop(String tipoCooler, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria slot0, Memoria slot1) {
        setTipoCooler(tipoCooler);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setSlot0(slot0);
        setSlot1(slot1);
    }

    public void setTipoCooler(String addTipoCooler) {
        if (!addTipoCooler.isEmpty()) {
            tipoCooler = addTipoCooler;
        }
    }

    public String getTiPoCooler() {
        return tipoCooler;
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

    public void setSlot0(Memoria addSlot0) {
        slot0 = addSlot0;
    }

    public Memoria getSlot0() {
        return slot0;
    }

    public void setSlot1(Memoria addSlot1) {
        slot1 = addSlot1;
    }

    public Memoria getSlot1() {
        return slot1;
    }

    public void Cadastrar(String tipoCooler, PlacaMae pm, PlacaVideo pv, HardDisk hd, Memoria slot0, Memoria slot1) {
        setTipoCooler(tipoCooler);
        setPlacaMae(pm);
        setPlacaVideo(pv);
        setHardDisk(hd);
        setSlot0(slot0);
        setSlot1(slot1);
    }

    public void imprimir() {
        System.out.println("Desktop--------------------------");
        System.out.println("Tipo de Cooler.: " + getTiPoCooler());
        pm.imprimir();
        pv.imprimir();
        hd.imprimir();
        slot0.imprimir();
        slot1.imprimir();
    }

    public void entradaDados() {
        Scanner entrada5 = new Scanner(System.in);
        System.out.println("Desktop--------------------------");
        System.out.println("Tipo de Cooler.: ");
        setTipoCooler(entrada5.nextLine());
        pm.entradaDados();
        pv.entradaDados();
        hd.entradaDados();
        slot0.entradaDados();
        slot1.entradaDados();
    }
}
