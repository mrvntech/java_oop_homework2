package homework13.util;

import java.util.regex.Pattern;

public enum Regex {
    EMAIL_REGEX("^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$"),
    PHONE_NUMBER_REGEX("^[0-9]{10}$"),
    DATE_OF_BIRTH_REGEX("^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$"),
    ;

    public Pattern getPattern() {
        return pattern;
    }

    Regex(String value) {
        this.value = value;
        this.pattern = Pattern.compile(value);
    }

    public String getValue() {
        return value;
    }

    private String value;
    private Pattern pattern;
}
