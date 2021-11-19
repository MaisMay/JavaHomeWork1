package com.pb.tkachuk.hw8;
 /*
    Создать класс Auth, который содержит поля login и password и методы:

- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
Проверяет параметр login, длинна должна быть от 5 до 20 символов.
Login должен содержать только латинские буквы и цифры. Если логин не соответствует
требованиям нужно выбросить WrongLoginException.
Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания.
Также password и confirmPassword должны совпадать.
Если password не соответствует требованиям нужно выбросить WrongPasswordException.
Если проверки все пройдены успешно записать в свои поля значение login и password.
Так сохраняем пользователя :)
- signIn (вход на сайт) принимающий login и password.
Проверяет что login и password соответствуют значениям из полей класса.
Если нет - выбрасывает исключение WrongLoginException.
     */

public class Auth {
    // который содержит поля login и password
    private String login;
    private String password;
    // - signUp (регистрация на сайте) принимающий login, password, и confirmPassword.

   /*
    регистрация
    */
    public void signUp(String login, String password, String confirmPassword) throws Exception {

        if (!login.matches("^[a-zA-Z0-9]{5,20}$") && !password.matches("^[\\w]{5,}$")) {
            throw new WrongLoginException("Логин или пароль не соответствует требованиям, нужно попробовать еще");
        } else if (password.length() < 5) {
            throw new WrongPasswordException("Длина пароля меньше 5 символов");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else {
            // назначить логин логину пароль паролю и завершить регистрацию для пользователя
                     this.login = login;
                     this.password = password;
            System.out.println("Вы успешно зарегестрировались");
        }
    }
    /*
    Вход
     */
    public void signIn(String login, String password) throws WrongLoginException {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Вы успешно вошли");
        } else { throw new WrongLoginException("Логин или пароль неправильные");
        }
    }
}
