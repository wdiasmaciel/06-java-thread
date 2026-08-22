public class Main {
  public static final int MAX_THREAD = 3;

  public static void main(String[] args) {
    int i, j, iteracao, resto;
    CarregadorDeTarefas carregador = new CarregadorDeTarefas();
    Tarefa[] tarefas = carregador.ler();

    /*
     * Exemplo:
     * Tamanho do vetor de tarefas: 8
     * MAX_THREAD: 3
     * iteracao: 8 / 3 = 2
     * resto: 8 % 3 = 2
     */
    iteracao = tarefas.length / MAX_THREAD;
    resto = tarefas.length % MAX_THREAD;

    for (i = 0; i < iteracao; i++) {
      for (j = 0; j < MAX_THREAD; j++)
        try {
          tarefas[MAX_THREAD * i + j].start();
        } catch (Exception e) {
          e.printStackTrace();
        }

      for (j = 0; j < MAX_THREAD; j++)
        try {
          tarefas[MAX_THREAD * i + j].join();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    for (j = 0; j < resto; j++)
      try {
        tarefas[MAX_THREAD * i + j].start();
      } catch (Exception e) {
        e.printStackTrace();
      }

    for (j = 0; j < resto; j++)
      try {
        tarefas[MAX_THREAD * i + j].join();
      } catch (Exception e) {
        e.printStackTrace();
      }

    System.out.println("FIM DO PROGRAMA PRINCIPAL!");
  }
}
