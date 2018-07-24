package com.posew7.rehberx.mb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "menuMB")
@SessionScoped
public class MenuMB implements Serializable {

    public MenuMB() {
    }

}
