package ru.fvds.cdss13.lib.validator;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String REGEX_PATTERN = "^(.+)@(\\S+)$";

    public static boolean patternMatches(String emailAddress) {
        return !Pattern.compile(REGEX_PATTERN)
                .matcher(emailAddress)
                .matches();
    }


}
