
package com.example.kangjisung.likeroom;

/**
 * Created by stories2 on 2016. 12. 25..
 */

public class DefineManager {
    public final static int showNoticeList = 0, showStoreList = 1,
            shopNameSavedPoint = 0,shopAddressSavedPoint = 1, shopPhoneNumberSavedPoint = 2,
            shopLatitudeSavedPoint = 3, shopLongtitudedSavedPoint = 4, shopOpenTimeSavedPoint = 5,
            shopCloseTimeSavedPoint = 6, shopIdSavedPoint = 7,

            androidVersionLollipop = 22,

            databaseShopIdSavedPoint = 0, databaseShopNameSavedPoint = 1, databaseShopAddressSavedPoint = 2,
            databaseShopPhoneNumberSavedPoint = 3, databaseShopOpenTimeSavedPoint = 4,
            databaseShopCloseTimeSavedPoint = 5, databaseShopLatitudeSavedPoint = 6,
            databaseShopLongtitudedSavedPoint = 7,

            noticeShopIdSavedPoint = 0, noticeIdSavedPoint = 1, noticeTitleSavedPoint = 2,
            noticeBodySavedPoint = 3, noticeStartDateSavedPoint = 4, noticeCloseDateSavedPoint = 5
            ;
    public final static float googleMapCameraZoomScale = 17;

    public final static String[] selectedShopInfoDataKey = {
            "shopName", "shopAddress", "shopPhoneNumber", "shopLatitude", "shopLongtitude", "shopOpenTime", "shopCloseTime", "shopId"
    };
}