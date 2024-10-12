import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "qwerty_";
        String password = "qwe123";
        String confirmPassword = "11qQ2233";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException){
            System.out.println("Произошла ошибка при проверке логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException){
            System.out.println("Произошла ошибка при проверке пароля: " + wrongPasswordException.getMessage());
        } finally {
            System.out.println("Валидация завершена.");
        }

    }
}