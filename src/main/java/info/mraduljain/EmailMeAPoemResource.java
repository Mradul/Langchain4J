package info.mraduljain;

import info.mraduljain.service.ai.EmailPoemService;
import info.mraduljain.service.tools.EmailService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/email-me-a-poem")
public class EmailMeAPoemResource {

    private final EmailPoemService service;

    public EmailMeAPoemResource(EmailPoemService service) {
        this.service = service;
    }

    @GET
    public String emailMeAPoem() {
        return service.writeAPoem("Quarkus", 4);
    }

    @GET
    @Path("{topic}")
    public String emailMeAPoem(String topic) {
        return service.writeAPoem(topic, 4);
    }
}