package by.issoft.restaasured;

import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.experimental.Accessors;

import static io.restassured.RestAssured.*;

@Data
@Accessors(chain = true)
public class TestRest {

    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/todos/3";

        Todo ss = get(url).as(Todo.class);
                //.asString()
                //.jsonPath().getInt("id");

        System.out.println(ss.getTitle());

        given().header("Authorization", "xxxxxxxxxxx")
                .auth()
                .basic("xxx","yy")
                .baseUri("rrrrr")
                .contentType(ContentType.XML).get(url).asString();

        RequestSpecification spec = new RequestSpecBuilder().addHeader("x_my", "dfs")
                .setAuth(new BasicAuthScheme()).setContentType(ContentType.JSON).build();

        given(spec).header("Auth", "ttt").get();
        given(spec).header("Auth", "iiii").get();

    }

}
