package com.springinaction.springidol;

import java.util.Map;

public class OneManBandVTwo implements Performer{
    public OneManBandVTwo() {
    }
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() throws Exception {
        for (String key:instruments.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
