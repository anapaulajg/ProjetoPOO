//package Conta;
//
//public class Main {
//    public static void main(String[] args) {
//        ICasa luz1 = new Luz();
//        ICasa luz2 = new Luz();
//        ICasa luz3 = new Luz();
//        ICasa luz4 = new Luz();
//        ICasa ar1 = new Ar();
//        ICasa ar2 = new Ar();
//
//        ICasa[] disp = {
//                luz1, luz2, luz3, luz4, ar1, ar2
//        };
//        Casa casa = new Casa(disp);
//
//        luz1.ligar();
//
//        for (int i=0; i<disp.length;i++) {
//            System.out.println(disp[i].status());
//        }
//        System.out.println();
//        ar1.ligar();
//        for (int i=0; i<disp.length;i++) {
//            System.out.println(disp[i].status());
//        }
//
//        casa.desligaTudo();
//        System.out.println();
//        for (int i=0; i<disp.length;i++) {
//            System.out.println(disp[i].status());
//        }
//    }
//}
