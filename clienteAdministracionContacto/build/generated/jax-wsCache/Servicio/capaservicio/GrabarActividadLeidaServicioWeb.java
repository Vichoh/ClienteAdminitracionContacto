
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabarActividadLeidaServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabarActividadLeidaServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidActividad_Leida" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "grabarActividadLeidaServicioWeb", propOrder = {
    "uidActividadLeida",
    "visto"
})
public class GrabarActividadLeidaServicioWeb {

    @XmlElement(name = "uidActividad_Leida")
    protected int uidActividadLeida;
    protected String visto;

    /**
     * Obtiene el valor de la propiedad uidActividadLeida.
     * 
     */
    public int getUidActividadLeida() {
        return uidActividadLeida;
    }

    /**
     * Define el valor de la propiedad uidActividadLeida.
     * 
     */
    public void setUidActividadLeida(int value) {
        this.uidActividadLeida = value;
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
