package com.liuhuan.study.design.behavioral.responsibilitychain;

public abstract class Approver {

    /**
     * ��һ��������
     */
    Approver approver;
    /**
     * ����
     */
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * ��һ��������
     *
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * ������������ķ������õ�һ������, ������������ɣ���˸÷������ɳ���
     *
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
