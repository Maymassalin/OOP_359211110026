package ooplap5;


        import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("Gift");
        System.out.println(myList);
        myList.add("Priew");
        myList.add("May");
        System.out.println(myList);
        System.out.println(myList.size());                  // นับจำนวนข้อมูล
        myList.add(2, "Hello");                 // แทรกข้อความตามตำแหน่งที่ต้องการ
        System.out.println(myList);
        myList.add(1, 100);
        System.out.println(myList);
        myList.set(0, "Sasiporn");                          // เปลี่ยนข้อมูล
        System.out.println(myList);
        myList.remove("Hello");                          // ลบข้อมูล
        System.out.println(myList);
        System.out.println(myList.indexOf(100));




    }//main
}//class
