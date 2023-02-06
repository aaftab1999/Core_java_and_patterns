public class grosssalary {
    public static void main(String[] args) {
        int basicsalary=45000;
        double hra=0, da=0;

        if (basicsalary<=10000) {
            hra=basicsalary*0.20;
            da=basicsalary*0.8;
        } else if (basicsalary>10000 && basicsalary<=20000) {
            hra=basicsalary*0.25;
            da=basicsalary*0.9;
        }else{
            hra=basicsalary*0.3;
            da=basicsalary*0.95;
        }
        double grosssalary=basicsalary+hra+da;
        System.out.println(grosssalary);

    }
}
