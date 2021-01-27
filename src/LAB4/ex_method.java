package LAB4;

public class ex_method {

    public  static void B(int num) { // no return type
        System.out.println("Hello B " +num);
    } //B
    public static void main(String[] args) {
        System.out.println("Hello Main");
        // call A ()
        A();
        A();
        // call B ()
        B(5); // ใส่เลข 5 แล้ว มันจะใส่ให้เป็น num:5 โดยอัตโนมัติ
        // call C()
        int result = C(5,5); // ใส่เลข 5 แล้ว มันจะใส่ให้เป็น x:5 โดยอัตโนมัติ , แล้วใส่เลข 5 แล้ว มันจะใส่ให้เป็น y:5 โดยอัตโนมัติ
        System.out.println(result);
        System.out.println(C(10,10));
    }// main


    public static void A () {  //no return type, no parameter
        // statement or method body
        System.out.println("Hello A");

    } //A
    public static int C (int x ,int y){
        System.out.println("Hello C");
        return  x + y;
    } //C


} //class