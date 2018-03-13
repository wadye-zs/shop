package com.shop.util;

import java.util.Calendar;

public class NowDate {

	public static String date(){
		   Calendar ca = Calendar.getInstance();
		      int year = ca.get(Calendar.YEAR);//获取年份
		      int month=ca.get(Calendar.MONTH)+1;//获取月份
		      int day=ca.get(Calendar.DATE);//获取日
		     String Date =year+"-"+month+"-"+day;
		     return Date;
	}
}
