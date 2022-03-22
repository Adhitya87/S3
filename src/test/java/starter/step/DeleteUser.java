package starter.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteUser {
    public static String URLCreate = "https://ynwahid.cloud.okteto.net/users/jwt/52";

    @Step
    public static void deleted(int ID) {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .when()
                .delete(URLCreate);
    }
}
