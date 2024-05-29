package mercado_IUD;

import java.util.List;


class Cajera {
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public void run(Cliente cliente) {
        System.out.println("La cajera " + nombre + " está procesando la compra.");
        long inicio = System.currentTimeMillis();
        calcularTotalCompra(cliente);
      
        long fin = System.currentTimeMillis();
        System.out.println("La cajera " + nombre + " ha terminado de procesar la compra. Tiempo: " + (fin - inicio) + " milisegundos");
    }

    // Método para calcular el total de la compra del cliente
    public void calcularTotalCompra(Cliente cliente) {
        List<Producto> productos = cliente.getProductos();
        double total = 0;
        
        System.out.println("Sus productos son " );
        
        for (Producto producto : productos) { 
        	System.out.println(producto.getNombre());
            total += producto.getPrecio();
        }
        System.out.println("El total de los produtos de " + cliente.getNombre() + " es igual a " + total);
    }
}

