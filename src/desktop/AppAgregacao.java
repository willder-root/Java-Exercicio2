
package desktop;


public class AppAgregacao {
    public static void main(String[] args){
        Desktop desk = new Desktop();
        
        desk.slot0.setMarca("Samsung");
        desk.slot0.setCapacidade(16);
        
        desk.slot1.setMarca("Kingston");
        desk.slot1.setCapacidade(8);
        
        desk.slot2.setMarca("Sandisk");
        desk.slot2.setCapacidade(4);
        
        desk.slot3.setMarca("Crucial");
        desk.slot3.setCapacidade(2);
        
        System.out.println("Memoria Total: " + (desk.slot0.getCapacidade() +
                desk.slot1.getCapacidade()+ desk.slot2.getCapacidade() +
                desk.slot3.getCapacidade()));
    }
}
