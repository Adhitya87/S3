package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class OrderbyUser {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/orders/me";

    @Step
    public static void UserOrder() {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .get(URLCreate);
    }
}
