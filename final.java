
/*
Nama : Abid Asshidiqie Nugraha
No. Bp : 1911082014
 */
package Tugas_TEO_PBO;

final class Final {
    public final void Test(){
        System.out.println("test 123 coba-coba");
    }
}

class Testing extends Final{ //Akan menghasilkan error karena
                             //class yang di inherit/wariskan itu bersifat final
    public static void main(String[] args) {
        Final F = new Final(); //Tidak bisa gunakan method karena method & class 
                               //yg diwariskan/inherit bersifat final
        System.out.print("Sekarang saya lagi");F.Test();
    }
}
