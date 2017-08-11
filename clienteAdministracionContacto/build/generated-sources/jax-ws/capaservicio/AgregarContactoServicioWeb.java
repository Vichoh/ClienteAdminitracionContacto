
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="empresaContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudadContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagenContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarContactoServicioWeb", propOrder = {
    "nombreContacto",
    "apellidoContacto",
    "telefonoContacto",
    "mailContacto",
    "empresaContacto",
    "ciudadContacto",
    "imagenContacto"
})
public class AgregarContactoServicioWeb {

    protected String nombreContacto;
    protected String apellidoContacto;
    protected String telefonoContacto;
    protected String mailContacto;
    protected String empresaContacto;
    protected String ciudadContacto;
    protected String imagenContacto;

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreContacto(String value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoContacto() {
        return apellidoContacto;
    }

    /**
     * Define el valor de la propiedad apellidoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoContacto(String value) {
        this.apellidoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * Define el valor de la propiedad telefonoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoContacto(String value) {
        this.telefonoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad mailContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContacto() {
        return mailContacto;
    }

    /**
     * Define el valor de la propiedad mailContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContacto(String value) {
        this.mailContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaContacto() {
        return empresaContacto;
    }

    /**
     * Define el valor de la propiedad empresaContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaContacto(String value) {
        this.empresaContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadContacto() {
        return ciudadContacto;
    }

    /**
     * Define el valor de la propiedad ciudadContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadContacto(String value) {
        this.ciudadContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenContacto() {
        return imagenContacto;
    }

    /**
     * Define el valor de la propiedad imagenContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenContacto(String value) {
        this.imagenContacto = value;
    }

}
