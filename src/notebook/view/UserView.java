package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;
import notebook.util.UserValidator;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;
        System.out.println(Arrays.toString(Commands.values()));

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User u = createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                        System.out.println(userController.readAll());
                    break;
                case UPDATE:
                    String userId = prompt("Идентификатор пользователя: ");
                    userController.updateUser(userId, createUser());
                    break;
                case DELETE:
                    String idUser = prompt("Идентификатор пользователя: ");
                    userController.removeByIndex(idUser);
                    break;
                case REMOVE:
                    userController.removeAll();
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        User user = new User(firstName,lastName,phone);
//        UserValidator validator = new UserValidator();
//        validator.validate(new User(firstName,lastName,phone));
        return user;
    }
}
