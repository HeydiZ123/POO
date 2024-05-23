package padre;

class padre {
    public String vehiculo;
    public String casa;
    public String apellido;

    public padre (String vehiculo, String casa, String apellido) {
        this.vehiculo = vehiculo;
        this.casa = casa;
        this.apellido = apellido;
    }

    public void padre () {
        System.out.println("vehiculo" + vehiculo);
        System.out.println("casa" + casa);
        System.out.println("vehiculo" + apellido);
    }
}

class hija extends padre {
    public hija (String vehiculo, String ){
        super(vehiculo, casa, apellido);
    }

    public void hija () {
        System.out.println("vehiculo: " + vehiculo + "casa: " + casa + "apellido" + apellido);
    }
}

public class Main {
    public static void main (String[] args) {
        System.out.print("padre");
        padre padre1 = new padre("vehiculo", "casa", "apellido");
        padre1.padre();
    }
}