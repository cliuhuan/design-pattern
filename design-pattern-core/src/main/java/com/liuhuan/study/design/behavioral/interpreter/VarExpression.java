package com.liuhuan.study.design.behavioral.interpreter;

import java.util.HashMap;

/**
 * �����Ľ�����
 */
public class VarExpression extends Expression {

    /**
     * key=a,key=b,key=c
     */
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * var ����{a=10, b=20} interpreter ���� �������ƣ����ض�Ӧֵ
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
