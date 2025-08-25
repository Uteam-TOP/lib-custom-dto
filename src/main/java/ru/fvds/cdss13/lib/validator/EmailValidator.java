package ru.fvds.cdss13.lib.validator;

import jakarta.validation.ValidationException;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    );

    /**
     * Валидирует и нормализует email в нижний регистр
     */
    public static String validateAndNormalizeEmail(String rawEmail) {
        if (rawEmail == null || rawEmail.trim().isEmpty()) {
            throw new ValidationException("Email cannot be null or empty");
        }

        // Удаляем все пробелы
        String cleanedEmail = rawEmail.replaceAll("\\s+", "");

        // Валидация формата
        if (!EMAIL_PATTERN.matcher(cleanedEmail).matches()) {
            throw new ValidationException("Invalid email format: " + cleanedEmail);
        }

        // Приводим к нижнему регистру
        return cleanedEmail.toLowerCase();
    }


}
