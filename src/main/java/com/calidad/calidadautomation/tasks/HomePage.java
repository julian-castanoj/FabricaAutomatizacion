package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.RequirementsHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class HomePage implements Task {
    private PageObject page;

    public HomePage(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(RequirementsHomePage.go());
    }

    public static HomePage Browser(PageObject page){
        return Tasks.instrumented(HomePage.class,page);
    }

}
