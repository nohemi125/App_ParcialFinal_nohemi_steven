
package parcial_final;


public class cls_beneficiario {
     private String str_id;
    private String str_nombre;
    private int int_puntaje; 
    private String str_estado;

    public cls_beneficiario(String str_id, String str_nombre, int int_puntaje, String str_estado) {
        this.str_id = str_id;
        this.str_nombre = str_nombre;
        this.int_puntaje = int_puntaje;
        this.str_estado = str_estado;
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public int getInt_puntaje() {
        return int_puntaje;
    }

    public void setInt_puntaje(int int_puntaje) {
        this.int_puntaje = int_puntaje;
    }

    public String getStr_estado() {
        return str_estado;
    }

    public void setStr_estado(String str_estado) {
        this.str_estado = str_estado;
    }

   public void actualizarDatos(String nuevoNombre, int nuevoPuntaje, String nuevoEstado) {
        this.str_nombre = nuevoNombre;
        this.int_puntaje = nuevoPuntaje;
        this.str_estado = nuevoEstado;
    }

    void asignarTurno() {
        throw new UnsupportedOperationException("");
    }

    void entregarBeneficio() {
        throw new UnsupportedOperationException(""); 
    }

    String getnombre() {
        throw new UnsupportedOperationException("."); 
    }

    Object getpuntaje() {
        throw new UnsupportedOperationException(""); 
    }

    String getestado() {
        throw new UnsupportedOperationException(""); 
    }
    
    
    
}
