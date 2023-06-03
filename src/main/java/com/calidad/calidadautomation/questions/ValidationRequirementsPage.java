package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_HOMEPAGE;

public class ValidationRequirementsPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_HOMEPAGE).viewedBy(actor).asString();
        return stringTemporal.contains("Copyright © 2023 Grupo Bancolombia");
    }

    public static ValidationRequirementsPage theHomePage(){return new ValidationRequirementsPage();}
}
