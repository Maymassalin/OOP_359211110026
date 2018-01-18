package ooplap6;

public class mySuBffer {
    public static void main(String[] args) {
        // String Buffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0, 5,"University of");           // เปลียนข้อมูลตำแหน่งที่ 0-5
        System.out.println(buffer);
        System.out.println(buffer.reverse());                       // สลับข้อมูลจากหน้าไปหลัง-หลังไปหน้า
        buffer.setCharAt(0,'T');                           // เปลี่ยนข้อมูลตามตำแหน่งที่ต้องการ
        System.out.println(buffer);


    } // main
} // class}
