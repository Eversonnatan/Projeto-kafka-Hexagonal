package com.natan.hexagonal.adapters.out;

import com.natan.hexagonal.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {

   @Autowired
   private KafkaTemplate<String, String> KafkaTemplate;

    @Override
    public void send(String cpf) {
        KafkaTemplate.send("tp-cpf-validation", cpf);

    }
}
