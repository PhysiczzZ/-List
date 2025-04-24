import java.util.ArrayList;

public class TaskManager {
    private final ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
            System.out.println("Добавлено!");
        } else {
            System.out.println("Задача уже существует!");
        }
        showTasks();
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, tasks.get(i));
            }
        }
    }

    public void removeByNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number < 1 || number > tasks.size()) {
                System.out.println("Нет задачи с таким номером.");
            } else {
                tasks.remove(number - 1);
                System.out.println("Удалено!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите корректный номер.");
        }
        showTasks();
    }

    public void removeByText(String text) {
        if (tasks.remove(text)) {
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет задачи с таким текстом.");
        }
        showTasks();
    }

    public void removeByKeyword(String keyword) {
        ArrayList<String> toRemove = new ArrayList<>();
        for (String task : tasks) {
            if (task.contains(keyword)) {
                toRemove.add(task);
            }
        }

        if (!toRemove.isEmpty()) {
            tasks.removeAll(toRemove);
            System.out.println("Удалены все задачи, содержащие ключевое слово.");
        } else {
            System.out.println("Нет задач, содержащих это слово.");
        }
        showTasks();
    }
}