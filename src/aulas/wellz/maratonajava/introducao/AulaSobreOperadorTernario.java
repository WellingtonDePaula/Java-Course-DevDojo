package aulas.wellz.maratonajava.introducao;

public class AulaSobreOperadorTernario {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoando = "Sou rico pacas, e por isso vou doar";
        String mensagemNaoDoando = "Sou deveras pobre, e por isso não tenho condição";
        String resultado = (salario > 5000) ? mensagemDoando : mensagemNaoDoando;
        //Operador ternário
        //Sintaxe:
        //(condição) ? caso verdadeiro : caso falso;
        System.out.println(resultado);
    }
}
