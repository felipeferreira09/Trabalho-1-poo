import java.util.Scanner;

public class Prova {

    public static void main(String[] args)
    {
        
        //botar um vetor/array para enumerar e cadastrar as questões.

        Question third = new Question();
        third.setText("Quantos anos eu tenho?");
        third.setAnswer("19");
        
        
       
        presentQuestion(third);
    }
    
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
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
