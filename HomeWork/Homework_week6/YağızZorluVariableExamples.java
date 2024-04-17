package Week6;

public class YağızZorluVariableExamples {
    public static void main(String[] args) {
      YağızZorluVariables variables = new YağızZorluVariables();

      variables.Toplam(6,8);
        System.out.println(variables.sayi);
        System.out.println(variables.number2);
        System.out.println(variables.letter);
        System.out.println(variables.isProgFun);

        System.out.println("------------MORE VARIABLE EXAMPLES PART ------------------");

        YağızZorluMoreVariableExamples moreVariableExamples = new YağızZorluMoreVariableExamples();
        if(moreVariableExamples.isThisTrue) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        System.out.println(moreVariableExamples.firstLetter);
        System.out.println(moreVariableExamples.sayi2 + moreVariableExamples.sayi);
    }
}