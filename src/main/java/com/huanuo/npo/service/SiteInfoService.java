package com.huanuo.npo.service;

import com.huanuo.npo.Dao.SiteInfoDao;
import com.huanuo.npo.pojo.SiteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class SiteInfoService {
    public static final String STRING ="class java.lang.String";
    public static final String DOUBLE ="double";
    public static final String LONG ="long";
    public static final String INT ="int";
    public List<SiteInfo> readcsv(String csvfile) throws NoSuchMethodException{
        List<SiteInfo> siteinfo=new ArrayList<SiteInfo>();
        File inFile = new File(csvfile); // 读取的CSV文件
        String inString = "";
        BufferedReader reader = null;
        int table = 0;  //判断表头
        String[] TableTitle=new String[23];
        try {
            reader = new BufferedReader(new FileReader(inFile));
            //创建一个字符读取流对象FileReader(inFile)；传递给缓冲对象的构造函数
            while ((inString = reader.readLine()) != null) {
                if (table == 0) {
                    TableTitle = inString.split(",");
                    table++;
                } else {
                    String[] strArray = null;
                    strArray = inString.split(",");
                    //创建对象引用，获取属性值：
                    siteinfo.add(SetObj(strArray,TableTitle));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("没找到文件！");
        } catch (IOException ex) {
            System.out.println("读写文件出错！");
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return siteinfo;
    }
    public SiteInfo SetObj(String[] strArray,String[] TableTitle) throws NoSuchMethodException,
            SecurityException,
            IllegalArgumentException{
        SiteInfo obj=new SiteInfo();
        Field[] field = obj.getClass().getDeclaredFields();
        try {
            for(int i=0;i<TableTitle.length;i++ ) { //遍历表头
                for (int j = 0; j < field.length; j++) { // 遍历所有属性
                    String name = field[j].getName(); // 获取属性的名字
                    String type = field[j].getGenericType().toString(); // 获取属性的类型
                    if (TableTitle[i].equalsIgnoreCase(name)) {
                        field[j].setAccessible(true);
                        // 如果type是类类型，则前面包含"class "，后面跟类名
                        if (type.equals(STRING)){
                            if (strArray[i].equals(""))
                            {    //为空设为空字符串
                                field[j].set(obj,"empty");}
                            else {
                                field[j].set(obj,strArray[i]);}
                        }
                        if (type.equals(INT)){
                            //为空设为0
                            if (strArray[i].equals(""))
                            {    //为空设为空字符串
                                field[j].set(obj,0);}
                            else {
                                field[j].set(obj,Integer.valueOf(strArray[i]));
                        }}
                        if (type.equals(LONG)) {
                            if (strArray[i].equals("")){
                                //如果为空
                                if (name.equalsIgnoreCase("CI"))
                                {//如果是CI，计算得出结果
                                    long t = Long.parseLong(strArray[2]) * 256 + Long.parseLong(strArray[5]);
                                    field[j].set(obj, t);
                                }
                                else {
                                    //不是CI，空的填0
                                    field[j].set(obj, 0);
                                }
                        }
                            else{
                                field[j].set(obj, Long.parseLong(strArray[i]));
                            }
                        }

                        if (type.equals(DOUBLE)) {
                            if (strArray[i].equals(""))
                            {    //为空设为空字符串
                                field[j].set(obj,0);}
                            else {
                                field[j].set(obj, Double.parseDouble(strArray[i]));}
                        }
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return obj;
    }

}