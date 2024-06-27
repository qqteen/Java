package Testing_123;
import java.util.Scanner;
import java.util.ArrayList;

class Contact {
    String name;
    String phoneNumber;

    Contact (String name , String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
public class Contact_List_App {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    ArrayList<Contact> contacts = new ArrayList<>();
    boolean running = true;
        System.out.println();
        System.out.println("  **Tok Gyi's Contact List**");
    while (running) {
        System.out.println();

        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = userInput.nextInt();
        userInput.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("Enter name: ");
                String name = userInput.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = userInput.nextLine();
                contacts.add(new Contact(name , phoneNumber));
                System.out.println("Contact added. ");
                break;
            case 2:
                System.out.print("Contacts: " );
                for (Contact contact : contacts) {
                    System.out.println(contact.name + "-" + contact.phoneNumber);
                }
                break;
            case 3:
                System.out.print("Enter name to search: ");
                String nameSearch = userInput.nextLine();
                boolean found = false;
                for(Contact contact : contacts) {
                    if (contact.name.equalsIgnoreCase(nameSearch)) {
                        System.out.println("Contact found: " + contact.name + "-" + contact.phoneNumber);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                    }
                break;
            case 4:
                System.out.println("Goodbye<3 ");
                running = false;
                break;
            default:
                System.out.println("Invalid choice.Try again!");
            }
        }

    }
}
