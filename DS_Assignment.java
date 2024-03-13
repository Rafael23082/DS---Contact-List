import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DS_Assignment {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        LinkedList<String> LL = new LinkedList<>();
        LinkedList<String> tempo = new LinkedList<>();
        LinkedList<String> Container = new LinkedList<>();
        LinkedList<String> name_container = new LinkedList<>();
        boolean proceed = true;
        int position = 0;

        int count = 1;

        System.out.println("******************************");
        System.out.println("(A)dd");
        System.out.println("(D)elete");
        System.out.println("(E)mail Search");
        System.out.println("(P)rint List");
        System.out.println("(S)earch");
        System.out.println("(Q)uit");
        System.out.println("******************************");

        while (proceed == true){

            System.out.print("Please enter a command: ");

            String menu = scn.nextLine();

            switch(menu){
                case "A":

                    System.out.print("Please enter the name: ");
                    String name = scn.nextLine();
                    tempo.add("Contact " + count + ". " + name);
                    name_container.add(name.toLowerCase());

                    System.out.print("Please enter the phone number: ");
                    BigInteger phone = scn.nextBigInteger();
                    tempo.add(String.valueOf("Phone no: " + phone));

                    scn.nextLine();

                    System.out.print("Please enter the email: ");
                    String email = scn.nextLine();
                    Container.add(name.toLowerCase());
                    tempo.add("Email: " + email);
                    LL.addAll(tempo);
                    tempo.removeAll(tempo);

                    System.out.println("System: The contact " + name + " is added.");
                    count ++; break;

                case "D":
                    System.out.print("Please enter the contact you want to delete: ");
                    String contact = scn.nextLine();
                    for (String i:Container){

                        if (contact.toLowerCase().equals(i)){

                            for (int x = 0; x < 3; x++) {
                                LL.remove(position);
                            }

                            System.out.println("System: The contact " + contact + " is removed.");
                        }
                        position ++;
                    }   break;

                case "E":
                    System.out.print("Enter the email you want to search: ");
                    String email_input = scn.nextLine();
                    email_input = email_input.toLowerCase();
                    for (String i:Container){
                        if (email_input.equals(i)){
                            System.out.println("System: Email " + email_input + " is present in your contacts.");
                        } else {
                            System.out.println("System: Email " + email_input + " is absent from your contacts");
                        }
                    }
                    break;

                case "P":
                    System.out.println("System: Printing Contacts:");
                    System.out.println(LL); break;

                case "S":
                    System.out.print("Enter the name of the person you want to search: ");
                    String name_input = scn.nextLine();
                    name_input = name_input.toLowerCase();
                    for (String i:name_container){
                        if (name_input.equals(i)){
                            System.out.println("System: Person " + name_input + " is present in your contacts.");
                        } else {
                            System.out.println("System: Person " + name_input + " is absent from your contacts.");
                        }
                    }

                case "Q":
                    System.out.println("Exiting program...");
                    proceed = false; break;

                default:
                    System.out.println("Command is not available.");
            }
        }

    }
}