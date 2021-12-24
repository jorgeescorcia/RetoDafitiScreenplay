package UI;

import net.serenitybdd.screenplay.targets.Target;


public class DafitiPage {



    public static final Target inputBuscador = Target.the("").locatedBy("//input[@id='searchInput']");
    public static final Target btnElementoBusqueda = Target.the("").locatedBy("//div [@class='itm-product-main-info']");
    public static final Target txtElementoBusqueda = Target.the("").locatedBy("//h3[contains(text(),'{0}')]");

}
