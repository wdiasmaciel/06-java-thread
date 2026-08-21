public class Tarefa extends Thread {
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(nome + " processando passo " + i + ".");
            try {
                // A thread tenta dormir por 1 segundo.
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " FINALIZADA COM SUCESSO!");
    }
}
