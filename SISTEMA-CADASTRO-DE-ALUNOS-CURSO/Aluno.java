package SISTEMA_DE_CADASTRO_DE_ALUNOS_E_CURSOS;

public class Aluno {
    private String nome;
    private String matricula;
    public int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirInformacoes () {
        System.out.println("======= ALUNOS =======\n");
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Matricula: %s\n", getMatricula());
        System.out.printf("Idade: %d\n\n", getIdade());
    }

}
