package com.xiudun.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.xiudun.beans.Person;
import com.xiudun.util.DemoUtil;
//实现类
public class PersonServiceImpl implements PersonService {

	private Properties pro = new Properties();
	
	private String table = "d:/新建文件夹2/";
	@Override
	public void save(Person person) {
		if(person!=null) {
			try(OutputStream out = new FileOutputStream(table+DemoUtil.getFileName())){
				pro.put("id",DemoUtil.getKeyInt());
				pro.put("username",person.getUsername());
				pro.put("sex",person.getSex());
				pro.put("password",person.getPassword());
				pro.store(out, "");
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}


	public void findAll() {
		File file = new File(table);
		File[] files = file.listFiles();
		
		for(File f:files) {
			
			if(f.isFile()) {
				try(InputStream in = new FileInputStream(f)){
					pro.load(inStream);
					System.out.println("id:"+pro.getProperty("id")+",username:"+pro.getProperty("username")+","
					+"sex:"+pro.getProperty("sex")+",password:"+pro.getProperty("password"));
				}
			}
		}
	}
}
