package SistemaVeiculos;

public class Teste {
    public static void print(Veiculo veiculo){
        veiculo.mover();
        veiculo.abastecer();
        System.out.println(veiculo.toString());
    }
    public static void main(String[] args){

        Aviao av1 = new Aviao("embraer", "eb-01", 2000, 20000);
        print(av1);

        CarroEletrico ce1 = new CarroEletrico("byd", "dolphin", 70, 24);
        print(ce1);

    }
}
