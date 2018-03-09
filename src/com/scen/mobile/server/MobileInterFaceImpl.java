package com.scen.mobile.server;

import com.scen.mobile.MobileCodeWSSoap;

/**
 * @author Scen
 * @date 2018/3/9
 */
public class MobileInterFaceImpl implements MobileInterFace {

    MobileCodeWSSoap mobileClient;
    @Override
    public String queryMobile(String phoneNum) {

        return mobileClient.getMobileCodeInfo(phoneNum,"");
    }

    public MobileCodeWSSoap getMobileClient() {
        return mobileClient;
    }

    public void setMobileClient(MobileCodeWSSoap mobileClient) {
        this.mobileClient = mobileClient;
    }
}
