package com.liuhuan.study.design.behavioral.command;

/**
 * ��������ӿ�
 */
public interface Command {

    /**
     * ִ�ж���(����)
     */
    void execute();

    /**
     * ��������(����)
     */
    void undo();
}
