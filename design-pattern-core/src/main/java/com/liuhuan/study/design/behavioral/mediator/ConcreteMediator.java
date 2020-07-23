package com.liuhuan.study.design.behavioral.mediator;

import java.util.HashMap;

/**
 * ������н�����
 */
public class ConcreteMediator extends Mediator {
    /**
     * �������е�ͬ�¶���
     */
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * �����н��ߵĺ��ķ��� 1. ���ݵõ���Ϣ����ɶ�Ӧ���� 2. �н��������������Э�����������ͬ�¶����������
     *
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        //�������ӷ�������Ϣ
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(colleagueMap.get(interMap
                    .get("CoffeeMachine")))).StartCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV)(colleagueMap.get(interMap.get("TV")))).StopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains)(colleagueMap.get(interMap.get("Curtains"))))
                .UpCurtains();
            //���TV������Ϣ
        } else if (colleagueMap.get(colleagueName) instanceof TV) {

            //������Դ�����������Ϣ�����ﴦ��...
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }

    }

    @Override
    public void SendMessage() {

    }

}
