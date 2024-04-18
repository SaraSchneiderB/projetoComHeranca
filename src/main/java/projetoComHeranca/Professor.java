package projetoComHeranca;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public void receberAumento(double aum) {
        this.salario += aum;
    }

    //get
    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    //set
    public void setEspecialidade(String e) {
        this.especialidade = e;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }

    public String detalhesProfessor() {
        return "Dados profissionais (Professor(a)) " + "\nEspecialidade: " + especialidade + "\nSalario: " + salario + ".\n\n";
    }

}
