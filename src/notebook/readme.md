1. Реализовал уделение о индексу (DELETE)
2. Реализовал удаление всего содержимого репозитория (REMOVE)
3. Удалил пакет dao
4. Прибрался в Main
5. Сделал вывод в консоль более читаемым
6. Релизовал вывод возможных команд при запуске приложения
7. Метод CreateUser оставляю в модуле UserView, т.к. метод содержит в себе вывод информации для пользователя. Но по 
хорошему думаю данный метод нужно разбить на несколько модулей UserView и UserController, так как при вводе информации
в консоль юзер взаимодействует с UserController, данные изменения затем передаютсся в Model.
8. Заметил такое поведение (возможно это у меня что то полетело), на семинаре мы сделали проверку  на 
валидность,в методе UPDATE при вводе пустой строки значения не должны остаться прежними, но проверка на валидность нам 
не даёт вводить пустое значение  и приложение падает. (При обновлении пользователя нельзя оставлять строку пустой, так как
создание нового пользователя не позволяет создавать пользователей с пустыми строками).