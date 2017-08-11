
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaGruposContacto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaGruposContacto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidContacto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaGruposContacto", propOrder = {
    "uidContacto"
})
public class BusquedaGruposContacto {

    protected int uidContacto;

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

}
