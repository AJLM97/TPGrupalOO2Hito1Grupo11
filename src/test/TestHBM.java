package test;

import java.time.LocalDate;

import negocio.PedidoABM;

public class TestHBM {

    public static void main(String[] args) {
        double recaudacion = PedidoABM.getInstancia()
                .calcularRecaudacionTotalEntreFechas(
                        LocalDate.of(2026, 1, 1),
                        LocalDate.of(2026, 12, 31));

        System.out.println("Recaudación total: " + recaudacion);
    }
}