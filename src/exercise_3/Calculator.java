package exercise_3;

import java.util.LinkedList;
import java.util.List;

public class Calculator {
    LinkedList<Integer> result = new LinkedList<Integer>();
    int res = 0;
    public int calculate(char op, int a, int b) {
        if (op == '*') {
            result.add(a*b);
        }
        if (op == '-') {
            result.add(a-b);
        }
        if (op == '+') {
            result.add(a+b);
        }
        if (op == '<'){
            res = result.get(result.size()-2);
        }
        else {
            res =  result.get(result.size()-1);
        }
        return res;
    }
}
