package com.meiyou.meetyoucost;

import android.util.Log;

/**
 * Created by Linhh on 17/5/27.
 */

public class Method {
    //方法参数
    private Object[] mParams;
    private String[] mParamsName;
    private String[] mParamsType;
    private String mMethodName;
    private int mSize;
    public Method(){

    }
    public void doLog(){
        Log.d("Method", "doLog");
    }
//    private Class<?>[] mAnnotations = ;
    public void setParamsSize(int size){
        mParams = new Object[size];
        mParamsName = new String[size];
        mParamsType = new String[size];
    }

    public String[] getParamsType() {
        return mParamsType;
    }

    public void addParamsType(int index, String paramsType) {
        this.mParamsType[index] = paramsType;
    }

    public Object[] getParams() {
        return mParams;
    }

    public void addParams(int index ,Object params) {
        this.mParams[index] = params;
    }

    public String[] getParamsName() {
        return mParamsName;
    }

    public void addParamsName(int index, String paramsName) {
        this.mParamsName[index] = paramsName;
    }

    public String getMethodName() {
        return mMethodName;
    }

    public void setMethodName(String methodName) {
        this.mMethodName = methodName;
    }

}
