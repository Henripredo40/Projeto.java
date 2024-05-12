package heranca.empresa;

public class Engenheiro extends Funcionario{ //esta dentro do {} amarelo é da classe engenheiro
    //engenheiro é uma pessoa, ou seja, (o que o define)ele tem: nome, cpf, telefone, registro no crea , projeto
    // extends extende a classe funcionario
    private String nome; //privada nao acessa diretamente, estamos treinando encapsulamento, pelo gatterts and setters
    private Integer cpf;
    private Integer telefone;
    private String crea;
    private String projeto;
    private Double salario;

    private Engenheiro(){} //privatisou o metodo crontrutor padrao e depois deixou publico

    public Engenheiro(String nome, Integer cpf , Integer telefone, 
    String crea, String projeto, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea = crea;
        this.projeto = projeto;
        this.salario = salario;
    }
    
    public String getNome(){//getnome retorna,   para reornar o atributo nome e ser visivel
        return this.nome; 
    }

    public void setNome(String nome){ //setnome modifica o valor
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonificacao () { // caucula a bonificacao do salario daquele engenheiro
        return this.salario * 0.15;
    }


    @Override
    public String toString() { //tostring pra mostrar as informacoes daquele engenheiro criado 
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='"+ getBonificacao() + "'" +
            "}";
    }
    

}