package C;

import B.B;

/**
 * Created by netghost on 3/14/16.
 */
public class C extends B {
    @Override
    public int diff(int x, int y) {
        return y-x;
    }
    public int mult(int x, int y){
        return x*y;
    }
}
