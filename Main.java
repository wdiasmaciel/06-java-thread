public class Main {
  public static final int MAX_THREAD = 7;

  public static void main(String[] args) {
    int i, j, iteracao, resto;
    Carregador carregador = new Carregador();
    Tarefa[] tarefas = carregador.ler();

    /*
     * Exemplo:
     * Tamanho do vetor de tarefas: 13
     * MAX_THREAD: 7
     * iteracao: 13 / 7 = 1
     * resto: 13 % 7 = 6
     */
    iteracao = tarefas.length / MAX_THREAD;
    resto = tarefas.length % MAX_THREAD;

    for (i = 0; i < iteracao; i++) {
      for (j = 0; j < MAX_THREAD; j++)
        tarefas[j].start();

      for (j = 0; j < MAX_THREAD; j++)
        try {
          tarefas[j].join();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    for (i = 0; i < resto; i++)
      tarefas[i].start();

    for (i = 0; i < resto; i++)
      try {
        tarefas[i].join();
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
