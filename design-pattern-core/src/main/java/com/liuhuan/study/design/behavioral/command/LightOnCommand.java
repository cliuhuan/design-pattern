package com.liuhuan.study.design.behavioral.command;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {

    /**
     * 电灯
     */
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }

}
