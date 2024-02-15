package notebook.util;

import notebook.controller.UserController;
import notebook.model.repository.GBRepository;
import notebook.model.repository.impl.UserRepository;
import notebook.view.UserView;
import java.util.ArrayList;
import java.util.List;


public class NotebookRunner {

    private NotebookRunner(){
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
    public static void run(){
        new NotebookRunner();
    }
}
