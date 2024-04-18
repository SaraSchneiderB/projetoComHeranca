package projetoComHeranca;

public class Aluno extends Pessoa {

    private double matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada");
    }
    //get

    public double getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    //set
    public void setMatricula(double m) {
        this.matricula = m;
    }

    public void setCurso(String c) {
        this.curso = c;
    }

    public String detalhesAluno() {
        return "Dados profissionais (Aluno)" + "\nMatricula: " + matricula + "\nCurso: " + curso + ".\n\n";
    }

}
