package com.liuhuan.study.design.behavioral.command;

/**
 * �ص�����
 */
public class LightOffCommand implements Command {

    /**
     * ���
     */
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // ���ý����ߵķ���
        light.off();
    }

    @Override
    public void undo() {
        // ���ý����ߵķ���
        light.on();
    }
}
