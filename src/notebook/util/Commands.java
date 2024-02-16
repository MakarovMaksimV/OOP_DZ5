package notebook.util;

public enum Commands {

    REMOVE ("REMOVE - Удаление всех записей"),
    READ ("\nREAD - Вывод запись по индексу"),
    CREATE ("\nCREATE - Добавление новой записи"),
    UPDATE ("\nUPDATE - Обновление записи"),
    LIST ("\nLIST - Вывод всех записей"),
    DELETE ("\nDELETE - Удаление запись по индексу"),
    EXIT ("\nEXIT - Выход");

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