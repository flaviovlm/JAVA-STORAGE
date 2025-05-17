package SISTEMA_DE_CADASTRO_DE_ALUNOS_E_CURSOS;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Flávio Vieira Lima", "388482", 19);
        Aluno aluno2 = new Aluno("Washington Luis de Souza", "777777", 25);
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();

        Curso Bombeiro = new Curso("Bombeiro Civil", "985456", 100);
        Curso Mecanico = new Curso("Mecânico", "789456", 300);
        Bombeiro.exibirCurso();
        Mecanico.exibirCurso();

        Matricula matricula1 = new Matricula(aluno1, Bombeiro, 2025, 1);
        Matricula matricula2 = new Matricula(aluno2, Mecanico, 2024, 3);
        matricula1.exibirMatricula();
        matricula2.exibirMatricula();
    }
}
