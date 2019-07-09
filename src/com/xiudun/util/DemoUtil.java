package com.xiudun.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.zip.CRC32;

public class DemoUtil {
	//获取UUID
	public static String getKey() {
		return UUID.randomUUID().toString();
	}
	
	//获取数字
	public static int getKeyInt() { 
		CRC32 crc = new CRC32();
		crc.update(UUID.randomUUID().toString().getBytes());
		return (int) crc.getValue();
	}
	
	//获取日期
	public static String getDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	//获取文件名称
	public static String getFileName() {
		return UUID.randomUUID().toString()+"propeties";
	}
	
	
}
