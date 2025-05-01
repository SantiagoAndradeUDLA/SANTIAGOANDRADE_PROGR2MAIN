public class Especie {
    public String nombre;
    public int vida;
    public String clase_animal;
    public double precio;
    public int cantidad_dispo;
    public int cantidad_vendida;


    public void EspCacatua(String nombres,int vidas,String clase_animals,double precio, int cantidad_dispos, int cantidad_vendidas){
//EJEMPLO
        this.nombre="Cacatua Blanca";
        this.vida=5;
        this.clase_animal="ave";
        this.precio=12.5;
        this.cantidad_dispo=2;
        this.cantidad_vendida=5;
    }

    public void EspBoa(String nombres,int vidas,String clase_animals,double precio, int cantidad_dispos, int cantidad_vendidas){
//EJEMPLO
        this.nombre="Cacatua Blanca";
        this.vida=5;
        this.clase_animal="ave";
        this.precio=12.5;
        this.cantidad_dispo=2;
        this.cantidad_vendida=5;
    }

    public void EspTiti(String nombres,int vidas,String clase_animals,double precio, int cantidad_dispos, int cantidad_vendidas){
//EJEMPLO
        this.nombre="Cacatua Blanca";
        this.vida=5;
        this.clase_animal="ave";
        this.precio=12.5;
        this.cantidad_dispo=2;
        this.cantidad_vendida=5;
    }
    public void EspGuacamaya(String nombres,int vidas,String clase_animals,double precio, int cantidad_dispos, int cantidad_vendidas){
//EJEMPLO
        this.nombre="Cacatua Blanca";
        this.vida=5;
        this.clase_animal="ave";
        this.precio=12.5;
        this.cantidad_dispo=2;
        this.cantidad_vendida=5;
    }


    public void mostrar(){
        System.out.println(this.nombre);
        System.out.println(this.vida);
        System.out.println(this.clase_animal);
        System.out.println(this.precio);
        System.out.println(this.cantidad_dispo);
        System.out.println(this.cantidad_vendida);
    }

}

