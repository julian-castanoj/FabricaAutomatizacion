package com.calidad.calidadautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target BUTTON_BUSCAR = Target.the("BUTTON BUSCAR").locatedBy("//*[@id=\"container\"]/div/form/div[2]/button");
    public static final Target INPUT_NUMBER_DOCUMENT = Target.the("INPUT NUMBER RANDOM").locatedBy("//*[@id=\"container\"]/div/form/div[1]/input");


    public static final Target TEXT_VALIDATION_REQUIREMENTS = Target.the("TEXTO EN LA PAGINA DE REQUISITOS").locatedBy("//*[@id=\"reqTitle\"]");
    public static final Target TEXT_VALIDATION_HOMEPAGE = Target.the("TEXTO EN LA HOMEPAGE").locatedBy("//*[@id=\"container\"]/div/form/div[2]/button/p");


}