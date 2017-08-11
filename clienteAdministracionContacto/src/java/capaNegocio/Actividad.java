package capaNegocio;

import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Actividad {

	private int uid;
	private Date fecha;
	private String nombre;
	private String descripcion;
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

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
        public String agregarActividad(Actividad actividad, Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = agregarActividadServicioWeb(actividad.getNombre(),actividad.getDescripcion(),grupo.getUid());
               return respuesta;
	}
        public List<Contacto>busquedaActividadesLeidos(Actividad actividad)  {
               List<Contacto> lista = new ArrayList<Contacto>();
               String respuestaWS = busquedaContactosActividadesLeidas(actividad.getUid());
               Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
            List<Contacto> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
	}

   /* private static String agregarActividadAGrupo(int uidActividad, int uidContacto) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarActividadAGrupo(uidActividad, uidContacto);
    }*/

    private static String agregarActividadServicioWeb(java.lang.String nombreAct, java.lang.String descripcionAct, int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarActividadServicioWeb(nombreAct, descripcionAct, uidGrupo);
    }

    private static String busquedaContactosActividadesLeidas(int uidActividad) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaContactosActividadesLeidas(uidActividad);
    }
       

}