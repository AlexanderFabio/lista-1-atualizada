package questao02;

import java.time.LocalDateTime;

public class Midia {
    private LocalDateTime dataHoraUpload;
    private String arquivo;
    private Integer faixaEtariaMinima;
    private String categoria;
    private Produtor produtor;

    public LocalDateTime getDataHoraUpload() {
        return dataHoraUpload;
    }

    public String getArquivo() {
        return arquivo;
    }

    public Integer getFaixaEtariaMinima() {
        return faixaEtariaMinima;
    }

    public String getCategoria() {
        return categoria;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFaixaEtariaMinima(Integer faixaEtariaMinima) {
        this.faixaEtariaMinima = faixaEtariaMinima;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public void setDataHoraUpload(LocalDateTime dataHoraUpload) {
        this.dataHoraUpload = dataHoraUpload;
    }
}
