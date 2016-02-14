package com.itibo.lesson12;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.Locale;



@ManagedBean(name="language")
@ViewScoped
public class LocalisationBean {

    public void changeLanguage(String language) {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
    }

}

