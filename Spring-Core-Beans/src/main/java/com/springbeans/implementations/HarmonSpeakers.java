package com.springbeans.implementations;

import com.springbeans.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class HarmonSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Harmon Speakers Boom Boom !!";
    }
}
