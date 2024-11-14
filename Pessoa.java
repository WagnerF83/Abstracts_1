import java.util Date;

public abstract class Pessoa(){

    public String nome;
    public Date nascimento;
    public String cpf;
    public String celular;
    public int idade;

    public Pessoa ( String nome, Date nascimento, String cpf, String celular, int idade){
        this.nome=nome;
        this.nascimento=nascimento;
        this.cpf=cpf;
        this.celular=celular;
        this.idade=idade;
    }

    public void Nome ( String newname){
        this.nome=newnome;
    }
    public String Nome (){
        return this.nome;
    }
    public void Nascimento( Date newdate){
        this.nascimento=newdate;
    }
    public Date Nascimento(){
        return this.nascimento;
    }
    public void CPF( String newcpf){
        this.cpf=newcpf;
    }
    public String CPF(){
        return this.cpf;
    }
    public void Celular( String newphone){
        this.celular=newphone;
    }
    public String Celular(){
        return this.celular;
    }
    public void Idade( int newage){
        this.idade=newage;
    }
    public int Idade(){
        return this.idade;
    }

}