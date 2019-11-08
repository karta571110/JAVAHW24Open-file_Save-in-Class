package com.example.lib;

public class Studentgrade {
    String name[] = new String[6];
    String Calculus[] = new String[6];
    String IntroductiontoComputer[] = new String[6];
    String programming[] = new String[6];
    String StudentData;
    String Grade;
    int peoplenumber;

    public void getStudentdata(int i, String studentData) {
        StudentData = studentData;
        int Fd = StudentData.indexOf(",");
        name[i] = StudentData.substring(0, Fd);
        Grade = StudentData.substring(Fd + 1);
        int FgradeD = Grade.indexOf(",");
        int EgradeD = Grade.lastIndexOf(",");
        Calculus[i] = Grade.substring(0, FgradeD);
        IntroductiontoComputer[i] = Grade.substring((FgradeD + 1), EgradeD);
        programming[i] = Grade.substring(EgradeD + 1);
        peoplenumber++;

    }

    public void PrintAllData(){
        for(int i=0;i<peoplenumber;i++){
            System.out.println("姓名:"+name[i]+"\t微積分成績:"+Calculus[i]+"\t計算機概論成績:"+IntroductiontoComputer[i]+"\t程式設計成績:"+programming[i]);
        }
    }


}
