package SISTEMA_DE_CADASTRO_DE_ALUNOS_E_CURSOS;

public class Curso {
    private String nome;
    private String codigo;
    public int cargaHoraria;

    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirCurso (){
        System.out.println("======= CURSOS =======\n");
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Código: %s\n", getCodigo());
        System.out.printf("Carga Horária: %d\n\n", getCargaHoraria());
    }
}
