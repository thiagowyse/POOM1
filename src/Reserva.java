import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String dataEntrada;
    private String dataSaida;
    private List<Hospede> hospedes;
    private Veiculo veiculo;

    public Reserva(String dataEntrada, String dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospedes = new ArrayList<>();
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public void checkin(Hospede[] hospedes) {
        for (Hospede hospede : hospedes) {
            this.hospedes.add(hospede);
        }
    }

    public void checkout() {
        this.hospedes.clear();
    }

    public void cancelar() {
        this.hospedes.clear();
        this.veiculo = null;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
