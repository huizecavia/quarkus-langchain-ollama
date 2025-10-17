package io.matthijs;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface Assistant {

    @UserMessage("What can I do in Leersum?.")
    String greeting();
}