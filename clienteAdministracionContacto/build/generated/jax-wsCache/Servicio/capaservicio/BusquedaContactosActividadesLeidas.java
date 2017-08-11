
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaContactosActividadesLeidas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaContactosActividadesLeidas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidActividad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaContactosActividadesLeidas", propOrder = {
    "uidActividad"
})
public class BusquedaContactosActividadesLeidas {

    protected int uidActividad;

    /**
     * Obtiene el valor de la propiedad uidActividad.
     * 
     */
    public int getUidActividad() {
        return uidActividad;
    }

    /**
     * Define el valor de la propiedad uidActividad.
     * 
     */
    public void setUidActividad(int value) {
        this.uidActividad = value;
    }

}
