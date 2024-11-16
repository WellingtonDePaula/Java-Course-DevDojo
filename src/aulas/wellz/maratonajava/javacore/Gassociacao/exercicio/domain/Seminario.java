package aulas.wellz.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public Seminario(String titulo, Local local, Professor professor, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
        this.alunos = alunos;
        for(Aluno aluno : alunos) {
           aluno.setSeminario(this);
        }

    }

    public void imprime() {
        System.out.println("Título: " + titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("Professor: " + professor.getNome());
        if(alunos == null) {
            return;
        }
        for(Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getIdade());
            System.out.println();
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
