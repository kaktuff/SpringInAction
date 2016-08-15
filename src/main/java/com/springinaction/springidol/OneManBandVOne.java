package com.springinaction.springidol;

import java.util.Collection;

public class OneManBandVOne implements Performer{
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBandVOne() {
    }

    public void perform() throws Exception {
        for (Instrument instrument:instruments){
            instrument.play();
        }
    }
}
