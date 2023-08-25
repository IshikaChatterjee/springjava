package api.example.myfirstapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hellocontroller {
    @GetMapping("/")
    public Response getMessage() {
        Response response = new Response();
        response.setMessage("Response from, Spring Boot!");
        response.setParameter2("Another parameter value");
        response.setParameter3(12345);
        response.setParameter4(true);
        return response;
    }
}
