package jogodavelha;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo {

    public static void desenho(String game[][]) {
        int i, j;
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {

                if(j == 0) {
                    System.out.print("\t\t");
                }

                if(j == 2) {
                    System.out.print(game[i][j]);

                    if(i != 2) {
                        System.out.println("\n\t\t---------");
                    }
                
                }else{
                    System.out.print(game[i][j] + " | ");
                }
            }
        }
    }

    public static int vencedor(String game[][], Pessoa j1, Pessoa j2) {
        int fim = 0, ct = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 1; j++) {
                
                if(game[i][j] != " " && (game[i][j] == game[i][j + 1]) && (game[i][j] == game[i][j + 2])) {
                    
                    if(game[i][j] == "X") {
                        JOptionPane.showMessageDialog(null, j1.getNome() + " venceu!!!");
                        fim = 1;
                    
                    }else{
                        JOptionPane.showMessageDialog(null, j2.getNome() + " venceu!!!");
                        fim = 1;
                    }
                }
            } 
        }

        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < 3; j++) {
                
                if(game[i][j] != " " && (game[i][j] == game[i + 1][j]) && (game[i][j] == game[i + 2][j])) {
                    
                    if(game[i][j] == "X") {
                        JOptionPane.showMessageDialog(null, j1.getNome() + " venceu!!!");
                        fim = 1;
                    
                    }else{
                        JOptionPane.showMessageDialog(null, j2.getNome() + " venceu!!!");
                        fim = 1;
                    }
                }
            }
        }

        if(game[0][0] == "X" && game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
            JOptionPane.showMessageDialog(null, j1.getNome() + " venceu!!!");
            fim = 1;
        
        }else if(game[0][0] == "O" && game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
            JOptionPane.showMessageDialog(null, j2.getNome() + " venceu!!!");
            fim = 1;

        }else if(game[0][2] == "X" && game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
            JOptionPane.showMessageDialog(null, j1.getNome() + " venceu!!!");
            fim = 1;
        
        }else if(game[0][2] == "O" && game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
            JOptionPane.showMessageDialog(null, j2.getNome() + " venceu!!!");
            fim = 1;
        
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
               
                if(game[i][j] != " ") {
                    ct++;
                }
            }
        }

        if(fim == 0 && ct == 9) {
            JOptionPane.showMessageDialog(null, "Empate!!!");
            fim = 1;
        }

        return fim;
    }
    public static void main(String[] args) {
        int op, i, j, fim = 0;
        String op2[] = {"Pessoa x Pessoa", "Pessoa x Computador", "Sair"};
        String game[][] = new String[3][3];

        Scanner sc = new Scanner(System.in);
        Pessoa j1 = new Pessoa();
        Pessoa j2 = new Pessoa();
        Computador c = new Computador();

        op = JOptionPane.showOptionDialog(null, "Selecione uma opção para jogar", "Modo de jogo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op2, 0);
        
        j1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do jogador 1"));

        if(op == 0) {
            j2.setNome(JOptionPane.showInputDialog(null, "Digite o nome do jogador 2"));
        }

        System.out.println("-----------------------------------------------");
        System.out.println("\tBem vindos ao Jogo da Velha!\n");
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                game[i][j] = " ";

                if(j == 0) {
                    System.out.print("\t\t");
                }

                if(j == 2) {
                    System.out.print(game[i][j]);

                    if(i != 2) {
                        System.out.println("\n\t\t---------");
                    }
                
                }else{
                    System.out.print(game[i][j] + " | ");
                }
            }
        }

        do {
            switch(op) {
                case 0:
    
                    System.out.printf("\n\n------ %s ------\n", j1.getNome());
                    
                    do{
                        System.out.print("\nLinha: ");
                        j1.setLinha(sc.nextInt() - 1);
        
                        System.out.print("Coluna: ");
                        j1.setColuna(sc.nextInt() - 1);
                    
                    }while(game[j1.getLinha()][j1.getColuna()] != " ");
                    
                    System.out.println();
                    game[j1.getLinha()][j1.getColuna()] = "X";
    
                    desenho(game);
                    fim = vencedor(game, j1, j2);

                    if(fim == 1) {
                        break;
                    }
                    
                    System.out.printf("\n\n------ %s ------\n", j2.getNome());
                    
                    do{
                        System.out.print("\nLinha: ");
                        j2.setLinha(sc.nextInt() - 1);
        
                        System.out.print("Coluna: ");
                        j2.setColuna(sc.nextInt() - 1);
                    
                    }while(game[j2.getLinha()][j2.getColuna()] != " ");
    
                    System.out.println();
                    game[j2.getLinha()][j2.getColuna()] = "O";
    
                    desenho(game);
                    fim = vencedor(game, j1, j2);

                    break;

                case 1:

                    System.out.printf("\n\n------ %s ------\n", j1.getNome());
                    
                    System.out.print("\nLinha: ");
                    j1.setLinha(sc.nextInt() - 1);
    
                    System.out.print("Coluna: ");
                    j1.setColuna(sc.nextInt() - 1);
    
                    System.out.println();
                    game[j1.getLinha()][j1.getColuna()] = "X";
    
                    desenho(game);
                    fim = vencedor(game, j1, j2);

                    if(fim == 1) {
                        break;
                    }

                    j2.setNome("Computador");

                    System.out.printf("\n\n------ Computador ------\n");

                    c.escolha(game);
                    
                    System.out.println("\nLinha: " + (c.getLinha() + 1));
    
                    System.out.println("Coluna: " + (c.getColuna() + 1));
    
                    System.out.println();
                    game[c.getLinha()][c.getColuna()] = "O";
    
                    desenho(game);
                    fim = vencedor(game, j1, j2);
                    
                    break;
            }
            
        }while(fim == 0);
    }
}