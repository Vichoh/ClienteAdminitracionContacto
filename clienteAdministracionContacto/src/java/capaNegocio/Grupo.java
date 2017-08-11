package capaNegocio;


import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Grupo {

	private int uid;
	private String nombre;
	private String descripcion;
        private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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
        public String agregarGrupo(Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = agregarGrupoServicioWeb(grupo.getNombre(),grupo.getDescripcion());
               return respuesta;
	}
        public String editarGrupo(Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = editarGrupoServicioWeb(grupo.getUid(),grupo.getNombre(),grupo.getDescripcion());
               return respuesta;
	}
        public String eliminarGrupo(Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = eliminarGrupoServicioWeb(grupo.getUid());  
               return respuesta;
	}
        public String agregarContactoAGrupo(Contacto contacto,Grupo grupo) throws PersistentException_Exception {
               String respuesta = "";
               respuesta =agregarContactoAGrupo(contacto.getUid(),grupo.getUid());
               return respuesta;
	}
         public List<Grupo> busquedaAvanzadaGrupoCliente(Grupo grupo){
            String nombre="";
            String descripcion="";
           
            List<Grupo> lista = new ArrayList<Grupo>();
            
            if (grupo.getDescripcion()==null) {
                descripcion="";
                
            }
            if (grupo.getNombre()==null) {
                nombre="";
    
            }
            
            String respuestaWS = busquedaAvanzadaGrupo(grupo.getNombre(), grupo.getDescripcion() );
            Gson gson = new Gson();
            Grupo[] mcArray = gson.fromJson(respuestaWS, Grupo[].class);
            List<Grupo> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
            
        }
         
         public List<Grupo> busquedaSimpleGrupoCliente(String textoBusqueda) {
            List<Grupo> lista = new ArrayList<Grupo>();
            String respuestaWS = busquedaSimpleGrupo(textoBusqueda);
            
            Gson gson = new Gson();
            Grupo[] mcArray = gson.fromJson(respuestaWS, Grupo[].class);
            List<Grupo> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
        }
         
         

    private static String agregarContactoAGrupo(int uidContacto, int uidGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarContactoAGrupo(uidContacto, uidGrupo);
    }

    private static String agregarGrupoServicioWeb(java.lang.String nombreGrupo, java.lang.String descripcionGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarGrupoServicioWeb(nombreGrupo, descripcionGrupo);
    }

    private static String editarGrupoServicioWeb(int uidGrupo, java.lang.String nuevoNombreGrupo, java.lang.String nuevoDescripcionGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.editarGrupoServicioWeb(uidGrupo, nuevoNombreGrupo, nuevoDescripcionGrupo);
    }

    private static String eliminarGrupoServicioWeb(int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.eliminarGrupoServicioWeb(uidGrupo);
    }

    private static String busquedaContactoGrupos(int uidGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaContactoGrupos(uidGrupo);
    }

    private static String busquedaAvanzadaGrupo(java.lang.String nombre, java.lang.String descripcion) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaAvanzadaGrupo(nombre, descripcion);
    }

    private static String busquedaSimpleGrupo(java.lang.String textoBusqueda) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaSimpleGrupo(textoBusqueda);
    }

    

	
}