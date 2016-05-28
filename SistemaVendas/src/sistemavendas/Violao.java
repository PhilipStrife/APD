package sistemavendas;
public class Violao extends Instrumento {
	public String madeiraTampo;

    public String getMadeiraTampo() {
        return madeiraTampo;
    }

    public void setMadeiraTampo(String madeiraTampo) {
        this.madeiraTampo = madeiraTampo;
    }

    public String getTipoCordas() {
        return tipoCordas;
    }

    public void setTipoCordas(String tipoCordas) {
        this.tipoCordas = tipoCordas;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public void setNumeroCordas(int numeroCordas) {
        this.numeroCordas = numeroCordas;
    }
	public String tipoCordas;
	public int numeroCordas;
}
