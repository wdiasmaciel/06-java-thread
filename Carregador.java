import java.util.Random;

public class Carregador {
    public Tarefa[] ler() {
        int mim = 10;
        int max = 30;
        Random random = new Random();

        // Gera um número aleatório entre 10 e 30 (incluindo ambos):
        int num = random.nextInt(max - mim + 1) + min;

        Tarefa[] tarefas = new Tarefa[num];

        for(int i = 0; i < num; i++)
            tarefas[i] = "Terefa" + i;

        return tarefas;
    }
}
