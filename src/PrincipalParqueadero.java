/**
 *
 * @author JUAN CASTAÑEDA
 */
public class PrincipalParqueadero {
    public static void main(String[] args) throws InterruptedException {
        //Vehiculo v1 = new Vehiculo("gty675");
        //System.out.println(v1.info());
        
        System.out.println("_____________________________CARROS_______________________________");
        System.out.println("");
        
        Carro c1 = new Carro("GTY6576");
        System.out.println(c1.info());
        
        Carro.precio = 5000;
        Thread.sleep(5000);
        System.out.println(c1.pago());
        System.out.println("");
        
        System.out.println("_____________________________MOTOS_______________________________");
        System.out.println("");
        
        Moto m1 = new Moto("KF99D");
        System.out.println(m1.info());
        
        Moto.precio = 2000;
        Thread.sleep(7000);
        System.out.println(m1.pago());
    }
}
