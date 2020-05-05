
package com.egorl.car_service.formatters;

import org.springframework.stereotype.Service;

import java.util.function.Function;

public class TelephoneFormatterService implements Function<String, String> {
    private static final int SHOWN_NUMBERS = 4;

    @Override
    public String apply(String s) {
       String hiddenNumber = hideLastNumbers(s);

       return formatIndent(hiddenNumber);
    }

    private String hideLastNumbers(String sourceStr) {
        StringBuilder formattedStr = new StringBuilder(sourceStr.substring(0, SHOWN_NUMBERS));

        for (int i = 0; i < sourceStr.length() - SHOWN_NUMBERS; i++) {
            formattedStr.append("x");
        }

        return formattedStr.toString();

    }

    private String formatIndent(String sourceStr) {
        if (sourceStr.length() < 11)
            return sourceStr;

        StringBuilder formattedStr = new StringBuilder();
        formattedStr.append(sourceStr, 0, 1);
        formattedStr.append(" ");
        formattedStr.append(sourceStr, 1, 4);
        formattedStr.append(" ");
        formattedStr.append(sourceStr, 4, 7);
        formattedStr.append(" ");
        formattedStr.append(sourceStr, 7, 9);
        formattedStr.append(" ");
        formattedStr.append(sourceStr, 9, 11);

        return formattedStr.toString();
    }
}
