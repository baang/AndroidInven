package com.example.kangjisung.likeroom.NetworkManager;

import android.util.Log;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stories2 on 2017. 2. 4..
 */


public class NetworkModule {
    HttpCommunicationProcess httpCommunicationProcess;

    String hostName = "lamb.kangnam.ac.kr:4200", apiName = "/Smoothie/2", logCatTag = "test";

    public NetworkModule() {
    }

    public void TestConnection() {
        httpCommunicationProcess = new HttpCommunicationProcess();
        try {
            Log.d(logCatTag, "Result: " + httpCommunicationProcess.execute("http://" + hostName).get());
        }
        catch (Exception err) {
            Log.d(logCatTag, "Result: Fail");
        }
    }

    public List<String[]> LoadAllStoreInfo(){
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        String[] eachStoreInfoData = new String[8];
        List<String[]> allStoreInfoData = new ArrayList<String[]>();
        int i;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/LoadAllStoreInfo/").get();
            Log.d(logCatTag, responseRawData);
            //JSONArray serverResponseArrayData = new JSONArray("{'test':1}");
            JSONObject jsonObject = new JSONObject(responseRawData);
            //Log.d(logCatTag, "test: " + jsonObject.getJSONObject("0"));
            int indexOfStoreNumber = 0;
            while(true) {
                if(jsonObject.isNull("" + indexOfStoreNumber)) {
                    break;
                }
                JSONObject indexOfZeroStoreInfoData = jsonObject.getJSONObject("" + indexOfStoreNumber);
                allStoreInfoData.add(new String[]{
                        indexOfZeroStoreInfoData.getString("매장번호"),
                        indexOfZeroStoreInfoData.getString("주소"),
                        indexOfZeroStoreInfoData.getString("위도"),
                        indexOfZeroStoreInfoData.getString("경도"),
                        indexOfZeroStoreInfoData.getString("이름"),
                        indexOfZeroStoreInfoData.getString("전화번호"),
                        indexOfZeroStoreInfoData.getString("매장 개장 시간"),
                        indexOfZeroStoreInfoData.getString("매장 마감 시간")
                });
                Log.d(logCatTag, "매장 번호: " + indexOfZeroStoreInfoData.getString("매장번호") +
                        "\n전화번호: " + indexOfZeroStoreInfoData.getString("전화번호") +
                        "\n국가코드: " + indexOfZeroStoreInfoData.getString("국가코드") +
                        "\n정보 변경 날짜: " + indexOfZeroStoreInfoData.getString("정보 변경 날짜") +
                        "\n경도: " + indexOfZeroStoreInfoData.getString("경도") +
                        "\n위도: " + indexOfZeroStoreInfoData.getString("위도") +
                        "\n매장 마감 시간: " + indexOfZeroStoreInfoData.getString("매장 마감 시간") +
                        "\n소개글: " + indexOfZeroStoreInfoData.getString("소개글") +
                        "\n매장 개장 시간: " + indexOfZeroStoreInfoData.getString("매장 개장 시간") +
                        "\n서비스 탈퇴 여부: " + indexOfZeroStoreInfoData.getString("서비스 탈퇴 여부") +
                        "\n주소: " + indexOfZeroStoreInfoData.getString("주소") +
                        "\n이름: " + indexOfZeroStoreInfoData.getString("이름") +
                        "\n서비스 가입 날짜: " + indexOfZeroStoreInfoData.getString("서비스 가입 날짜"));
                indexOfStoreNumber = indexOfStoreNumber + 1;
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in LoadAllStoreInfo: " + err.getMessage());
        }
        return allStoreInfoData;
    }

