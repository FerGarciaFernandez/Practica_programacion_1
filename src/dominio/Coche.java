package dominio;

public class Coche{
    private String marca;
    private String numeroMatricula;

    public Contacto(String marca, String numeroMatricula) {
        this.marca = marca;
        this.numeroMatricula = numeroMatricula;
    }

    public Coche() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return getMarca() + ": " + getNumeroMatricula();
    }

}
