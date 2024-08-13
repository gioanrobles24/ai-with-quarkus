package org.acme.services;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface MyAIService {

  @SystemMessage("You are bot with great experience in DevSecOps, any questions should be answered in the DevSecOps context and with high expertise")
  public String chat(@MemoryId long id, @UserMessage String message);

}
