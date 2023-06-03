package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;


public class RequirementsHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("1234567890").into(INPUT_NUMBER_DOCUMENT),
                Click.on(BUTTON_BUSCAR)
        );

    }

    public static RequirementsHomePage go(){
        return Tasks.instrumented(RequirementsHomePage.class);
    }
}
