package com.liuhuan.study.design.creational.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    /**
     * ��� - ��ʽ 1 ʹ��clone ����
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //������ɶԻ�����������(����)��String�Ŀ�¡
        deep = super.clone();
        //���������͵����ԣ����е�������
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    /**
     * ��� - ��ʽ2 ͨ����������л�ʵ�� (�Ƽ�)
     *
     * @return
     */
    public Object deepClone() {

        //����������
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //��ǰ��������Զ������ķ�ʽ���
            oos.writeObject(this);
            //�����л�
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //�ر���
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }

}
