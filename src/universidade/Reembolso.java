package src.universidade;

public interface Reembolso {

    default void reembolsoDeGastos() {
        System.out.println("Todos os funcionários e estagágiaris devem receber o reemvolso de gasto/ despesas");
    }
}