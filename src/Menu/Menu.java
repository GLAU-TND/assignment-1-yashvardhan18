package Menu;

import LL.LinkedList;
import Node.Node;
import java.util.*;
import Person.Person;

public class Menu {
    private LinkedList<Person> linkedlist;
    private  Scanner sc;
    public Menu(){
        sc=new Scanner(System.in);
        linkedlist=new LinkedList<>();
    }
    public int choice(){
        System.out.println("Welcome to Yashvardhan's contact list application\n"+
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        return sc.nextInt();
    }
    public void new_contact(){
        String name;
        Person person=new Person();
        System.out.println("Enter name of person\n");
        sc.nextLine();

        System.out.println("First Name: ");
        name=sc.nextLine().trim();
        person.setFirst_Name(name);

        System.out.print("Last Name: ");
        name = sc.nextLine().trim();
        person.setLast_Name(name);

        String number;
        System.out.println("Phone number: ");
        number=sc.nextLine().trim();
        person.setContact_Number(number);
        char c;
        System.out.println("Add another number ? (y/n)");
        c=sc.nextLine().trim().charAt(0);
        while(c == 'y'){
            System.out.println("Contact Number: ");
            number=sc.nextLine().trim();
            person.setContact_Number(number);
            System.out.println("Add another number? (y/n)");
            c=sc.nextLine().trim().charAt(0);
        }

        String email = null;
        System.out.print("Would you like to add email address? (y/n): ");
        c = sc.nextLine().trim().charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            email = sc.nextLine().trim();
            person.setEmailID(email);
            System.out.println("y");
        } else {
            person.setEmailID("");
            System.out.println("n");
        }

        Node<Person> node = new Node<Person>();
        node.setData(person);
        linkedlist.insertion(node);
    }
    private void sort(LinkedList<Person> linkedlist){
        linkedlist.sort();
    }

    public void view() {
        sort(linkedlist);
        while(true){
            Node<Person> node = linkedlist.fetch();
            if(node==null)
                break;
            System.out.println(node.getData());
        }
    }
    public void search() {
        int counter = 0;
        System.out.print("Type First Name to search: ");
        sc.nextLine();
        String name = sc.nextLine().trim();

        while (true) {
            Node<Person> node = linkedlist.fetch();
            if (node == null)
                break;
            if (node.getData().getFirst_Name().compareTo(name) == 0)
                counter++;
        }


        System.out.println(counter + "found!");
        while (true) {
            Node<Person> node = linkedlist.fetch();
            if (node == null)
                break;
            if (node.getData().getFirst_Name().compareTo(name) == 0)
                System.out.println(node.getData());
        }
    }

    public void deleteChoice() {
        System.out.println("Here are all your contacts:");
        int i=1;
        while(true){
            Node<Person> node = linkedlist.fetch();
            if(node==null)
                break;
            System.out.println(i+". "+node.getData().getFirst_Name()+" "+node.getData().getLast_Name());
            i++;
        }
        System.out.print("Press the number against the contact to delete it: ");
        int position = sc.nextInt();
        Person  person=linkedlist.deletion_at_required_position(position).getData();

        System.out.println(person.getFirst_Name() + " " + person.getLast_Name() + "'s contact deleted from list!");
    }

    public void exitChoice() {
        System.out.println("Exiting");
    }
}
