                                                   ORIENTAÇÃO A OBJETO:
1)					      

public class Aluno {
   public String nome;
   public String RA;

   public double notaProgramacao;
   public double notaModelagem;
   public double notaVida;
   public double notaCalculo;

  public double calcularMedia() {
     return (notaProgramacao+notaVida+
             notaModelagem+notaCalculo) / 4;
  }
}

Aluno aluno1 = new Aluno();
aluno1.nome = 'Montanha';

Aluno aluno2 = new Aluno();
aluno2.nome = 'Raluca';

OBS: NECESSÁRIO CORREÇÃO.


2)

public class BOLA {

    private String cor;
    double circunferencia;
    String material;

    BOLA(String cor) {
        this.cor = cor;
    }

    void trocaCor(String novaCor){
        cor = novaCor;
    }

    String mostraCor() {
        return cor;

    }
}


 public class App{

    public static void main(String[]args) {
 
 BOLA bola = new BOLA(cor:"Vermelho");

 System.out.println(bola.mostraCor());
    
 }

}

OBS: NECESSÁRIO CORREÇÃO.



