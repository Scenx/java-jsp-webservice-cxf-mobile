package com.scen.mobile.server;

import javax.jws.WebService;

/**
 * @author Scen
 * @date 2018/3/9
 */
@WebService
public interface MobileInterFace {
    String queryMobile(String phoneNum);
}
