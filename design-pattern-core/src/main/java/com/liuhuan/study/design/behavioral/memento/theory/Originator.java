package com.liuhuan.study.design.behavioral.memento.theory;

public class Originator {

    /**
     * 状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 编写一个方法，可以保存一个状态对象 Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，恢复状态
     *
     * @param memento
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
