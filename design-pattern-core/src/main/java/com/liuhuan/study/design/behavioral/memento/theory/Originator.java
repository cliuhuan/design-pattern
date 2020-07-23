package com.liuhuan.study.design.behavioral.memento.theory;

public class Originator {

    /**
     * ״̬��Ϣ
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * ��дһ�����������Ա���һ��״̬���� Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * ͨ������¼���󣬻ָ�״̬
     *
     * @param memento
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
