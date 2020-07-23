package com.liuhuan.study.design.behavioral.command;

/**
 * 关电视
 */
public class TVOffCommand implements Command {

    /**
     * 电视
     */
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.on();
    }
}
