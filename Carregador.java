import java.util.Random;

public class Carregador {
    public Tarefa[] ler() {
        int min = 10;
        int max = 30;
        Random random = new Random();

        // Gera um número aleatório entre 10 e 30 (incluindo ambos):
        int num = random.nextInt(max - min + 1) + min;

        Tarefa[] tarefas = new Tarefa[num];

        for(int i = 0; i < num; i++)
            tarefas[i] = new Tarefa("Terefa" + i);

        return tarefas;
    }
}
