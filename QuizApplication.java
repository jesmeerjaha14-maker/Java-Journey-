import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is used for Android development?\nA. Python\nB. Java\nC. C++\nD. Swift",
                "2. Which keyword is used to create an object in Java?\nA. class\nB. object\nC. new\nD. this",
                "3. Which loop is guaranteed to execute at least once?\nA. for\nB. while\nC. do-while\nD. foreach",
                "4. What is the extension of a Java source file?\nA. .class\nB. .java\nC. .exe\nD. .jar",
                "5. Which company developed Java?\nA. Microsoft\nB. Google\nC. Sun Microsystems\nD. Apple"
        };

        char[] answers = {'B', 'C', 'C', 'B', 'C'};

        int score = 0;
        System.out.println("================================");
        System.out.println("      JAVA QUIZ APPLICATION");
        System.out.println("================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");

            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score : " + score + " / " + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.printf("Percentage : %.2f%%\n", percentage);

        if (percentage >= 80)
            System.out.println("Grade : A");
        else if (percentage >= 60)
            System.out.println("Grade : B");
        else if (percentage >= 40)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");

        sc.close();
    }
}