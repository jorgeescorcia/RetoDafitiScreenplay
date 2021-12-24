package task;


import UI.DafitiPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class BuscarProducto implements Task {
    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(DafitiPage.inputBuscador),

                Hit.the(Keys.ENTER).into(DafitiPage.inputBuscador),
                Click.on(DafitiPage.btnElementoBusqueda),
                Click.on(DafitiPage.txtElementoBusqueda.of(producto))
        );
    }

    public static BuscarProducto enDafiti(String producto){
        return Instrumented.instanceOf(BuscarProducto.class).withProperties(producto);
    }


}
