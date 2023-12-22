package info.mraduljain.service.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import info.mraduljain.service.tools.EmailService;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(
        tools = EmailService.class
)
public interface EmailPoemService {

    @SystemMessage("You are a professional poet")
    @UserMessage("""
                Write a poem about {topic}. The poem should be {lines} lines long. Then send this poem by email. 
            """)
    String writeAPoem(String topic, int lines);
}