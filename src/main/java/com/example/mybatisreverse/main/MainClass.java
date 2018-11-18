package com.example.mybatisreverse.main;

import com.alibaba.druid.support.json.JSONUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author:zhanlei
 * @date:2018/6/5 17:54
 */
public class MainClass {

    public static byte[] nodePageFileCmdBytes = {0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) throws ParseException {
//        Map<String, String> map = new HashMap<>();
//        map.put("detailMessage","详细信息");
//        map.put("contactName","联系人");
//        map.put("phone","13245878965");
//        map.put("timeStamp","1535101888585");

//        Date date = new Date();
//        System.out.println(date.);
//        System.out.println("getDate()"+ date.getDate());
//        System.out.println("getDay" + date.getDay());
//        System.out.println("getTime"+ date.getTime());
        //getNowDate();
//        long date1 = Long.valueOf(dateToStamp("2018-09-02 16:20:24"));
//        long date2 = Long.valueOf(dateToStamp("2018-09-02 16:25:24"));
//        System.out.println("1 ="+date1 + "  2=" +date2);
//        System.out.println("date1-date2= "+(date1-date2));
//        System.out.println(dateToStamp("2018-04-25 14:30:45"));
//        System.out.println(dateToStamp("2018-04-25 14:31:20"));
//        System.out.println(new Date(1524797593000L));
//        System.out.println(new Date(1524797626000L));
//        System.out.println(String.valueOf(RechargeStatusEnum.STATUS_SUCCUSS));
//        Long l1 = 12L;
//        Long l2 = 5L +7L;
//        if (l1.equals(l2)) {
//            System.out.println("=================================");
//        }
        String abd = new String(nodePageFileCmdBytes);
        abd.indexOf("asd");
        System.out.println("==============="+abd);
        //
        //System.out.println(new Date(1514950094000L));
//        Date date = new Date();//取时间
//        System.out.println(date.after(new Date(1528371324000l)));
//        System.out.println("date时间戳：" + date.getTime());
//        BigDecimal totalNum1 = new BigDecimal(4);
//        BigDecimal totalAmout1 = new BigDecimal(3);
//        BigDecimal result1 = totalNum1.divide(totalAmout1,2,BigDecimal.ROUND_HALF_UP);
//
//        BigDecimal totalNum2 = new BigDecimal(12);
//        BigDecimal totalAmout2 = new BigDecimal(10);
//        BigDecimal result2 = totalNum2.divide(totalAmout2,2,BigDecimal.ROUND_HALF_UP);
//
//        System.out.println("result1="+result1);
//        System.out.println("result2="+result2);
//        int comp = result1.compareTo(result2);
//        boolean flag = false;
//        if (result1.compareTo(result2)==1)
//            flag = true;
//        System.out.println("true or false:"+flag);
//        System.out.println(new Date(1524017247000L));
//        Byte a = 1;
//        Integer b = 1;
//        if (a.equals(b)) {
//            System.out.println("true");
//        }
//        System.out.println("false");
//        List list1 =new ArrayList();
//        list1.add("1111");
//        list1.add("2222");
//        list1.add("3333");
//
//        List list2 =new ArrayList();
//        list2.add("3333");
//        list2.add("4444");
//        list2.add("5555");
//
//        list1.retainAll(list2);
//        System.out.println("=======================");
//        System.out.println(JSONUtils.toJSONString(list1));
//        System.out.println("=======date" + new Date().getTime());
//        BigDecimal l = new BigDecimal("0.16");
//        BigDecimal l2 = new BigDecimal("1");
//        int i = l.compareTo(l2);
//        System.out.println("==========================");
//        System.out.println("l/l2 = "+l.divide(l2));
//        String[][] strs ={{"企划-福利费","2,11,12,13"},
//                {"企化-活动经费","2,11,12,13"},
//                {"企划-团建费","1,2,3,4,5,6,7,8,9,10,11,12,13,14"},{"企划-培训费","2,11,12,13"},
//                {"变动-差旅费","1,8,6,7,9,10,11,12,13"},{"变动-招待费","1,8,7,6,9,10,11,12,13"},
//                {"变动-礼品费","1,8,7,6,9,10,11,12,13"},{"变动-交通费","1,2,3,4,5,6,7,8,9,10,11,12,13,14"},
//                {"变动-通讯费","1,2,10,11,12,13"},{"变动-快递费","1,2,3,4,5,6,7,8,9,10,11,12,13,14"},
//                {"变动-劳务费","2,11,12,13"},{"变动-会务费","2,10,11,12,13"},
//                {"变动-展会费","8,11,12,13"},{"变动-宣传推广费","8,11,12,13"},
//                {"变动-技术服务费","6,9,10,11,12,13"},{"",""},
//                {"变动-网络费","2,10,11,12,13"},{"变动-其他","1,2,3,7,11,12,13"},
//                {"固定-房屋租赁费","2,10"},{"固定-水电费","2,10"},
//                {"固定-物业管理费","2,10"},{"固定-办公费","2,10,11"},
//                {"固定-办公用品","2,10,11"},{"固定-办公话费","2,10,11"},
//                {"固定装修费","2"},{"产能-租赁费","11"},
//                {"产能-网络费","11"},{"产能-外包费","11"},{"产能-软件采购","11"},{"产能-硬件采购","11"}};
//
//        System.out.println("=====================================");
//        System.out.println(strs[0][1]);
//        String endTime = "2018-07-25";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse(endTime);
//        System.out.println("=============================");
//        System.out.println(date);
    }

    public static void getNowDate() {
        Date date = new Date();//取时间
        System.out.println(date.after(new Date(1528371324000l)));
        System.out.println("date时间戳：" + date.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE, 1);//把日期往后增加一天.整数往后推,负数往前移动
        Date date1 = calendar.getTime();   //这个时间就是日期往后推一天的结果
        System.out.println(date);
        System.out.println(date1);
    }

    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;

    }
}
