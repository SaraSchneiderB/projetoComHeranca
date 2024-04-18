package projetoComHeranca;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver() {
        this.idade++;
    }

    //get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    //set
    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public String detalhesPessoas() {
        return "Dados individuais: " + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + ".\n";
    }

}
