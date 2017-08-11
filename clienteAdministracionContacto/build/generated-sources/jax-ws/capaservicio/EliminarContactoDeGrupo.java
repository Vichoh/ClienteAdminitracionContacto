
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarContactoDeGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarContactoDeGrupo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidContacto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "eliminarContactoDeGrupo", propOrder = {
    "uidContacto",
    "uidGrupo"
})
public class EliminarContactoDeGrupo {

    protected int uidContacto;
    protected int uidGrupo;

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
