package mx.edu.utez.MarketPlace.Util;

public class Message {
    private  String  mensaje;
    private  boolean error;
    private  Object data;

    public Message(String mensaje, boolean error, Object data) {
        this.mensaje = mensaje;
        this.error = error;
        this.data = data;
    }

    public Message() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
