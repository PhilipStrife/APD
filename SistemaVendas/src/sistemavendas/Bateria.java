package sistemavendas;

public class Bateria extends Instrumento {

    private String pratos;
    private String bumbos;

    public Bateria(String pratos, String bumbos, String tons) {
        this.pratos = pratos;
        this.bumbos = bumbos;
        this.tons = tons;
    }

    public Bateria() {
    }
    private String tons;

    public String getPratos() {
        return pratos;
    }

    public void setPratos(String pratos) {
        this.pratos = pratos;
    }

    public String getBumbos() {
        return bumbos;
    }

    public void setBumbos(String bumbos) {
        this.bumbos = bumbos;
    }

    public String getTons() {
        return tons;
    }

    public void setTons(String tons) {
        this.tons = tons;
    }
}
