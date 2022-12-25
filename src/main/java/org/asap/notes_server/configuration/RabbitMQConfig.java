package org.asap.notes_server.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("notes-exchange");
    }

    @Bean
    public Queue queue() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding orderStatusChangedQueueBinding(final FanoutExchange fanoutExchange, final Queue queue) {
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
}
