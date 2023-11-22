package facade;

class SistemaVentas {

    private Juego juego;
    private Pago pago;
    private Descarga descarga;

    public SistemaVentas() {
        this.juego = new Juego();
        this.pago = new Pago();
        this.descarga = new Descarga();
    }

    public void venderProducto() {
        juego.buscarProducto();
        juego.reservarProducto();
        pago.cobrar();
        descarga.descarga();
    }

}
