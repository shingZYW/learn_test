package jvm;

/**
 * ass we can!
 * created by shing
 * 2019-09-25 20:32
 */
public class StackDemo {

 public static void main(String[] args){


        long maxMemory = Runtime.getRuntime().maxMemory();//试图使用的最大的内存,1/4
        long tatolMemory = Runtime.getRuntime().totalMemory();//jvm的最大内存1/16,初始大小

        System.out.println("试图使用的最大内存:"+maxMemory+"字节"+"/n"+maxMemory/(double)1024/1024+"mb");
        System.out.println("jvm最大内存："+tatolMemory+"字节" +"/n "+tatolMemory/(double)1024/1024+"mb");


        //-Xmx1024 Xms 1024 -XX:PrintGCDetail
    }
}
