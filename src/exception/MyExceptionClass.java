package exception;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력 : ");

        try {
            int age = readAge();
            System.out.printf("입력된 나이 : %d \n", age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws ReadAgeException {
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        if(age < 0) {
            throw new ReadAgeException(); //예외 발생
        }

        return age;
    }
}
