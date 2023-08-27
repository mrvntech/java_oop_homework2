package homework14.util;

import java.util.regex.Pattern;

public enum Regex {
    EMAIL_REGEX("^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$"),
    PHONE_NUMBER_REGEX("^[0-9]{10}$"),
    DATE_REGEX("^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$" +
            "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$" +
            "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$" +
            "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$"),
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

