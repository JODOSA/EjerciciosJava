import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca tres números: ");
        Integer num1 = reader.nextInt();
        Integer num2 = reader.nextInt();
        Integer num3 = reader.nextInt();

        System.out.println();

        ordenarMayor(num1, num2, num3);
        
        reader.close();
    }

    private static void ordenarMayor (Integer num1, Integer num2, Integer num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1);
                if (num2 > num3) {
                    System.out.println(num2);
                    System.out.println(num3);
                }else {
                    System.out.println(num3);
                    System.out.println(num2);
                }
            }else {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
        }else {
            if (num2 > num3) {
                System.out.println(num2);
                if (num3 > num1) {
                    System.out.println(num3);
                    System.out.println(num1);
                }else {
                    System.out.println(num1);
                    System.out.println(num3);
                }
            }else {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }

}
