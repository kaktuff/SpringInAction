package com.springinaction.springidol;

/*
* Класс, реализующий Singleton
* */
public class Stage {

    private Stage() {
    }

    private static class StageSingletonHolder{
        /*private static final Stage instance = new Stage();*/
        static Stage instance = new Stage();
    }

    public static Stage getStage(){
        return StageSingletonHolder.instance;
    }
}
