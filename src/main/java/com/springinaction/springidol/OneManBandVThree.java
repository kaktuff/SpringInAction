package com.springinaction.springidol;

import java.util.Properties;

public class OneManBandVThree implements Performer{

    private Properties instruments;
    public OneManBandVThree() {
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    public void perform() throws Exception {
        for (String key : instruments.stringPropertyNames()){
            //System.out.println(key + " : ");
            String instrument = instruments.getProperty(key);
            // нельзя это оставить, потому что теперь это просто String
            // пример, ддя того, чтобы props для Spring попоробовать
            System.out.println(key + " => " + instrument);
            //instrument.play();
        }
//        for (String key:instruments.keySet()){
//            System.out.println(key + " : ");
//            Instrument instrument = instruments.get(key);
//            instrument.play();
//        }
    }
}
