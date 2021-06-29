package Stack;
public class TumpukanApp {
    public static void main(String[] args){
        Tumpukan tumpuk= new Tumpukan(10);
        tumpuk.baca();
        tumpuk.push(1);
        tumpuk.baca();
        tumpuk.push(2);
        tumpuk.baca();
        tumpuk.push(3);
        tumpuk.baca();
        long nilai_teratas = tumpuk.pop();
        System.out.println("nilai teratas ="+nilai_teratas);
        System.out.println("");
        tumpuk.push(83);
        tumpuk.baca();
        tumpuk.push(27);
        tumpuk.baca();
        long nilai2 = tumpuk.pop();
        System.out.print("nilai2 =" +nilai2);
        System.out.println("");
        long nilai3 = tumpuk.pop();
        System.out.println("nilai3 ="+nilai3);
        System.out.println("");
        tumpuk.baca();
}
