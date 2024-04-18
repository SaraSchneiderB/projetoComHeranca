package projetoComHeranca;

public class ProjetoPessoaMain {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        /*pessoa
        p1.setNome("Sara");
        p1.setSexo("F");
        p1.setIdade(35);
        System.out.println(p1.detalhesPessoas());
        */
        
        //aluno
        p2.setMatricula(52314);
        p2.setCurso("TI");
        p2.setNome("Natã");
        p2.setSexo("M");
        p2.setIdade(19);
        //p2.cancelarMatricula();
        System.out.println(p2.detalhesPessoas());
        System.out.println(p2.detalhesAluno());

        //professor
        p3.setEspecialidade("Java");
        p3.setSalario(4000);
        p3.receberAumento(100);
        p3.setNome("Leo");
        p3.setSexo("M");
        p3.setIdade(20);
        System.out.println(p3.detalhesPessoas());
        System.out.println(p3.detalhesProfessor());

        //funcionário
        p4.setSetor("Adm");
        p4.setTrabalhando(true);
        p4.setNome("Vini");
        p4.setSexo("M");
        p4.setIdade(21);
        System.out.println(p4.detalhesPessoas());
        System.out.println(p4.detalhesFuncionario());

        /*
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
         */
    }
}
