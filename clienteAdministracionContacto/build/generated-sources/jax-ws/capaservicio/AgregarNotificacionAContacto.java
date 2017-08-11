
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarNotificacionAContacto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarNotificacionAContacto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidNotificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="uidGrupo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarNotificacionAContacto", propOrder = {
    "uidNotificacion",
    "uidGrupo"
})
public class AgregarNotificacionAContacto {

    protected int uidNotificacion;
    protected int uidGrupo;

    /**
     * Obtiene el valor de la propiedad uidNotificacion.
     * 
     */
    public int getUidNotificacion() {
        return uidNotificacion;
    }

    /**
     * Define el valor de la propiedad uidNotificacion.
     * 
     */
    public void setUidNotificacion(int value) {
        this.uidNotificacion = value;
    }

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

}
