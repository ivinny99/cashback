import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = input.nextLine();
        System.out.print("Qual sua idade? ");
        byte idade = input.nextByte();
        System.out.print("Qual valor da sua compra? ");
        float valorDaCompra = input.nextFloat();

        if (idade >= 21 && valorDaCompra < 1000){
            double cash = valorDaCompra * 0.05;
            double result = valorDaCompra - cash;
            System.out.printf("Certo %s, devido a sua idade ser de %d anos seu desconto na compra de %.2fR$ sera de %.2fR$ resultando num valor total a pagar de %.2f ",nome,idade,valorDaCompra,cash,result);
        }
        else if (idade < 21 && valorDaCompra <1000 ) {
            double cash = valorDaCompra * 0.07;
            double result = valorDaCompra - cash;
            System.out.printf("Certo %s, devido a sua idade ser de %d anos seu desconto na compra de %.2fR$ sera de %.2fR$ resultando num valor total a pagar de %.2f ",nome,idade,valorDaCompra,cash,result);

        }
        else if (idade >= 21 && valorDaCompra >1000 ) {
            double cash = valorDaCompra 0.07;
            double result = valorDaCompra - cash;
            System.out.printf("Certo %s, devido a sua idade ser de %d anos seu desconto na compra de %.2fR$ sera de %.2fR$ resultando num valor total a pagar de %.2f ",nome,idade,valorDaCompra,cash,result);
        }
        else if (idade < 21 && valorDaCompra >1000) {
            double cash = valorDaCompra0.10;
            double result = valorDaCompra - cash;
            System.out.printf("Certo %s, devido a sua idade ser de %d anos seu desconto na compra de %.2fR$ sera de %.2fR$ resultando num valor total a pagar de %.2f ",nome,idade,valorDaCompra,cash,result);
        }
    }

}