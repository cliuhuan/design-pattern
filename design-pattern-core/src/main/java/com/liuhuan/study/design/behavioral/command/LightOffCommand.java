package com.liuhuan.study.design.behavioral.command;

/**
 * 关灯命令
 */
public class LightOffCommand implements Command {

    /**
     * 电灯
     */
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
