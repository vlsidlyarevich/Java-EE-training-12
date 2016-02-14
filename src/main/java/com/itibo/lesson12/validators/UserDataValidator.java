package com.itibo.lesson12.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("UserDataValidator")
public class UserDataValidator implements Validator {

    private static final String pattern="([A-Z]+[a-z]+[0-9]+)|([a-z]+[A-Z]+[0-9]+)|([0-9]+[a-z]+[A-Z]+)|([A-Z]+[0-9]+[a-z]+)" +
            "|([0-9]+[A-Z]+[a-z]+)|([a-z]+[0-9]+[A-Z]+)";

    public UserDataValidator() {
    }

    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {

        Pattern pattern = Pattern.compile(UserDataValidator.pattern);

        Matcher matcher = pattern.matcher(value.toString());

        if(!(matcher.find())){
            FacesMessage msg =
                    new FacesMessage("Password validation failed.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
