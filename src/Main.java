public class Main {
    public static void main(String[] args) {

        // Informacoes dos hospedes
        Hospede hospede1 = new Hospede("Thiago Wyse dos Santos", "Rua A, 123", "123456789");
        Hospede hospede2 = new Hospede("Thiago Moraes Ludvig", "Rua B, 456", "987654321");

        //checkin
        Veiculo veiculo = new Veiculo("ABC-1234", "Sedan");
        Reserva reserva = new Reserva("2025-03-30", "2025-04-05");
        reserva.checkin(new Hospede[]{hospede1, hospede2});
        reserva.setVeiculo(veiculo);

        System.out.println("Data de Entrada: " + reserva.getDataEntrada());
        System.out.println("Data de Saída: " + reserva.getDataSaida());
        System.out.println("Hóspedes:");
        for (Hospede hospede : reserva.getHospedes()) {
            System.out.println(" - " + hospede.getNome() + ", Documento: " + hospede.getDocumento());
        }

        System.out.println("Veículo: " + reserva.getVeiculo().getModelo() + " (Placa: " + reserva.getVeiculo().getPlaca() + ")");

        // Realizando checkout
        reserva.checkout();
        System.out.println("Hóspedes após checkout: " + reserva.getHospedes().size());

        // Cancelando a reserva
        reserva.cancelar();
        System.out.println("Veículo após cancelamento: " + (reserva.getVeiculo() == null ? "Nenhum" : reserva.getVeiculo().getModelo()));

    }
}