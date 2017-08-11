
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaContactosLeidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaContactosLeidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidNotificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaContactosLeidos", propOrder = {
    "uidNotificacion"
})
public class BusquedaContactosLeidos {

    protected int uidNotificacion;

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

}
