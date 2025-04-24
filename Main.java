import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Выход из программы");
                    return;
                case "1":
                    System.out.print("Введите название задачи: ");
                    taskManager.addTask(scanner.nextLine());
                    break;
                case "2":
                    taskManager.showTasks();
                    break;
                case "3":
                    System.out.print("Введите номер для удаления: ");
                    taskManager.removeByNumber(scanner.nextLine());
                    break;
                case "4":
                    System.out.print("Введите задачу для удаления: ");
                    taskManager.removeByText(scanner.nextLine());
                    break;
                case "5":
                    System.out.print("Введите ключевое слово: ");
                    taskManager.removeByKeyword(scanner.nextLine());
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nВыберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5. Удалить дела по ключевому слову");
        System.out.print("Ваш выбор: ");
    }
}