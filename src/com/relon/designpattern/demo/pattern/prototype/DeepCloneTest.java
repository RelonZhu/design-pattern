package com.relon.designpattern.demo.pattern.prototype;

public class DeepCloneTest {
    public static void main(String[] args) {
        // 数据初始化
        BaJie baJie = new BaJie();
        Tang master = new Tang();
        baJie.setName("猪八戒");
        baJie.setAddress("高老庄");
        master.setName("唐僧");
        master.setAddress("东土大唐");
        baJie.setMaster(master);
        // 浅拷贝引用类型属性
        BaJie newBaJie = baJie.clone();
        System.out.println("八戒真身：" + baJie);
        System.out.println("八戒分身：" + newBaJie);
        System.out.println("八戒分身和化身是否为一个师傅？" + (baJie.getMaster() == newBaJie.getMaster()));
        // 仅深拷贝(二级影分身)师傅属性——》师傅也跟着换了
        BaJie baJie1 = baJie.deepCloneMaster();
        System.out.println("二级影分身：" + baJie1);
        System.out.println("二级影分身之后是否还是同一个师傅？" + (baJie.getMaster() == baJie1.getMaster()));
        // 高阶二级影分身(很好的应对对象中有多个引用类型属性的情况)
        BaJie baJie2 = baJie.deepCloneSerial();
        System.out.println("高阶二级影分身：" + baJie2);
        System.out.println("高阶二级影分身之后是否还是同一个师傅？" + (baJie.getMaster() == baJie1.getMaster()));
    }
}
