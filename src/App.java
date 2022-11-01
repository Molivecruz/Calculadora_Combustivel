import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Programa feito para calcular o consumo de combustível
        Scanner tc = new Scanner(System.in);

        System.out.print("Informe a capacidade do tanque do veículo em litros: ");
        int capacidade = tc.nextInt();
        System.out.print("Informe a autonomia urbana: ");
        int autoUrbana = tc.nextInt();
        System.out.print("Informe a autonomia em rodovia: ");
        int autoRodovia = tc.nextInt();
        System.out.print("Informe a distância em Km: ");
        int kmRodado = tc.nextInt();
        System.out.print("Informe o tipo de perimetro que você vai utilizar para sua viagem: (U) - Urbano / (R) - Rodovia. ");
        String perimetro = tc.next();
        System.out.print("Informe o preço do combustível em sua cidade: ");
        double combustivel = tc.nextDouble();

        tc.close();

        int rendUrbano = autoUrbana * capacidade;
        System.out.println("Seu veículo consegue percorrer " + rendUrbano + " km com um tanque em perímetro urbano.");

        int rendRodovia = autoRodovia * capacidade;
        System.out.println("Seu veículo consegue percorrer " + rendRodovia + " km com um tanque em rodovias.");

        //Formula para saber a quantidade de litrso necessária para percorrer uam determinada distância
        //Distancia (km) / consumo médio (km/l)

        int litrosUrb = kmRodado / autoUrbana;
        int litrosRod = kmRodado / autoRodovia;
        double totalUrb = litrosUrb * combustivel;
        double totalRod = litrosRod * combustivel;
        int tanqueU = (int) (Math.ceil((litrosUrb / capacidade) + 0.5));
        int tanqueR = (int) (Math.ceil((litrosRod / capacidade) + 0.5));

        if ("U" .equalsIgnoreCase(perimetro)) {
            System.out.println("Para chegar no seu destino que fica a " + kmRodado + " km de distância em perimetro urbano, seu veículo vai utilizar " + litrosUrb + " litros de combustível, o valor gasto será de " + totalUrb + " reais");
            System.out.print("Total de tanques utilizados: " + (tanqueU));
        } else if ("R" .equalsIgnoreCase(perimetro)) {
            System.out.println("Para chegar no seu destino que fica a " + kmRodado + " km de distância em perimetro de rodovia, seu veículo vai utilizar " + litrosRod + " litros de combustível, o valor gasto será de " + totalRod + " reais");
            System.out.print("Total de tanques utilizados: " + (tanqueR));
        } else {
            System.out.print("Perimetro inválido");
        }
        
    }
}
