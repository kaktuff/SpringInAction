package com.springinaction.springidol;

import java.util.List;

public class Governor {
    private List<String> cityNames;

    public Governor() {
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }

    public List<String> getCityNames() {
        return cityNames;
    }
}
