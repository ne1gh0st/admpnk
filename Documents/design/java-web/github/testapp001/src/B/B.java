package B;

import A.A;

/**
 * Created by netghost on 3/14/16.
 */
public class B implements A {
    @Override
    public int sum(int x, int y) {
        return  x+y;  }
    public int diff(int x, int y){
        return x-y;   }
}
