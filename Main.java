public class Main {
    public static void main(String args[]){
        Manusia human = new Manusia("Mina");
        Mahasiswa student = new Mahasiswa("Rina","123180169",3.45);
        System.out.println("Nama : " + student.getNama());
        System.out.println("NIM : " + student.getNim());
        System.out.println("IPK : " + student.getIpk());

        student.setIpk(3.30);
        System.out.println();
        System.out.println("Perubahan IPK dan NIM");
        System.out.println("IPK : " + student.getIpk());
        student.setNim("124190001");
        System.out.println("NIM : " + student.getNim());

        System.out.println();
        student.tidur(8); // overriding

        System.out.println();
        student.berenang("kupu-kupu"); // implements
        student.mendaki("Tidar"); //implements

        System.out.println();
        human.makan(); //overloading
        human.makan("Seblak"); //overloading


    }

}
