public class Main {
    public static final int MAX_THREAD = 7;

    public static void main(String[] args) {
      int i, j, iteration, remainder;
      Tarefa[] tarefas = new Tarefa[MAX_THREAD];
      
      iteration = tarefas.lenght / MAX_THREAD;
      remainder = tarefas.length % MAX_THREAD;
            
      for (i = 0; i < iteration; i++) {
        for (j = 0; j < MAX_THREAD; j++) {
          tarefas[j] = new Tarefa("Tarefa " + j);
          tarefas[j].start ();
        }  
        
        for (j = 0; j < MAX_THREAD; j++) 
          tarefas[j].join ();
      }
      
      for (i = 0; i < remainder; i++) {
          tarefas[j] = new Tarefa("Tarefa " + j);
          tarefas[j].start ();
      }  
        
      for (i = 0; i < remainder; i++) {
          tarefas[j].join ();
      }
  }
}

