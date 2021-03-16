package Main.application.view;

import Main.application.controllers.Task;

import java.util.Comparator;

<<<<<<< HEAD
/**
 * This is the Menu Class and it contains various
 * display Menu options and messages
 *
 * @author Yazan Abbas
 * @since
 **/

public class SortByDate {

    /**
     this method was implemented to give the user the choice of displaying
     the contents of the todoList by date **/

=======
public class SortByDate {

>>>>>>> master
    public static void sortByDate() {

        String displayFormat = "%-10s %-35s %-20s %-10s";

        if (ToDoList.tasks.size() > 0) {
            System.out.println(String.format(displayFormat, "DUE DATE", "TITLE", "PROJECT", "Done"));
            System.out.println(String.format(displayFormat, "########", "#####", "#######", "####"));
        } else {
            System.out.println(Menu.CYAN + "No tasks" + Menu.RESET);
        }

        ToDoList.tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .forEach(task -> System.out.println(String.format(displayFormat, task.getDueDate(),
                        task.getTitle(),
                        task.getProject(),
                        (task.isDone() ? "YES" : "NO")
                )));
    }

}
