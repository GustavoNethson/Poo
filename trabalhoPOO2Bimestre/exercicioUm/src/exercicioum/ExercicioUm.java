/*  1 - Crie uma interface chamada "Desenhavel" com um método "desenhar()" que não
retorna nada. Em seguida, implemente essa interface em três classes diferentes:
"Circulo", "Retangulo" e "Triangulo". Cada classe deve implementar o método "desenhar()"
para exibir o nome da forma geométrica correspondente.*/
package exercicioum;

public class ExercicioUm {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        Desenhavel triangulo = new Triangulo();

        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();

    }

}
