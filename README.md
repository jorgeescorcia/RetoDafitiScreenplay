# RetoDafitiScreenplayFinal
Este reto consiste en automatizar la pagina https://www.dafiti.com.co/ utilizando el patron Screenplay,
la automatizacion tiene como objetivo lo siguiente:
- Buscar los 5 productos no desde el excel sino desde el feature con examples
- Utilizar un Background para realizar como mínimo 2 escenarios.
- Realizar un escenario fallido y uno exitoso sin examples

# Estructura del proyecto
[![Estructura.png](https://i.postimg.cc/3wg8kX4L/Estructura.png)](https://postimg.cc/FfH5qJxc)

# Task
son las interacciones que se llevarán a cabo para cumplir con las historias de usuarios planteadas.

```java
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


```
