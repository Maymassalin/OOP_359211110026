package midterm;


        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class mid2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int id = 0;
        int salary = 0;
        int overtime = 0;

        System.out.print("รหัสพนักงาน : ");
        id = Integer.parseInt(reader.readLine());

        System.out.print("ชื่อ-สกุล : ");
        String name = reader.readLine();

        System.out.print("เงินเดือน : ");
        salary = Integer.parseInt(reader.readLine());

        System.out.print("โอที : ");
        overtime = Integer.parseInt(reader.readLine());

        getID(id);
        getName(name);
        getSalary(salary);
        getOverTime(overtime);
        calculateTax(salary,overtime);

    }

    private static void calculateTax(int salary, int overtime) {
        int total = salary+overtime;
        System.out.println("รวมรายได้ทั้งหมด : "+total);

        if (total >= 100000){
            int vat = (total*10)/100;
            System.out.println("ภาษีที่ต้องชำระ : "+vat);
        }
        else if (total >= 70000){
            int vat = (total*7)/100;
            System.out.println("ภาษีที่ต้องชำระ : "+vat);
        }
        else if (total >=50000){
            int vat = (total*5)/100;
            System.out.println("ภาษีที่ต้องชำระ : "+vat);
        }
        else if (total >=30000){
            int vat = (total*3)/100;
            System.out.println("ภาษีที่ต้องชำระ : "+vat);
        }
        else if (total <30000){
            int vat = (total*1)/100;
            System.out.println("ภาษีที่ต้องชำระ : "+vat);
        }

    }


    private static void getOverTime(int overtime) {
        System.out.println("โอที : "+overtime);
    }

    private static void getSalary(int salary) {
        System.out.println("เงินเดือน : "+salary);
    }

    private static void getName(String name) {
        System.out.println("ชื่อ-สกุล : " +name);
    }

    public static void getID(int id){
        System.out.println("-----------------------------------------------");
        System.out.println("รหัสพนักงาน : "+id);
    }


}
