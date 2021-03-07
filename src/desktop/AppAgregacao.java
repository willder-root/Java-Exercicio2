
package desktop;


public class AppAgregacao {
    public static void main(String[] args){
        Desktop desk = new Desktop();
        Notebook note = new Notebook();
        Servidor server = new Servidor();
        
        desk.entradaDados();
        desk.imprimir();
        
        note.entradaDados();
        note.imprimir();
        
        server.entradaDados();
        server.imprimir();
    }
}
