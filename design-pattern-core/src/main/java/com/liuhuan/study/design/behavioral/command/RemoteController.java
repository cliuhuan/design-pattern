package com.liuhuan.study.design.behavioral.command;

/**
 * ������
 */
public class RemoteController {

    // �� ��ť����������
    Command[] onCommands;
    Command[] offCommands;

    // ִ�г���������
    Command undoCommand;

    /**
     * ����������ɶ԰�ť��ʼ��
     */
    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * ��������Ҫ������
     *
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * ���¿���ť
     *
     * @param no
     */
    public void onButtonWasPushed(int no) {
        // �ҵ��㰴�µĿ��İ�ť�� �����ö�Ӧ����
        onCommands[no].execute();
        // ��¼��εĲ��������ڳ���
        undoCommand = onCommands[no];

    }

    /**
     * ���¹ذ�ť
     *
     * @param no
     */
    public void offButtonWasPushed(int no) {
        // �ҵ��㰴�µĹصİ�ť�� �����ö�Ӧ����
        offCommands[no].execute();
        // ��¼��εĲ��������ڳ���
        undoCommand = offCommands[no];

    }

    /**
     * ���³�����ť
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
