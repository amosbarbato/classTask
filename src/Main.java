public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setMarca("Camaro");
        car.setAno(1985);
        car.setNomeCarro("Camaro SS 85");

        System.out.println(car.getMarca());
        System.out.println(car.getAno());
        System.out.println(car.getNomeCarro());
    }
}
