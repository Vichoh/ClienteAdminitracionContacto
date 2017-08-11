
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidContacto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevoNombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoApellidoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoTelefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoMailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoCiudadContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoEmpresaContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoImagenContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarContactoServicioWeb", propOrder = {
    "uidContacto",
    "nuevoNombreContacto",
    "nuevoApellidoContacto",
    "nuevoTelefonoContacto",
    "nuevoMailContacto",
    "nuevoCiudadContacto",
    "nuevoEmpresaContacto",
    "nuevoImagenContacto"
})
public class EditarContactoServicioWeb {

    protected int uidContacto;
    protected String nuevoNombreContacto;
    protected String nuevoApellidoContacto;
    protected String nuevoTelefonoContacto;
    protected String nuevoMailContacto;
    protected String nuevoCiudadContacto;
    protected String nuevoEmpresaContacto;
    protected String nuevoImagenContacto;

    /**
     * Obtiene el valor de la propiedad uidContacto.
     * 
     */
    public int getUidContacto() {
        return uidContacto;
    }

    /**
     * Define el valor de la propiedad uidContacto.
     * 
     */
    public void setUidContacto(int value) {
        this.uidContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoNombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombreContacto() {
        return nuevoNombreContacto;
    }

    /**
     * Define el valor de la propiedad nuevoNombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombreContacto(String value) {
        this.nuevoNombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoApellidoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoApellidoContacto() {
        return nuevoApellidoContacto;
    }

    /**
     * Define el valor de la propiedad nuevoApellidoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoApellidoContacto(String value) {
        this.nuevoApellidoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoTelefonoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoTelefonoContacto() {
        return nuevoTelefonoContacto;
    }

    /**
     * Define el valor de la propiedad nuevoTelefonoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoTelefonoContacto(String value) {
        this.nuevoTelefonoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoMailContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoMailContacto() {
        return nuevoMailContacto;
    }

    /**
     * Define el valor de la propiedad nuevoMailContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoMailContacto(String value) {
        this.nuevoMailContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoCiudadContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoCiudadContacto() {
        return nuevoCiudadContacto;
    }

    /**
     * Define el valor de la propiedad nuevoCiudadContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoCiudadContacto(String value) {
        this.nuevoCiudadContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoEmpresaContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoEmpresaContacto() {
        return nuevoEmpresaContacto;
    }

    /**
     * Define el valor de la propiedad nuevoEmpresaContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoEmpresaContacto(String value) {
        this.nuevoEmpresaContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoImagenContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoImagenContacto() {
        return nuevoImagenContacto;
    }

    /**
     * Define el valor de la propiedad nuevoImagenContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoImagenContacto(String value) {
        this.nuevoImagenContacto = value;
    }

}
