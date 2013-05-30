package org.qsoft.training.tdd;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/30/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {
    public static int methodAdd(String string) {
        int numberReturn = 0;
        if (string == null || string.equals("")) {
            numberReturn = 0;
        } else {
            try {
                String[] arrayString = string.split(",");
                int index = arrayString.length;
                for (int i = 0; i < index; i++) {
                    numberReturn += Integer.valueOf(arrayString[i]);
                }
            } catch (Exception e) {
                numberReturn = 0;
            }
        }

        return numberReturn;
    }
}
