public class Main{
    static int getBattery(int carga_inicial, int[] eventos){
        for (int i = 0; i < eventos.length; i++) {

            carga_inicial += eventos[i];

            if (carga_inicial > 100){
                carga_inicial = 100;
            }
        } return carga_inicial;
    }

    public static void main(String[]args){
        int carga_inicial = 50;
        int[] eventos = {10, -20, 61, -15};

        int porcentagemFinal = getBattery(carga_inicial, eventos);
        System.out.println(porcentagemFinal);
    }
}