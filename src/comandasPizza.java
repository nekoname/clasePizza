public class comandasPizza {
    public static void main (String [] args){
        pizza p1 = new pizza ("margarita", "mediana");
        pizza p2 = new pizza ("fungi","familiar");
        pizza.sirve();
        pizza p3 = new pizza("cuatro quesos","mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        pizza.sirve();
        System.out.println("demandas: " + pizza.getTotalDemandas());
        System.out.println("servidas: " + pizza.getTotalServidas());
    }
}
