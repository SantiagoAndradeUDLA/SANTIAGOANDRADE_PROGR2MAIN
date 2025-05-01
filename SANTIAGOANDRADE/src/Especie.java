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
        //De la especie seleccionada se imprime
        System.out.println(nombre);
        System.out.println(vida);
        System.out.println(clase_animal);
        System.out.println(precio);
        System.out.println(cantidad_dispo);
        System.out.println(cantidad_vendida);
    }

}

