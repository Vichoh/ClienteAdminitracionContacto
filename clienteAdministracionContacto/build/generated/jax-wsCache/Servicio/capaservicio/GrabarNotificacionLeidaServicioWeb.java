
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabarNotificacionLeidaServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabarNotificacionLeidaServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidNotificacion_Leida" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="visto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabarNotificacionLeidaServicioWeb", propOrder = {
    "uidNotificacionLeida",
    "visto"
})
public class GrabarNotificacionLeidaServicioWeb {

    @XmlElement(name = "uidNotificacion_Leida")
    protected int uidNotificacionLeida;
    protected String visto;

    /**
     * Obtiene el valor de la propiedad uidNotificacionLeida.
     * 
     */
    public int getUidNotificacionLeida() {
        return uidNotificacionLeida;
    }

    /**
     * Define el valor de la propiedad uidNotificacionLeida.
     * 
     */
    public void setUidNotificacionLeida(int value) {
        this.uidNotificacionLeida = value;
    }

    /**
     * Obtiene el valor de la propiedad visto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisto() {
        return visto;
    }

    /**
     * Define el valor de la propiedad visto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisto(String value) {
        this.visto = value;
    }

}
