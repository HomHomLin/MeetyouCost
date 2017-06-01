package com.meiyou.meetyoucost;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * 巴掌
 * https://github.com/JeasonWong
 */

public class TimeCache {

  public static void onMethodEnd(Object obj, String name, Object[] objects, String rtype){
    Log.d("test","onMethodEnd is called");
  }

  public static Object onMethodEnter(Object obj, String name, Object[] objects, String rtype){
    Log.d("test","onMethodEnter is called");
    return null;
  }

}
