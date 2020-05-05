public class Mahasiswa extends Manusia implements Liburan {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, double ipk){
        super(nama);
        this.nim = nim;
        this.ipk = ipk;
    }

    //setter
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    //method
    void belajar(){
        System.out.println(getNama() + " lagi belajar.");
    }
    //getter
    public double getIpk() {
        return this.ipk;
    }
    public String getNim() {
        return nim;
    }

    @Override
    public void tidur(int jam) {
        super.tidur(jam);
        System.out.println(super.getNama() + " tidur pukul " + jam);
    }

    @Override
    public void berenang(String gaya) {
        System.out.println(super.getNama() + " berenang gaya " + gaya);
    }
    @Override
    public void mendaki(String gunung) {
        System.out.println(super.getNama() + " mendaki gunung " + gunung);
    }
}
