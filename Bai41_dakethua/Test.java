package Bai41_dakethua;

public class Test {
    public static void main(String[] args) {
        NguoiBaLan nbl = new NguoiBaLan("ronaldo", 1985);
        NguoiVietNam nvn = new NguoiVietNam("hieu", 2004);
        NguoiMy nm = new NguoiMy("Joseph", 900);

        nbl.xinChao();
        nvn.xinChao();
        nm.xinChao();
    }
}
