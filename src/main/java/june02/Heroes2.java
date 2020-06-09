package june02;

import java.util.*;

public class Heroes2 {
    public static void main(String[] args) {
        TreeSet<Hero> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter name of hero: ");
            String str = scanner.nextLine();
            System.out.print("Please enter age of hero: ");
            Integer age = Integer.parseInt(scanner.nextLine());
            System.out.print("Please enter home town of hero: ");
            String homeTown = scanner.nextLine();
            set.add(new Hero(str,age,homeTown));
            System.out.println("Currently we have: "+ set );

            System.out.println("Type quit to end or enter to continue: " );

            String response = scanner.nextLine();
            if (response.equals("quit")) {
                break;
            }


        }
    }


}

