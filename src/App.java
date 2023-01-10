public class App {
    public static void main(String[] args) {
        RespondeAi respondeAi = new RespondeAi();
        
        for(int i = 0; i < respondeAi.alunos.length; i++) {
            respondeAi.alunos[i] = new Aluno();
        }

        for(int i = 0; i < respondeAi.materias.length; i++) {
            respondeAi.materias[i] = new Materias();
        }

        respondeAi.materias[0].criarNovaAula();
        System.out.println(respondeAi.materias[0].quantidadeAulas);

        respondeAi.alunos[0].setEmail("joao@gmail.com");
        System.out.println(respondeAi.alunos[0].getEmail());  
    }
}