    public void AddToStoreAsNewMember(int customerId, int targetStoreId) {
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/AddToStoreAsNewMember/?customerId=" + customerId
                                                                + "&storeId=" + targetStoreId).get();
            Log.d(logCatTag, responseRawData);
            JSONObject jsonObject = new JSONObject(responseRawData);
            if(jsonObject.getString("Result").equals("Ok")) {
                Log.d(logCatTag, "ok");
            }
            else{
                Log.d(logCatTag, "fail");
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in AddToStoreAsNewMember: " + err.getMessage());
        }
    }

    public void DelMemberFromStore(int uniqueRegisteredId) {
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/DelMemberFromStore/?customerAndStoreRegisteredId=" + uniqueRegisteredId).get();
            Log.d(logCatTag, responseRawData);
            JSONObject jsonObject = new JSONObject(responseRawData);
            if(jsonObject.getString("Result").equals("Ok")) {
                Log.d(logCatTag, "ok");
            }
            else {
                Log.d(logCatTag, "fail");
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in DelMemberFromStore: " + err.getMessage());
        }
    }

    public void GetStoreAndCustomerRegisteredInfo(int customerId) {
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/GetStoreAndCustomerRegisteredInfo/?customerId=" + customerId).get();
            Log.d(logCatTag, responseRawData);
            JSONObject jsonObject = new JSONObject(responseRawData);
            try{
                if(jsonObject.isNull("Result")) {
                    Log.d(logCatTag, "ok");
                }
                else {
                    Log.d(logCatTag, "fail");
                }
            }
            catch (Exception err) {
                Log.d(logCatTag, "Error in GetStoreAndCustomerRegisteredInfo: " + err.getMessage());
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in GetStoreAndCustomerRegisteredInfo: " + err.getMessage());
        }
    }

    public void InsertMileageLog(int uniqueRegisteredId, int mileageSize) {
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/InsertMileageLog/?customerAndStoreRegisteredId=" + uniqueRegisteredId +
                                                                "&mileageSize=" + mileageSize + "&changeDate=0000-00-00").get();
            Log.d(logCatTag, responseRawData);
            JSONObject jsonObject = new JSONObject(responseRawData);
            if(jsonObject.getString("Result").equals("Ok")) {
                Log.d(logCatTag, "ok");
            }
            else {
                Log.d(logCatTag, "fail");
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in InsertMileageLog: " + err.getMessage());
        }
    }

    public void GetMileageSum(int uniqueRegisteredId) {
        httpCommunicationProcess = new HttpCommunicationProcess();
        String responseRawData = null;
        try {
            responseRawData = httpCommunicationProcess.execute("http://" + hostName + apiName + "/GetMileageSum/?customerAndStoreRegisteredId=" + uniqueRegisteredId).get();
            Log.d(logCatTag, responseRawData);
            JSONObject jsonObject = new JSONObject(responseRawData);
            if(jsonObject.isNull("Result")) {
                Log.d(logCatTag, "ok");
            }
            else {
                Log.d(logCatTag, "fail");
            }
        }
        catch (Exception err) {
            Log.d(logCatTag, "Error in GetMileageSum: " + err.getMessage());
        }
    }

    ////내 정보 등록
    public void InsertNewCustomerInfo(String customerName,String customerPhone,String customerEmail,String customerBirth){
        httpCommunicationProcess=new HttpCommunicationProcess();
        String responseRawDate=null;
        try{
            responseRawDate=httpCommunicationProcess.execute("http://"+hostName+apiName+"/InsertNewCustomerInfo/?name="+customerName+"&phone="+customerPhone+"&email="+customerEmail+"&birthday="+customerBirth+"").get();
            Log.d(logCatTag,responseRawDate);
            JSONObject jsonObject=new JSONObject(responseRawDate);
            if(jsonObject.getString("Result").equals("OK")){
                Log.d(logCatTag, "ok");
            }
            else Log.d(logCatTag, jsonObject.getString("Result"));

        }catch (Exception err){
            Log.d(logCatTag,"Error in InsertNewCustomerInfo: "+err.getMessage());
        }
    }
    ///////////내 고유코드 받기
    public void LoadCustomerInfo(String customerEmail){
        httpCommunicationProcess=new HttpCommunicationProcess();
        String responseRawDate=null;
        String uniCode=null;//고유코드
        try{
            responseRawDate=httpCommunicationProcess.execute("http://"+hostName+apiName+"/LoadCustomerInfo/?email="+customerEmail+"").get();
            Log.d(logCatTag,responseRawDate);
            JSONObject jsonObject=new JSONObject(responseRawDate);
            uniCode=jsonObject.getString("회원번호");
            Log.d(logCatTag,uniCode);
        }catch (Exception err){
            Log.d(logCatTag,"Error in LoadCustomerInfo: "+err.getMessage());
        }
    }
    /////쿠폰 사용기능


    public void UseTargetCoupon(String customerAndStoreId,String updateDate,String couponId){
        httpCommunicationProcess=new HttpCommunicationProcess();
        String responseRawDate=null;
        try{
            responseRawDate=httpCommunicationProcess.execute("http://"+hostName+apiName+"/UseTargetCoupon/?customerAndStoreId="+customerAndStoreId+"&updateDate="+updateDate+"&couponId="+couponId+"").get();
            Log.d(logCatTag,responseRawDate);
            JSONObject jsonObject=new JSONObject(responseRawDate);
            if(jsonObject.getString("Result").equals("OK")){
                Log.d(logCatTag, "ok");
            }
            else Log.d(logCatTag, jsonObject.getString("Result"));
        }catch (Exception err){
            Log.d(logCatTag,"Error in UseTargetCoupon: "+err.getMessage());
        }
    }
    /////공지 리스트


    public void ShowTargetStoreNoticeList(String shopId){
        httpCommunicationProcess=new HttpCommunicationProcess();
        String responseRawDate=null;
        try{
            responseRawDate=httpCommunicationProcess.execute("http://"+hostName+apiName+"/ShowTargetStoreNoticeList/?shopId="+shopId+"").get();
            Log.d(logCatTag,responseRawDate);
        }catch (Exception err){
            Log.d(logCatTag,"Error in ShowTargetStoreNoticeList: "+err.getMessage());
        }
    }



}
