package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_REQUIREMENTS;

public class ValidationRequirements implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_REQUIREMENTS).viewedBy(actor).asString();
        return stringTemporal.contains("REQUISITOS PARA GRADO");

    }
    public static ValidationRequirements theRequirementsPage(){return new ValidationRequirements();}
}
