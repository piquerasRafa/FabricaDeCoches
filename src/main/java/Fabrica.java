public class Fabrica {
    public static void main(String[] args) {

        Coche car1 = new Coche("1234-DF", "Seat",
                "Toledo", "Azul", "No",
                200, 3, 5);

        Coche car2 = new Coche("5678-AG", "Fiat",
                "Uno", "Rojo", "No",
                300, 3, 2);
        Coche car3 = new Coche("9012-HH", "BMW",
                "850", "gris", "No",
                400, 5, 5);
        Coche car4 = new Coche("3456-XS", "VW",
                "Caddy", "blanc", "Si",
                500, 5, 7);
    }
}
