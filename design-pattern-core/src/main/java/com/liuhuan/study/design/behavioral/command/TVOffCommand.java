package com.liuhuan.study.design.behavioral.command;

/**
 * �ص���
 */
public class TVOffCommand implements Command {

    /**
     * ����
     */
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // ���ý����ߵķ���
        tv.off();
    }

    @Override
    public void undo() {
        // ���ý����ߵķ���
        tv.on();
    }
}
