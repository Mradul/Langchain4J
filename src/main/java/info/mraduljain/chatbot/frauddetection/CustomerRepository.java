package info.mraduljain.chatbot.frauddetection;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

    @Tool("get the customer name for the given customerId")
    public String getCustomerName(long id) {
        return find("id", id).firstResult().name;
    }

}
