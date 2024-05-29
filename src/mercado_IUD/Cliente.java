package mercado_IUD;

import java.util.ArrayList;
import java.util.List;
import mercado_IUD.Producto;

class Cliente {
    private String nombre;
    private List<Producto> productos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    

    public List<Producto> getProductos() {
        return productos;
    }

	public String getNombre() {
		return nombre;
	}
    
}

