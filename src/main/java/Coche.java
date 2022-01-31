public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String techoSolar;
    private int km;
    private int numPuertas;
    private int numPlazas;

    public Coche(String matricula, String marca, String modelo, String color, String techoSolar, int km,
                 int numPuertas, int numPlazas ){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.techoSolar = techoSolar;
        this.km = km;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }
    public Coche(String marca, String modelo, String color, String techoSolar, int km,
                 int numPuertas, int numPlazas ){
        this.matricula = "7722-FRR";
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.techoSolar = techoSolar;
        this.km = km;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setTechoSolar(String techoSolar) {
        this.techoSolar = techoSolar;
    }

    public int getKm() {
        return km;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTechoSolar() {
        return techoSolar;
    }
}
