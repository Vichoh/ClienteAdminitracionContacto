package capaNegocio;

import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Contacto {

	private int uid;
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private String imagenes;
	private String ciudad;
	private String empresa;

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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return this.mail;
	}

	/**
	 * 
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getImagenes() {
		return this.imagenes;
	}

	/**
	 * 
	 * @param imagenes
	 */
	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	/**
	 * 
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	/**
	 * 
	 * @param empresa
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
        /**
	 * 
	 * @param contacto
	 */
	public String agregarContacto(Contacto contacto) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = agregarContactoServicioWeb(contacto.getNombre(),contacto.getApellido(),contacto.getTelefono(),contacto.getMail(),
                       contacto.getEmpresa(),contacto.getCiudad(),contacto.getImagenes());
               return respuesta;
	}

	/**
	 * 
	 * @param contacto
	 */
	public String eliminarContacto(Contacto contacto) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = eliminarContactoServicioWeb(contacto.getUid());  
               return respuesta;
	}

	/**
	 * 
	 * @param contacto
	 */
	public String editarContacto(Contacto contacto) throws PersistentException_Exception {
               String respuesta = "";
               respuesta = editarContactoServicioWeb(contacto.getUid(),contacto.getNombre(),contacto.getApellido(),contacto.getTelefono(),contacto.getMail(),
                       contacto.getEmpresa(),contacto.getCiudad(),contacto.getImagenes());
               return respuesta;
	}
        public List<Contacto> busquedaAvanzadaCliente(Contacto contacto){
            String nombre="";
            String apellido="";
            String telefono="";
            String mail="";
            String empresa="";
            String ciudad="";
            List<Contacto> lista = new ArrayList<Contacto>();
            
            if (contacto.getApellido()==null) {
                apellido="";
                
            }
            if (contacto.getNombre()==null) {
                nombre="";
                
            }
            if (contacto.getTelefono()==null) {
                telefono="";
                
            }
            if (contacto.getMail()==null) {
                mail="";
            }
            if(contacto.getEmpresa()==null){
               empresa="";
            }
            if(contacto.getCiudad()==null){
               ciudad=""; 
            }
            String respuestaWS = busquedaAvanzada(contacto.getNombre(), contacto.getApellido(), 
                    contacto.getTelefono(), contacto.getMail(),contacto.getEmpresa(),contacto.getCiudad());
            Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
            List<Contacto> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
            
        }
        
        public List<Contacto> busquedaSimpleCliente(String textoBusqueda){
            List<Contacto> lista = new ArrayList<Contacto>();
            String respuestaWS = busquedaSimple(textoBusqueda);
            
            Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuestaWS, Contacto[].class);
            List<Contacto> mcList = Arrays.asList(mcArray);
            lista=mcList;
            return lista;
        }


    private static String agregarContactoServicioWeb(java.lang.String nombreContacto, java.lang.String apellidoContacto, java.lang.String telefonoContacto, java.lang.String mailContacto, java.lang.String empresaContacto, java.lang.String ciudadContacto, java.lang.String imagenContacto) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarContactoServicioWeb(nombreContacto, apellidoContacto, telefonoContacto, mailContacto, empresaContacto, ciudadContacto, imagenContacto);
    }

    private static String editarContactoServicioWeb(int uidContacto, java.lang.String nuevoNombreContacto, java.lang.String nuevoApellidoContacto, java.lang.String nuevoTelefonoContacto, java.lang.String nuevoMailContacto, java.lang.String nuevoCiudadContacto, java.lang.String nuevoEmpresaContacto, java.lang.String nuevoImagenContacto) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.editarContactoServicioWeb(uidContacto, nuevoNombreContacto, nuevoApellidoContacto, nuevoTelefonoContacto, nuevoMailContacto, nuevoCiudadContacto, nuevoEmpresaContacto, nuevoImagenContacto);
    }

    private static String eliminarContactoServicioWeb(int uidContacto) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.eliminarContactoServicioWeb(uidContacto);
    }

    private static String busquedaGruposContacto(int uidContacto) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaGruposContacto(uidContacto);
    }

    private static String busquedaSimple(java.lang.String textoBusqueda) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaSimple(textoBusqueda);
    }

    private static String busquedaAvanzada(java.lang.String nombre, java.lang.String apellido, java.lang.String telefono, java.lang.String mail, java.lang.String ciudad, java.lang.String empresa) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaAvanzada(nombre, apellido, telefono, mail, ciudad, empresa);
    }
     
	
	
}