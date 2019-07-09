package com.xiudun.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.zip.CRC32;

public class DemoUtil {
	//��ȡUUID
	public static String getKey() {
		return UUID.randomUUID().toString();
	}
	
	//��ȡ����
	public static int getKeyInt() { 
		CRC32 crc = new CRC32();
		crc.update(UUID.randomUUID().toString().getBytes());
		return (int) crc.getValue();
	}
	
	//��ȡ����
	public static String getDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	//��ȡ�ļ�����
	public static String getFileName() {
		return UUID.randomUUID().toString()+"propeties";
	}
	
	
}
