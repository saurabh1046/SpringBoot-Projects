package com.springbeans.implementations;

import com.springbeans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyres implements Tyres {

    @Override
    public String rotate() {
        return "MRF Tyres Rotating";
    }
}
