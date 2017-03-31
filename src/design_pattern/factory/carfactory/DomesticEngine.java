package design_pattern.factory.carfactory;

import common.LogOut;

/**
 * Created by zchao on 2017/3/31.
 */
public class DomesticEngine implements IEngine {

    @Override
    public void engine() {
        LogOut.print("DomesticEngine");
    }
}
