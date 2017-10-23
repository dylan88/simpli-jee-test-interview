package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;

import java.util.Locale;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGE_FR = " : bienvenue chez Simplifia!";
    private static final String MESSAGE_EN = " : Welcome to Simplifia!";

    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform(final String input, final Locale locale){
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        switch(locale.getLanguage()){
            case "en":
                buffer.append(MESSAGE_EN);
                break;
            default:
                buffer.append(MESSAGE_FR);
                break;
        }
        return buffer.toString();
    }

}
