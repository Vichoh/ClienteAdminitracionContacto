
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarGrupoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarGrupoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidGrupo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevoNombreGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoDescripcionGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarGrupoServicioWeb", propOrder = {
    "uidGrupo",
    "nuevoNombreGrupo",
    "nuevoDescripcionGrupo"
})
public class EditarGrupoServicioWeb {

    protected int uidGrupo;
    protected String nuevoNombreGrupo;
    protected String nuevoDescripcionGrupo;

    /**
     * Obtiene el valor de la propiedad uidGrupo.
     * 
     */
    public int getUidGrupo() {
        return uidGrupo;
    }

    /**
     * Define el valor de la propiedad uidGrupo.
     * 
     */
    public void setUidGrupo(int value) {
        this.uidGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoNombreGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombreGrupo() {
        return nuevoNombreGrupo;
    }

    /**
     * Define el valor de la propiedad nuevoNombreGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombreGrupo(String value) {
        this.nuevoNombreGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoDescripcionGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoDescripcionGrupo() {
        return nuevoDescripcionGrupo;
    }

    /**
     * Define el valor de la propiedad nuevoDescripcionGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoDescripcionGrupo(String value) {
        this.nuevoDescripcionGrupo = value;
    }

}
