public class Manusia {
    private String nama;
    public Manusia(String nama){
        this.nama = nama;
    }
    //overloading(1)
    public void makan(){
        System.out.println("Manusia harus makan.");
    }
    //overloading(2)
    public void makan(String makanan){
        System.out.println(getNama() + " lagi makan " + makanan);
    }
    //induk override
    public void tidur(int jam){
        System.out.println(this.nama + " tidur pukul " + jam);
    }
    public String getNama() {
        return this.nama;
    }
}
