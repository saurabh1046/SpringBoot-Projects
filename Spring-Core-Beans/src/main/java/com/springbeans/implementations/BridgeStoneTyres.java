package com.springbeans.implementations;

import com.springbeans.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "BridgeStone Tyres Rotating";
    }
}
