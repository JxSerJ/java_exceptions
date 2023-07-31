package s03;

import s03.Exceptions.*;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String[] checkName(String[] name) {
        for (String n : name) {
            System.out.println(n);
        }
        if (name.length != 3) {
            throw new FullNameException();
        }
        return name;
    }

    public static void checkBirthDate(String inputString) {
        String[] date = inputString.split("\\.");
        for (String n : date) {
            System.out.println(n);
        }
        if (date.length != 3) {
            throw new BirthDateException();
        }
        int[] birthDate = new int[3];
        for (int i = 0; i < date.length; i++) {
            try {
                birthDate[i] = Integer.parseInt(date[i]);
                System.out.println(birthDate[i]);
            } catch (NumberFormatException e) {
                throw new BirthDateException();
            }
        }
        if (birthDate[0] < 1 || birthDate[0] > 31) {
            throw new BirthDateException();
        }
        if (birthDate[1] < 1 || birthDate[1] > 12) {
            throw new BirthDateException();
        }
    }

    public static void checkPhoneNumber(String inputString) {
        long phoneNumber = 0;
        try {
            phoneNumber = Long.parseLong(inputString);
            System.out.println(phoneNumber);
        } catch (NumberFormatException e) {
            throw new PhoneException();
        }
    }

    public static void checkGender(String inputString) {
        if (inputString.length() == 1) {
            System.out.println(inputString);
            if (!(inputString.equalsIgnoreCase("f")) && !(inputString.equalsIgnoreCase("m"))) {
                throw new GenderException();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data (Фамилия Имя Отчество датарождения номертелефона пол)");
        String userInput = sc.nextLine();

        String[] dataString = userInput.split(" ");

        try {
            if (dataString.length != 6) {
                throw new GeneralException();
            }

            String[] nameStr = Arrays.copyOfRange(dataString, 0, 3);
            String checkedName;


            try {
                checkedName = checkName(nameStr)[0];

                checkBirthDate(dataString[3]);
                checkPhoneNumber(dataString[4]);
                checkGender(dataString[5]);
                FileHandler fileHandler = new FileHandler();
                fileHandler.writeData(checkedName, userInput);

            } catch (
                    Exception e) {
                System.out.println("Error! " + e.getMessage());
            }
        } catch (GeneralException e) {
            System.out.println(e.getMessage());
        }

    }
}
