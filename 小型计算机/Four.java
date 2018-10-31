package com.itic.exception;

import java.util.Scanner;

public class Four {
    /**
     * 全过程if (){...}else if(..){...}
     *
     * */
    public static void main(String[] args) {  //7 CLEAR NUM 1024 CHANGE 2 ADD\ NUM 100000 CHANGE 8 EQUAL 2040
        int a=0;
        int jinzhi=10;
        String yunsuan="ADD";
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    //n是输入几条指令
        for(int i=0;i<=n;i++){
            String s=sc.nextLine();   //此扫描器执行当前行，并返回跳过的输入信息。 此方法返回当前行的其余部分，不包括结尾处的行分隔符

            if(s.indexOf("CLAER")!=-1){  //s中有"CLAER"
                a=0;

            }else if(s.indexOf("EQUAL")!=-1){
                System.out.println(Integer.toString(a, jinzhi));
            }else if(s.indexOf("ADD")!=-1){
                yunsuan="ADD";
            }else if(s.indexOf("SUB")!=-1){
                yunsuan="SUB";
            }else if(s.indexOf("MUL")!=-1){
                yunsuan="MUL";
            }else if(s.indexOf("DIV")!=-1){
                yunsuan="DIV";
            }else if(s.indexOf("MOD")!=-1){
                yunsuan="MOD";
            }
            else if(s.indexOf("NUM")!=-1){   //
                //运算指令  num x的形式
                String num=s.split(" ")[1];    //num = 1024  split将字符串空格分离开，然后取出第二个元素送给num；
                int number=Integer.parseInt(num,jinzhi);   //parseInt(String str,int jz); 进制转换
                if(yunsuan.indexOf("ADD")!=-1){       //先把第一个数赋给a
                    a+=number;
                }else if(s.indexOf("SUB")!=-1){
                    a-=number;
                }else if(s.indexOf("MUL")!=-1){
                    a*=number;
                }else if(s.indexOf("DIV")!=-1){
                    a/=number;
                }else if(s.indexOf("MOD")!=-1){
                    a%=number;
                }

            }else if(s.indexOf("CHANGE")!=-1){
                //获取要转换的进制数
                jinzhi=Integer.parseInt(s.split(" ")[1]);
            }/*else if(s.indexOf("EQUAL")!=-1){
                System.out.println(Integer.toString(a, jinzhi));
            }else if(s.indexOf("ADD")!=-1){
                yunsuan="ADD";
            }else if(s.indexOf("SUB")!=-1){
                yunsuan="SUB";
            }else if(s.indexOf("MUL")!=-1){
                yunsuan="MUL";
            }else if(s.indexOf("DIV")!=-1){
                yunsuan="DIV";
            }else if(s.indexOf("MOD")!=-1){
                yunsuan="MOD";
            }*/
        }
    }
}
