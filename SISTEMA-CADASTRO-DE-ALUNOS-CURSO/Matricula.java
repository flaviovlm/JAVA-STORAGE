package SISTEMA_DE_CADASTRO_DE_ALUNOS_E_CURSOS;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    public int ano;
    public int semestre;

    public Matricula(Aluno aluno, Curso curso, int ano, int semestre) {
        this.aluno = aluno;
        this.curso = curso;
        this.ano = ano;
        this.semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void exibirMatricula (){
        System.out.println("======= MATRÍCULAS =======\n");
        System.out.printf("Nome do Aluno: %s\n", getAluno());
        System.out.printf("Curso: %s\n", getCurso());
        System.out.printf("Ano: %d\n", getAno());
        System.out.printf("Semestre: %d\n", getSemestre());
    }
}
