package capaNegocio;

import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



public class Notificacion {

	private int uid;
	private Date fecha;
	private String mensaje;
	private int uid_grupo;

	public int getUid() {
		return this.uid;
	}

	/**
	 * 
	 * @param uid
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	/**
	 * 
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void enviarNotificacion() {
		// TODO - implement notificacion.enviarNotificacion
		throw new UnsupportedOperationException();
	}

	public int getUid_grupo() {
		return this.uid_grupo;
	}

	/**
	 * 
	 * @param uid_grupo
	 */
	public void setUid_grupo(int uid_grupo) {
		this.uid_grupo = uid_grupo;
	}
        public String agregarNotificacion(Notificacion notificacion, Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = enviarNotificacionServicioWeb(notificacion.getMensaje(),grupo.getUid());
               return respuesta;
	}
        
        public List<Contacto>busquedanotificacionesLeidos(Notificacion notificacion)  {
               List<Contacto> lista = new ArrayList<Contacto>();
               String respuestaWS = busquedaContactosLeidos(notificacion.getUid());
               Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
            List<Contacto> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
	}

    private static String enviarNotificacionServicioWeb(java.lang.String mensajeNotificacion, int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.enviarNotificacionServicioWeb(mensajeNotificacion, uidGrupo);
    }

    private static String busquedaContactosLeidos(int uidNotificacion) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaContactosLeidos(uidNotificacion);
    }

        
  
}