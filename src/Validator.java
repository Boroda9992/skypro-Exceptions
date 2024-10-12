import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {
    private final static Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private final static Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    public static void validate (
            String login,
            String password,
            String confirmPassword) throws WrongLoginException, WrongPasswordException {

        validateLogin(login);
        validatePassword(confirmPassword, password);
    }
    private static void validateLogin (String login) throws WrongLoginException{
        if(!LOGIN_PATTERN.matcher(login).matches()){
            throw new WrongLoginException("Логин использует запрещенные символы!");
        }

    }
    private static void validatePassword (String password, String confirmPassword) throws WrongPasswordException{
        if(!PASSWORD_PATTERN.matcher(password).matches()){
            throw new WrongPasswordException("Пароль использует запрещенные символы!");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль не совпадает с подтверждением!");
        }


    }
}
