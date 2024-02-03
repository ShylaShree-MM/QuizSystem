import java.util.Scanner;

public class QuizSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quiz System");
        System.out.println("Answer with Option:");

        int score = 0;
        int numOfQuestions = 10;

        String[] questions = new String[numOfQuestions];
        String[][] options = new String[numOfQuestions][3];
        char[] correctAnswers = new char[numOfQuestions];

        questions[0] = "What is the capital of France?";
        options[0] = new String[]{"a) Berlin", "b) Paris", "c) Madrid"};
        correctAnswers[0] = 'b';

        questions[1] = "Which programming language is this quiz written in?";
        options[1] = new String[]{"a) Python", "b) Java", "c) C++"};
        correctAnswers[1] = 'b';

        questions[2] = "Which planet is known as the Red Planet?";
        options[2] = new String[]{"a) Venus", "b) Mars", "c) Jupiter"};
        correctAnswers[2] = 'b';

        questions[3] = "What is the largest mammal on Earth?";
        options[3] = new String[]{"a) Elephant", "b) Blue Whale", "c) Giraffe"};
        correctAnswers[3] = 'b';

        questions[4] = "In which year did the Titanic sink?";
        options[4] = new String[]{"a) 1912", "b) 1923", "c) 1905"};
        correctAnswers[4] = 'a';

        questions[5] = "Who wrote 'Romeo and Juliet'?";
        options[5] = new String[]{"a) Charles Dickens", "b) William Shakespeare", "c) Jane Austen"};
        correctAnswers[5] = 'b';

        questions[6] = "Which element has the chemical symbol 'O'?";
        options[6] = new String[]{"a) Oxygen", "b) Gold", "c) Iron"};
        correctAnswers[6] = 'a';

        questions[7] = "What is the currency of Japan?";
        options[7] = new String[]{"a) Yen", "b) Won", "c) Ringgit"};
        correctAnswers[7] = 'a';

        questions[8] = "Who painted the Mona Lisa?";
        options[8] = new String[]{"a) Vincent van Gogh", "b) Leonardo da Vinci", "c) Pablo Picasso"};
        correctAnswers[8] = 'b';

        questions[9] = "What is the capital of Australia?";
        options[9] = new String[]{"a) Sydney", "b) Canberra", "c) Melbourne"};
        correctAnswers[9] = 'b';

        for (int i = 0; i < numOfQuestions; i++)
        {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i])
            {
                System.out.println(option);
            }

            char userAnswer = scanner.next().charAt(0);
            if (userAnswer == Character.toLowerCase(correctAnswers[i]) || userAnswer == Character.toUpperCase(correctAnswers[i]))
            {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }
        }

        System.out.println("\nYour final score is: " + score + "/" + numOfQuestions);

        scanner.close();
    }
}
