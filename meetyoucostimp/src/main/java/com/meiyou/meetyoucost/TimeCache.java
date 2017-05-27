package com.meiyou.meetyoucost;

import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * 巴掌
 * https://github.com/JeasonWong
 */

public class TimeCache {

  public static Map<String, Long> sStartTime = new HashMap<>();
  public static Map<String, Long> sEndTime = new HashMap<>();

  public static void setStartTime(String methodName, long time) {

    sStartTime.put(methodName, time);
  }

  public static void setEndTime(String methodName, long time) {

    sEndTime.put(methodName, time);
  }


  public static String getCostTime(String methodName) {
    long start = sStartTime.get(methodName);
    long end = sEndTime.get(methodName);
    return "method: " + methodName + " cost " + Long.valueOf(end - start)/(1000*1000) + "  ms";
  }


  public static void setView(View view){
    Log.d("test","setview is called");
    if(view != null){
      Log.d("test",view.toString());
    }
  }

}
