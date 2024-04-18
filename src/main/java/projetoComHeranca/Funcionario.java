package projetoComHeranca;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    //get
    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    //set
    public void setSetor(String st) {
        this.setor = st;
    }

    public void setTrabalhando(boolean t) {
        this.trabalhando = t;
    }

    public String detalhesFuncionario() {
        return "Dados profissionais (Funcionario)" + "\nSetor:" + setor + "\nTrabalhando:" + trabalhando + ".\n\n";
    }

}
