package programmingBasicsExam19March2017Morning;

import java.util.Scanner;

public class TrainersSalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lecturesCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double lecturePrice = budget / lecturesCount;

        int JelevC = 0;
        int RoYaLC = 0;
        int RoliC = 0;
        int TrofonC = 0;
        int SinoC = 0;
        int OtherC = 0;

        for (int i = 0; i < lecturesCount; i++) {
            String lecturer = scanner.nextLine();

            switch (lecturer) {

                case "Jelev":
                    JelevC++;
                    break;

                case "RoYaL":
                    RoYaLC++;
                    break;

                case "Roli":
                    RoliC++;
                    break;

                case "Trofon":
                    TrofonC++;
                    break;

                case "Sino":
                    SinoC++;
                    break;

                default:
                    OtherC++;
                    break;
            }

        }

        double JelevSalary = lecturePrice * JelevC;
        double RoYaLSalary = lecturePrice * RoYaLC;
        double RoliSalary = lecturePrice * RoliC;
        double TrofonSalary = lecturePrice * TrofonC;
        double SinoSalary = lecturePrice * SinoC;
        double OthersSalary = lecturePrice * OtherC;

        System.out.printf("Jelev salary: %.2f lv%n", JelevSalary);
        System.out.printf("RoYaL salary: %.2f lv%n", RoYaLSalary);
        System.out.printf("Roli salary: %.2f lv%n", RoliSalary);
        System.out.printf("Trofon salary: %.2f lv%n", TrofonSalary);
        System.out.printf("Sino salary: %.2f lv%n", SinoSalary);
        System.out.printf("Others salary: %.2f lv%n", OthersSalary);
    }
}
