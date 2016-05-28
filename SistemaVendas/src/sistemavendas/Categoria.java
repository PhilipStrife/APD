package sistemavendas;

public abstract class Categoria {

    private String nome;
    private int codigoCategoria;

    public Categoria getInstance(Object String) {
        return null;
    }

    public Instrumento getInstrumento(Object String) {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
}
