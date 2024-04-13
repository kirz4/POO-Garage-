import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int precoPorHora = 0; 

        do {
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcao) {
                case 1:
                    System.out.println("Digite o tipo do veículo: Motocicleta/Carro de Passeio/Caminhonete/Furgao");               
                    String tipo = scanner.nextLine();
                    System.out.println("Digite o peso do veículo: ");
                    int peso = scanner.nextInt();
                    scanner.nextLine(); 

                    if ("motocicleta".equalsIgnoreCase(tipo)) {
                        if (peso >= 100) {
                            precoPorHora = 2;
                        } else if (peso > 100 && peso < 200) {
                            precoPorHora = 4;
                        } else if (peso >= 300) {
                            precoPorHora = 10;
                        }
                        Veiculo moto = new Motocicleta(tipo, peso, precoPorHora);
                        System.out.println("Tipo do veículo: " + moto.getTipo());
                        System.out.println("Peso do veículo: " + moto.getPeso() + " kg");
                        System.out.println("Preço por hora: R$" + moto.getPrecoPorHora());
                    } else if ("carro de passeio".equalsIgnoreCase(tipo)) {
                        System.out.println("Digite o tipo do carro de passeio: Sedan/Hatch/SUV");
                        String tipoCarroPasseio = scanner.nextLine();
                        if ("sedan".equalsIgnoreCase(tipoCarroPasseio)) {
                            precoPorHora = 15;
                        } else if ("hatch".equalsIgnoreCase(tipoCarroPasseio)) {
                            precoPorHora = 13;
                        } else if ("suv".equalsIgnoreCase(tipoCarroPasseio)) {
                            precoPorHora = 20;
                        } 
                        Veiculo carroDePasseio = new CarroDePasseio(tipoCarroPasseio, peso, precoPorHora);
                        System.out.println("Tipo do veículo: " + carroDePasseio.getTipo());
                        System.out.println("Peso do veículo: " + carroDePasseio.getPeso() + " kg");
                        System.out.println("Preço por hora: R$" + carroDePasseio.getPrecoPorHora());
                    } else if ("caminhonete".equalsIgnoreCase(tipo)) {
                        if (peso < 3000) {
                            precoPorHora = 25;
                        } else if (peso >= 3100 && peso < 6000) {
                            precoPorHora = 50;
                        }
                        Veiculo caminhonete = new Caminhonete(tipo, peso, precoPorHora);
                        System.out.println("Tipo do veículo: " + caminhonete.getTipo());
                        System.out.println("Peso do veículo: " + caminhonete.getPeso() + " kg");
                        System.out.println("Preço por hora: R$" + caminhonete.getPrecoPorHora());

                    } else if ("furgao".equalsIgnoreCase(tipo)) {
                        System.out.println("Digite o volume do furgão: ");
                        int volume = scanner.nextInt();
                        scanner.nextLine(); 
                        if (volume > 18) {
                            System.out.println("Volume excedido");
                        } else {
                            if (peso <= 3000) {
                                precoPorHora = 25;
                            } else if (peso >= 3100 && peso < 6000) {
                                precoPorHora = 50;
                            } else {
                                System.out.println("Peso inválido");
                            }
                        }
                        Veiculo furgao = new Furgao(tipo, peso, precoPorHora, volume);
                        System.out.println("Tipo do veículo: " + furgao.getTipo());
                        System.out.println("Peso do veículo: " + furgao.getPeso() + " kg");
                        System.out.println("Preço por hora: R$" + furgao.getPrecoPorHora());
                        System.out.println("Volume do furgão: " + ((Furgao) furgao).getVolume() + " m³");
                    } else {
                        System.out.println("Tipo de veículo inválido");
                    }
                    break;
                    
                case 2:
                    System.out.println("Quantas horas ficou estacionado?");
                    int horas = scanner.nextInt();
                    int valorTotal = horas * precoPorHora; 
                    System.out.println("Valor total: R$" + valorTotal);
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 2);
        
        scanner.close();
    }
}