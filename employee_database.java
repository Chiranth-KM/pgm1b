package LABpack;

import java.util.Scanner;

public class employee_database {
    public static void main(String[] args) {

        int []id=new int[]{1001,1002,1003,1004,1005,1006,1007};
        String []name= new String[]{"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
        String []dept= new String[]{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
        char []code=new char[]{'E','C','K','R','M','E','C'};
        int []basic=new int[]{20000,30000,10000,12000,50000,23000,29000};
        int []hra=new int[]{8000,12000,8000,6000,20000,9000,12000};
        int []it=new int[]{3000,9000,1000,2000,20000,4400,10000};

        System.out.println("Enter the Employee id:");
        Scanner sc=new Scanner(System.in);
        int eid= sc.nextInt();

        for (int i=0;i<id.length;i++)
        {
            if(eid==id[i])
            {
                char ecode=code[i];
                String work = null;
                int sal = 0;
                switch (ecode)
                {
                    case 'E':
                    {
                        work="Engineer";
                        sal=basic[i]+hra[i]+20000-it[i];
                    };break;
                    case 'C':
                    {
                        work="Consultant";
                        sal=basic[i]+hra[i]+32000-it[i];
                    };break;
                    case 'K':
                    {
                        work="Clerk";
                        sal=basic[i]+hra[i]+12000-it[i];
                    };break;
                    case 'R':
                    {
                        work="Receptionist";
                        sal=basic[i]+hra[i]+15000-it[i];
                    };break;
                    case 'M':
                    {
                        work="Manager";
                        sal=basic[i]+hra[i]+40000-it[i];
                    };break;
                }

                System.out.println("Emp no    Emp name    Department    Designation    Salary" );
                System.out.println(id[i]+"       "+name[i]+"         "+dept[i]+"          "+work+"      "+sal);
                
            }
        }

    }
}
