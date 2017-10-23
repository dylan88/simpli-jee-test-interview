package fr.simplifia.input.validator.impl;

import fr.simplifia.input.validator.SmpInputValidator;

import java.util.Locale;


public class SmpInputValidatorFactory {

    public static SmpInputValidator fromLocale(final Locale locale){
        final SmpInputValidator result;
        switch(locale.getLanguage()){
            case "en":
                result = new SmpEnglishInputValidator(locale);
                break;
            default:
                result = new SmpDefaultInputValidator(locale);
                break;
        }
        return result;
    }
}
