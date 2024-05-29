package mercado_IUD;

public class Main {

	public static void main(String[] args) {   
		
		//Crear productos
		
		Producto yogurt = new Producto("Yogurt", 1000);
		Producto arroz = new Producto("Arroz", 2000);
		Producto frijoles = new Producto("Frijoles", 2500);
		Producto leche = new Producto("Leche", 1500);
		Producto pan = new Producto("Pan", 1200);
		Producto huevos = new Producto("Huevos", 3000);
		Producto carneRes = new Producto("Carne de res", 8000);
		Producto pollo = new Producto("Pollo", 6000);
		Producto aceite = new Producto("Aceite", 3500);
		Producto azucar = new Producto("Azúcar", 1800);

		
		// Crear clientes
        Cliente clienteSantiago = new Cliente("Santiago");
        clienteSantiago.agregarProducto(azucar);
        clienteSantiago.agregarProducto(huevos);
        clienteSantiago.agregarProducto(yogurt);
        
        Cliente clienteSebas = new Cliente("Sebastián");
        clienteSebas.agregarProducto(leche);
        clienteSebas.agregarProducto(arroz);
        clienteSebas.agregarProducto(frijoles);
        
        Cliente clienteRichard = new Cliente("Richard");
        clienteRichard.agregarProducto(carneRes);
        clienteRichard.agregarProducto(azucar);
        clienteRichard.agregarProducto(aceite);
        clienteRichard.agregarProducto(pollo);
        clienteRichard.agregarProducto(pan);
   
        // Crear cajeras
        Cajera cajeraManu = new Cajera("Cajera Manuela");
        cajeraManu.run(clienteSantiago);
        cajeraManu.run(clienteSebas);
        Cajera cajeraMila = new Cajera("Cajera Camila");
        cajeraMila.run(clienteRichard);
        


	}

	
}
