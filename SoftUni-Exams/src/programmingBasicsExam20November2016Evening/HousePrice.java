package programmingBasicsExam20November2016Evening;

import java.util.Scanner;

public class HousePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smallRoomArea = Double.parseDouble(scanner.nextLine());
        double kitchenArea = Double.parseDouble(scanner.nextLine());
        double squareMeterPrice = Double.parseDouble(scanner.nextLine());

        double bathroomArea = smallRoomArea / 2;
        double middleRoomArea = smallRoomArea * 1.1;
        double largestRoomArea = middleRoomArea * 1.1;

        double houseArea = smallRoomArea + kitchenArea + bathroomArea + middleRoomArea + largestRoomArea;
        houseArea += houseArea * 0.05;

        double price = houseArea * squareMeterPrice;

        System.out.printf("%.2f", price);
    }
}
