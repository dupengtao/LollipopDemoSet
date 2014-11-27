package com.dpt.demos.adapter;

/**
 * Created by dupengtao on 14-11-17.
 */
public class DemoAdapterItem {

    private String appName;
    private int appResIcon;

    public DemoAdapterItem(String appName, int appResIcon) {
        this.appName = appName;
        this.appResIcon = appResIcon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppResIcon() {
        return appResIcon;
    }

    public void setAppResIcon(int appResIcon) {
        this.appResIcon = appResIcon;
    }
}
