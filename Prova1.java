
import java.util.ArrayList;
import java.util.Scanner;


public class Prova1 {

    public static void main(String[] args)
    {
        


        //botar um vetor/array para enumerar e cadastrar as questões.

        Question third = new Question();
        third.setText("Quantos anos eu tenho?");
        third.setAnswer("19");
        presentQuestion(third);
        



        ArrayList<String> Questoes = new ArrayList<String>();
        //Questoes.add(third);
       
    }
    
    
    
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Sua resposta: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }

    public void recuperarQuestoes() {

    }

    public void removerQuestoes() {

    }

    public void exibirProva() {

    }

}
