public class Funcionario extends Pessoa {
    
    public float salario;


public Funcionario(String nome, Date nascimento, String cpf, String celular, int idade, float salario){
    super(nome, nascimento, cpf, celular, idade);
    this.salario=salario
}
public void Salario( float newsalary ){
    this.salario=newsalary;
}
public float Salario(){
    return this.salario
}
}