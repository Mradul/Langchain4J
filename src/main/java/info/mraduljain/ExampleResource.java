package info.mraduljain;

import info.mraduljain.service.ai.EmailPoemService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    private final EmailPoemService emailPoemService;

    public ExampleResource(EmailPoemService emailPoemService) {
        this.emailPoemService = emailPoemService;
    }

    public String hello() {
        emailPoemService.writeAPoem("topic", 10);
        return "Hello RESTEasy";
    }
    /*
    @GET
    @Path("/poem/{topic}")
    public String hello(String topic) {
        emailPoemService.writeAPoem(topic, 10);
        return "Hello RESTEasy";
    }

     */
}
