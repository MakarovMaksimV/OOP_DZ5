package notebook.util;

public enum Commands {

    REMOVE ("REMOVE - Удаление всеч записй"),
    READ ("READ - Вывод запись по индексу"),
    CREATE ("CREATE - Добавление новуй записи"),
    UPDATE ("UPDATE - Обновление записи"),
    LIST ("LIST - Вывод всех записей"),
    DELETE ("DELETE - Удаление запись по индексу"),
    EXIT ("EXIT - Выход");

    private String title;

    Commands(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}