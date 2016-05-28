package sistemavendas;

public class Guitarra extends Instrumento {
	private String captador;
	private int numeroCordas;
	private String tipoCordas;
	private String ponte;

    public String getCaptador() {
        return captador;
    }

    public void setCaptador(String captador) {
        this.captador = captador;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public void setNumeroCordas(int numeroCordas) {
        this.numeroCordas = numeroCordas;
    }

    public String getTipoCordas() {
        return tipoCordas;
    }

    public void setTipoCordas(String tipoCordas) {
        this.tipoCordas = tipoCordas;
    }

    public String getPonte() {
        return ponte;
    }

    public void setPonte(String ponte) {
        this.ponte = ponte;
    }
}
