public class pizza {

    static String estado ="";
    static String medida ="";
    static String tipo ="";
    static int totalDemandas = 0;
    static int totalServidas = 0;
    public pizza(String tipoPizza, String medidaPizza) {
        pizza.medida =  medidaPizza;
        pizza.tipo = tipoPizza;
        pizza.estado = "demandada";
        totalDemandas++;
    }

    @Override
    public String toString() {
        return "pizza " + pizza.tipo + " " + pizza.medida + ", " + pizza.estado;
    }

    public static int getTotalDemandas(){
        return totalDemandas;
    }
    public static int getTotalServidas(){
        return totalServidas;
    }
    public static void sirve(){
        totalServidas ++;

    }

}
