import java.util.Random;

public class CarregadorDeTarefas {
    public Tarefa[] ler() {
        int min = 5;
        int max = 9;
        Random random = new Random();

        // Gera um número aleatório entre 5 e 9 (incluindo ambos):
        int num = random.nextInt(max - min + 1) + min;

        Tarefa[] tarefas = new Tarefa[num];

        for(int i = 0; i < num; i++)
            tarefas[i] = new Tarefa("Terefa" + i);

        return tarefas;
    }
}
