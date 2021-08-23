package co.com.choucair.certification.analistafinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//*[@id=\"yui_3_17_2_1_1629734229559_20\"]"));
    public static final Target SELECT_COURSE = Target.the("Da click para seleccionar el curso")
            .located(By.xpath("//*[@id=\"yui_3_17_2_1_1629734416208_28\"]/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\"yui_3_17_2_1_1629734416208_28\"]/div/div[1]/h4/a"));
}
