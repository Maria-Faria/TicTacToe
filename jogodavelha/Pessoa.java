package jogodavelha;

public class Pessoa {
    private int linha, coluna;
    private String nome;

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public String getNome() {
        return nome;
    }
}
