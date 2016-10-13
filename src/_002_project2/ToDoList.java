package _002_project2;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.List;
import java.io.BufferedWriter;


/**
 * Created by jacobwilliams on 10/10/16.
 */
public class ToDoList {

    static ArrayList <String> grocery = new ArrayList<>();
   static ArrayList <String> toDo = new ArrayList<>();
    static ArrayList <String> personal = new ArrayList<>();
    static Scanner pickMenu = new Scanner(System.in);
   static String Choices;

    public static void toDoList()throws IOException {

//        String fileName = "to-do.txt";
        String grocier;
        String todo;
        String per;
        PrintWriter grocFile = new PrintWriter(new FileWriter("groc.txt", true)); //won't work if you don't catch for IO exception.
        PrintWriter toDoFile = new PrintWriter(new FileWriter("toDo.txt", true));
        PrintWriter persFile = new PrintWriter(new FileWriter("pers.txt", true));

        Scanner grocierFile = new Scanner(new FileReader("groc.txt"));
        while(grocierFile.hasNextLine()){
            grocier = (grocierFile.nextLine());
            grocery.add(grocier);
        }
        Scanner todoFile = new Scanner(new FileReader("toDo.txt"));
        while(todoFile.hasNextLine()){
            todo = (todoFile.nextLine());
            toDo.add(todo);
        }
        Scanner personalFile = new Scanner(new FileReader("pers.txt"));
        while(personalFile.hasNextLine()){
            per = (personalFile.nextLine());
            personal.add(per);
        }
        while (true) {
            System.out.println("Menu:" + "\n"
                    + "[1]Add Items to he list" + "\n"
                    + "[2]Remove items from the list" + "\n"
                    + "[3]List Items from your to-do lists" + "\n"
                    + "[4]Display help menu" + "\n"
                    + "[5]Save & Quit");
            Choices = pickMenu.nextLine();
            int listChoice;
            Scanner toDolists = new Scanner(System.in);
            Scanner cont = new Scanner(System.in);
            String contin;
            if (Choices.equals("1")) {
                System.out.println("What list would you like to add items to?" + "\n"
                        + "[1]To-Do List" + "\n"
                        + "[2]Personal" + "\n"
                        + "[3]Grocery");


                listChoice = toDolists.nextInt();
                Scanner addTD = new Scanner(System.in);
                String toList;
                String yn;
                Scanner priority = new Scanner(System.in);
                if (listChoice == 1) {
                    while (true) {
                        System.out.println("Type an item to add it to the To-Do list");
                        toList = addTD.nextLine();
                        System.out.println("You have added " + toList + " to the To-Do list");
                        System.out.println("Is " +toList+ " a high priority item? y/n");
                        yn = priority.nextLine();
                        if(yn.equals("y"))
                            toDo.add(0, toList);
                        else
                            toDo.add(toList);
                        System.out.println("Your To-Do List: " + toDo);
                        System.out.println("Would you like to add more items to the list? y/n");
                        contin = cont.nextLine();

                        if (contin.equals("n")) {

                            break;
                        }
                    }
                }
                Scanner addPers = new Scanner(System.in);
                String persList;
                Scanner contp = new Scanner(System.in);
                String continp;
                if (listChoice == 2) {
                    while (true) {
                        System.out.println("Type an item to add it to the Personal list");
                        persList = addPers.nextLine();

                        System.out.println("You have added " + persList + " to the Personal list");
                        System.out.println("Is "+ persList +" a high priority item? y/n");
                        yn = priority.nextLine();
                        if(yn.equals("y"))
                            personal.add(0, persList);
                        else
                            personal.add(persList);
                        System.out.println("Your personal List: " + personal);
                        System.out.println("Would you like to add more items to the Personal list? y/n");
                        continp = contp.nextLine();

                        if (continp.equals("n")) {
                            break;
                        }
                    }
                }
                Scanner addGroc = new Scanner(System.in);
                String grocList;
                Scanner contg = new Scanner(System.in);
                String conting;
                if (listChoice == 3) {
                    while (true) {
                        System.out.println("Type an item to add it to the Grocery list");
                        grocList = addGroc.nextLine();
                        System.out.println("You have added " + grocList + " to the Grocery list");
                        System.out.println("Is "+ grocList +" a high priority item? y/n");
                        yn = priority.nextLine();
                        if(yn.equals("y"))
                            grocery.add(0, grocList);
                        else
                            grocery.add(grocList);

                        System.out.println("Your Grocery List: " + grocery);
                        System.out.println("Would you like to add more items to the Grocery list? y/n");
                        conting = contg.nextLine();

                        if (conting.equals("n")) {
                            break;
                        }
                    }
                }
            }
            if (Choices.equals("2")) {
                System.out.println("What list would you like to remove items from?" + "\n"
                        + "[1]To-Do List" + "\n"
                        + "[2]Personal" + "\n"
                        + "[3]Grocery");


                listChoice = toDolists.nextInt();
                Scanner addTD = new Scanner(System.in);
                String toList;

                if (listChoice == 1) {
                    while (true) {
                        System.out.println("Type an item to remove it from the To-Do list");
                        toList = addTD.nextLine();
                        toDo.remove(toList);
                        System.out.println("You have removed " + toList + " from the To-Do list");
                        System.out.println("Your To-Do List: " + toDo);
                        System.out.println("Would you like to remove more items from the list? y/n");
                        contin = cont.nextLine();

                        if (contin.equals("n")) {

                            break;
                        }
                    }
                }
                Scanner addPers = new Scanner(System.in);
                String persList;
                Scanner contp = new Scanner(System.in);
                String continp;

                if (listChoice == 2) {
                    while (true) {
                        System.out.println("Type an item to remove it from the Personal list");
                        persList = addPers.nextLine();
                        personal.remove(persList);
                        System.out.println("You have removed " + persList + " from the Personal list");
                        System.out.println("Your personal List: " + personal);
                        System.out.println("Would you like to remove more items from the Personal list? y/n");
                        continp = contp.nextLine();

                        if (continp.equals("n")) {
                            break;
                        }
                    }
                }
                Scanner addGroc = new Scanner(System.in);
                String grocList;
                Scanner contg = new Scanner(System.in);
                String conting;
                if (listChoice == 3) {
                    while (true) {
                        System.out.println("Type an item to remove it from the Grocery list");
                        grocList = addGroc.nextLine();
                        grocery.remove(grocList);
                        System.out.println("You have removed " + grocList + " from the Grocery list");
                        System.out.println("Your Grocery List: " + grocery);
                        System.out.println("Would you like to remove more items from the Grocery list? y/n");
                        conting = contg.nextLine();

                        if (conting.equals("n")) {
                            break;
                        }
                    }
                }
            }
            if (Choices.equals("3")) {
                System.out.println("What list would you like to see items from?" + "\n"
                        + "[1]To-Do List" + "\n"
                        + "[2]Personal" + "\n"
                        + "[3]Grocery");

                listChoice = toDolists.nextInt();

                if (listChoice == 1) {
                    System.out.println("To-Do List: " + toDo);
                }
                if (listChoice == 2) {
                    System.out.println("Personal List: " + personal);
                }
                if (listChoice == 3) {
                    System.out.println("Grocery List: " + grocery);
                }
            }
            if (Choices.equals("4")) {
                System.out.println("You can add and remove any of the items to all your lists using the main menu. Thank you for using our list helper");
            }
            if (Choices.equals("5")) {
                toDoFile = new PrintWriter(new FileWriter("toDo.txt"));
                for (int i = 0; i < toDo.size(); i++){
                    toDoFile.println(toDo.get(i));
                }
                grocFile = new PrintWriter(new FileWriter("groc.txt"));
                for (int i = 0; i < grocery.size(); i++){
                    grocFile.println(grocery.get(i));
                }
                persFile = new PrintWriter(new FileWriter("pers.txt"));
                for (int i = 0; i <personal.size(); i++){
                    persFile.println(personal.get(i));
                }
                toDoFile.close();
                grocFile.close();
                persFile.close();
                break;
            }
             else
               System.out.println("Sorry that command doesn't exist");

        }

    }
}
