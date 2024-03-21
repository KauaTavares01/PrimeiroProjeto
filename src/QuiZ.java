import java.util.Scanner;

public class QuiZ {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho1.Aluno = "Kauã Tavares Valadares Da Silva";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho1.Inicio = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();


        Questoes questoes1 = new Questoes();
        questoes1.questoes = "1-Quem foi o maior jogador de todos os tempos ? ";
        questoes1.A = "A) Chirtiano Ronaldo";
        questoes1.B = "B) Neymar ";
        questoes1.C = "C) Messi ";
        questoes1.D = "D) Pele ";
        questoes1.E = "E) Maradona";
        questoes1.escrevaquestao();
        questoes1.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("====================================================================== ");
        Questoes questoes2 = new Questoes();
        questoes2.questoes = "2- Qual ultimo placar do jogo do Brasil?";
        questoes2.A = "A) Brasil 0x0 Argentina";
        questoes2.B = "B) Brasil 7x1 Argentina";
        questoes2.C = "C) Brasil 0x1 Argentina";
        questoes2.D = "D) Brasil 0x7 Argentina";
        questoes2.E = "E) Nenhuma das Anteriores";
        questoes2.escrevaquestao();
        questoes2.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes3 = new Questoes();
        questoes3.questoes = "3-Quem e o camisa 10 da seleção Brasileira?";
        questoes3.A = "A) Kauã Tavares";
        questoes3.B = "B) Neymar ";
        questoes3.C = "C) Rodrigo";
        questoes3.D = "D) Vini jr";
        questoes3.E = "E) Casemiro ";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes4 = new Questoes();
        questoes4.questoes = "4- Qual o melhor Time do Brasil ?";
        questoes4.A = "A) Flamengo";
        questoes4.B = "B) Corinthians";
        questoes4.C = "C) São Paulo";
        questoes4.D = "D) Vasco";
        questoes4.E = "E) Palmeiras";
        questoes4.escrevaquestao();
        questoes4.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes5 = new Questoes();
        questoes5.questoes = "5- com quantos jogadores e necessario para jogar uma partida de Fifa“?";
        questoes5.A = "A) 9";
        questoes5.B = "B) 8";
        questoes5.C = "C) 12 ";
        questoes5.D = "D) 11";
        questoes5.E = "E) 13";
        questoes5.escrevaquestao();
        questoes5.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes6 = new Questoes();
        questoes6.questoes = "6- Quantos gols tem um hat-trik ?";
        questoes6.A = "A) 1";
        questoes6.B = "B) 3";
        questoes6.C = "C) 2";
        questoes6.D = "D) 4";
        questoes6.E = "E) 6";
        questoes6.escrevaquestao();
        questoes6.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes7 = new Questoes();
        questoes7.questoes = "7- Quem foi o campeão do brasileirão de 2023?";
        questoes7.A = "A) Flamengo ";
        questoes7.B = "B) São Paulo ";
        questoes7.C = "C) Santos ";
        questoes7.D = "D) Palmeiras ";
        questoes7.E = "E) Chelsea ";
        questoes7.escrevaquestao();
        questoes7.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes8 = new Questoes();
        questoes8.questoes = "8- Melhor jogador do Mundo atualmente";
        questoes8.A = "A) cr7";
        questoes8.B = "B) Mbape";
        questoes8.C = "C) Messi";
        questoes8.D = "D) Neymas";
        questoes8.E = "E) Haland";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes9 = new Questoes();
        questoes9.questoes = "9- Qual time acabou com a carreira do Neymar?";
        questoes9.A = "A) PSG";
        questoes9.B = "B) GOIAS";
        questoes9.C = "C) SANTOS ";
        questoes9.D = "D) ALL HILLAU ";
        questoes9.E = "E) BARCELONA ";
        questoes9.escrevaquestao();
        questoes9.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes10 = new Questoes();
        questoes10.questoes = "10- Qual time e o maior do centro oeste ?";
        questoes10.A = "A) vila nova";
        questoes10.B = "B) Atletico Goianiense ";
        questoes10.C = "C) Goiania ";
        questoes10.D = "D) Goias ";
        questoes10.E = "E) Aparecidense ";
        questoes10.escrevaquestao();
        questoes10.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes11 = new Questoes();
        questoes11.questoes = "11- Qual o Clube que nunca subiu pra serie A , E se acha o maior do Centro Oeste";
        questoes11.A = "A) GOIAS ";
        questoes11.B = "B) APARECIDENSE";
        questoes11.C = "C) ATLETICO GOIANO";
        questoes11.D = "D) GOIANIA ";
        questoes11.E = "E) VILA NOVA ";
        questoes11.escrevaquestao();
        questoes11.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes12 = new Questoes();
        questoes12.questoes = "12- Quem tem o titulo de primeiro campeão mundial ?";
        questoes12.A = "A) Palmeiras ";
        questoes12.B = "B) São Paulo ";
        questoes12.C = "C) Corinthians";
        questoes12.D = "D) Flamengo";
        questoes12.E = "E)  Santos ";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes13 = new Questoes();
        questoes13.questoes = "13- Qem tem mais bola de ouro?";
        questoes13.A = "A) Ronaldo Cristhiano";
        questoes13.B = "B) pele ";
        questoes13.C = "C) Messi ";
        questoes13.D = "D) Ronaldinho";
        questoes13.E = "E) Ronaldo fenomeno";
        questoes13.escrevaquestao();
        questoes13.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes14 = new Questoes();
        questoes14.questoes = "14- Qual Pais tem mais copa do mundo ";
        questoes14.A = "A) França";
        questoes14.B = "B) Brasil ";
        questoes14.C = "C) Alemanha";
        questoes14.D = "D) Italia";
        questoes14.E = "E) Argentina";
        questoes14.escrevaquestao();
        questoes14.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        Questoes questoes15 = new Questoes();
        questoes15.questoes = "15- Quaal o time com Mais titulos Brasileiros ?";
        questoes15.A = "A) São Paulo";
        questoes15.B = "B) Flamengo ";
        questoes15.C = "C) Palmeiras";
        questoes15.D = "D) Goias";
        questoes15.E = "E) Vila";
        questoes15.escrevaquestao();
        questoes15.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

    }
}


