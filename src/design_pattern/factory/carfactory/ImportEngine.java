package design_pattern.factory.carfactory;

import common.LogOut;

/**
 * Created by zchao on 2017/3/31.
 */
public class ImportEngine implements IEngine {

    @Override
    public void engine() {
        LogOut.print("ImportEngine");
    }
}
