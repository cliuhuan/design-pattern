package com.liuhuan.study.design.behavioral.interpreter;

import java.util.HashMap;

/**
 * �ӷ�������
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * �������
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) �� ���� left ���ʽ��Ӧ��ֵ a = 10
        //super.right.interpreter(var): ����right ���ʽ��Ӧֵ b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
