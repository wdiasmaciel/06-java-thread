public class Tarefa extends Thread {
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            // A thread tenta dormir por 1 segundo.
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nome + " realizada com sucesso.");
    }
}
