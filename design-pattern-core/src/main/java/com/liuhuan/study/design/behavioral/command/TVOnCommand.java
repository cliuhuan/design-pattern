package com.liuhuan.study.design.behavioral.command;

/**
 * 开电视
 */
public class TVOnCommand implements Command {

    /**
     * 电视
     */
    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}
