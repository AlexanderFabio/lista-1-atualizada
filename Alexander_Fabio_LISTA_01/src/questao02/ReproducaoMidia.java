package questao02;

import java.time.LocalDateTime;

public class ReproducaoMidia {

    private Midia midia;
    private Consumidor consumidor;
    private LocalDateTime DataHoraReproducao;

    public Midia getMidia() {
        return midia;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public LocalDateTime getDataHoraReproducao() {
        return DataHoraReproducao;
    }

    public void setDataHoraReproducao(LocalDateTime dataHoraReproducao) {
        DataHoraReproducao = dataHoraReproducao;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }
}
