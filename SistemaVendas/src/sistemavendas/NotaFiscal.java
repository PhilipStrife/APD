package sistemavendas;
import java.util.Date;
public class NotaFiscal {
	private long numeroNota;
	private Date dataEmissao;
	public void emitirNota() {
	}

    public long getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(long numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
