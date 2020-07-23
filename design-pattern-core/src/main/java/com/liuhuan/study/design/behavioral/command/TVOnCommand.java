package com.liuhuan.study.design.behavioral.command;

/**
 * ������
 */
public class TVOnCommand implements Command {

    /**
     * ����
     */
    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // ���ý����ߵķ���
        tv.on();
    }

    @Override
    public void undo() {
        // ���ý����ߵķ���
        tv.off();
    }
}
