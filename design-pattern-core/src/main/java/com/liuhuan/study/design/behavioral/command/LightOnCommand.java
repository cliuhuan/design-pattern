package com.liuhuan.study.design.behavioral.command;

/**
 * ��������
 */
public class LightOnCommand implements Command {

    /**
     * ���
     */
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //���ý����ߵķ���
        light.on();
    }

    @Override
    public void undo() {
        //���ý����ߵķ���
        light.off();
    }

}
