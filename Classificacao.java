import java.util.Scanner;

public class Classificacao {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            int golsNossoPartida, golsNossoTotal, golsSofridoPartida, golsSofridoTotal, partida, nossosPontos;

            nossosPontos = 0;
            golsNossoTotal = 0;
            golsSofridoTotal = 0;

            for (partida = 1; partida <= 5; partida++) {

                System.out.println("Informe o número de gols do nosso time na partida " + partida + ":");
                golsNossoPartida = sc.nextInt();
                golsNossoTotal += golsNossoPartida;

                System.out.println("Informe o número de gols do time adversário na partida " + partida + ":");
                golsSofridoPartida = sc.nextInt();
                golsSofridoTotal += golsSofridoPartida;

                if (golsNossoPartida == golsSofridoPartida) {

                    nossosPontos += 1;
                    continue;

                }

                if (golsNossoPartida > golsSofridoPartida) {

                    nossosPontos += 3;
                    continue;

                }

            }

            System.out.println("A pontuação total do nosso time no campeonato é: " + nossosPontos);

            if (nossosPontos >= 10) {

                System.out.println("Nosso time está classificado para o mata-mata!");

            } else {

                System.out.println("Nosso time foi desclassificado");

            }

            System.out.println("Nosso time marcou: " + golsNossoTotal + " gols");
            System.out.println("Nosso time sofreu: " + golsSofridoTotal + " gols");

            sc.close();
            
        }

    }

}
