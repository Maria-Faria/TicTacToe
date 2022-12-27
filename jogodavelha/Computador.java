package jogodavelha;

public class Computador {
    private int linha, coluna, aux1 = 0, aux2 = 0;

    public void escolha(String game[][]) {

        this.linha = (int) (Math.random() * 3) + 1; 
        this.coluna = (int) (Math.random() * 3) + 1; 

        while ((aux1 == this.linha && aux2 == this.coluna) || game[linha - 1][coluna - 1] != " ") {
            this.linha = (int) (Math.random() * 3) + 1;
            this.coluna = (int) (Math.random() * 3) + 1;
        }

        aux1 = this.linha; 
        aux2 = this.coluna; 
    }

    public int getColuna() {
        return coluna - 1;
    }

    public int getLinha() {
        return linha - 1;
    }
}
