package com.liuhuan.study.design.behavioral.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * ������ģʽ
 */
public class Client {

    public static void main(String[] args) throws IOException {
        // a+b
        String expStr = getExpStr();
        // var {a=10, b=20}
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("��������" + expStr + "=" + calculator.run(var));
    }

    /**
     * ��ñ��ʽ
     *
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.print("��������ʽ��");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * ���ֵӳ��
     *
     * @param expStr
     * @return
     * @throws IOException
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("������" + String.valueOf(ch) + "��ֵ��");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
